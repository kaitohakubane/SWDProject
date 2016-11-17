package com.shoppee.controller;

import com.shoppee.common.constants.PageConstant;
import com.shoppee.common.constants.ParamConstant;
import com.shoppee.controller.interfaces.BillDetailControllerInterface;
import com.shoppee.entity.*;
import com.shoppee.service.interfaces.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by HuanTNH on 9/27/2016.
 */
@RestController
public class BillDetailController implements BillDetailControllerInterface {

    @Autowired
    private BillDetailServiceInterface billDetailServiceInterface;

    @Autowired
    private BillServiceInterface billServiceInterface;

    @Autowired
    private AccountServiceInterface accountServiceInterface;

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @Autowired
    private SaleProductServiceInterface saleProductServiceInterface;

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.BILLDETAIL_PAGE_URL, method = RequestMethod.POST)
    public List<BillDetailEntity> findBillDetailByBillId(@RequestParam(value = ParamConstant.BILL_ID) int billId) {
        BillEntity billEntity = billServiceInterface.findBillByBillId(billId);
        List<BillDetailEntity> billDetails = billDetailServiceInterface.findBillDetailByBillId(billEntity);
        return billDetails;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.SAVE_BILLDETAIL_URL, method = RequestMethod.POST)
    public boolean createBillDetail(@RequestParam(value = ParamConstant.CART) String strCart) {
        try {
            List<Cart> carts = new ArrayList<Cart>();

            Calendar calendar = Calendar.getInstance();

            JSONArray jsonarray = new JSONArray(strCart);

            BillEntity billEntity = new BillEntity();
            BillDetailEntity billDetailEntity = new BillDetailEntity();

            int totalPrice = 0;
            int accountId = 0;
            double salePercent = 0;

            for (int i = 0; i < jsonarray.length(); i++) {
                Cart cart = new Cart();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                accountId = jsonobject.getInt(ParamConstant.ACCOUNT_ID);
                int productId = jsonobject.getInt(ParamConstant.PRODUCT_ID);
                int quantity = jsonobject.getInt(ParamConstant.QUANTITY);

                cart.setAccountId(accountId);
                cart.setProductId(productId);
                cart.setQuantity(quantity);

                carts.add(cart);
            }

            for (Cart cart : carts) {
                SaleProductEntity saleProduct = saleProductServiceInterface.findSaleProductByProduct(productServiceInterface.findProductByProductId(cart.getProductId()));
                if (saleProduct != null) {
                    salePercent = 1 - (saleProduct.getSaleBySaleId().getSalePercent() / 100.0);
                } else {
                    salePercent = 1;
                }
                totalPrice += cart.getQuantity() * salePercent * Integer.parseInt(productServiceInterface.findProductByProductId(cart.getProductId()).getPrice());
            }

            billEntity.setDate(new java.sql.Date(calendar.getTime().getTime()));
            billEntity.setAccountByAccountId(accountServiceInterface.findAccountByAccountId(accountId));
            billEntity.setTotalPrice(String.valueOf(totalPrice));
            billEntity.setStatus(ParamConstant.PENDING_STATUS);
            billEntity.setEnabled(true);
            BillEntity insertBill = billServiceInterface.saveBill(billEntity);

            for (Cart cart : carts) {
                SaleProductEntity saleProduct = saleProductServiceInterface.findSaleProductByProduct(productServiceInterface.findProductByProductId(cart.getProductId()));
                if (saleProduct != null) {
                    salePercent = 1 - (saleProduct.getSaleBySaleId().getSalePercent() / 100.0);
                } else {
                    salePercent = 1;
                }

                billDetailEntity.setBillByBillId(insertBill);
                billDetailEntity.setProductByProductId(productServiceInterface.findProductByProductId(cart.getProductId()));
                billDetailEntity.setSaleBySaleId(saleProduct != null ? saleProduct.getSaleBySaleId() : null);
                billDetailEntity.setQuantity(cart.getQuantity());
                billDetailEntity.setExtPrice(String.valueOf(cart.getQuantity() * salePercent * Integer.parseInt(productServiceInterface.findProductByProductId(cart.getProductId()).getPrice())));

                ProductEntity productEntity = productServiceInterface.findProductByProductId(cart.getProductId());
                productEntity.setQuantity(productEntity.getQuantity() - cart.getQuantity());

                productServiceInterface.updateQuantityProduct(productEntity);
                billDetailServiceInterface.saveBillDetail(billDetailEntity);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
