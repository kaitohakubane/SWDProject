package com.shoppee.controller;

import com.shoppee.common.constants.PageConstant;
import com.shoppee.common.constants.ParamConstant;
import com.shoppee.common.utils.IntegerUtils;
import com.shoppee.controller.interfaces.BillControllerInterface;
import com.shoppee.entity.AccountEntity;
import com.shoppee.entity.BillEntity;
import com.shoppee.service.interfaces.AccountServiceInterface;
import com.shoppee.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

/**
 * Created by HuanTNH on 9/27/2016.
 */
@RestController
public class BillController implements BillControllerInterface {

    @Autowired
    private BillServiceInterface billServiceInterface;

    @Autowired
    private AccountServiceInterface accountServiceInterface;

    @Override
    @RequestMapping(value = PageConstant.BILL_PAGE_URL, method = RequestMethod.GET)
    public ModelAndView initBillPage() {
        List<BillEntity> listBill = billServiceInterface.findAllBills();

        ModelAndView modelAndView = new ModelAndView(PageConstant.BILL_PAGE);
        modelAndView.addObject(ParamConstant.LIST_BILL_ATTR, listBill);

        return modelAndView;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.GET_ALL_BILL_DAILY_REPORT_URL, method = RequestMethod.POST)
    public List<BillEntity> listAllBillByDay() {
        return billServiceInterface.listAllBillByDay(IntegerUtils.getCurrentDay(), IntegerUtils.getCurrentMonth(), IntegerUtils.getCurrentYear());
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.VIEW_BILL_PAGE_URL, method = RequestMethod.POST)
    public List<BillEntity> listBillByAccountId(@RequestParam(value = ParamConstant.ACCOUNT_ID) int accountId) {
        AccountEntity accountEntity = accountServiceInterface.findAccountByAccountId(accountId);
        return billServiceInterface.findBillByAccountId(accountEntity);
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.UPDATE_BILL_URL, method = RequestMethod.POST)
    public boolean updateStatusBill(@RequestParam(value = ParamConstant.BILL_ID) int billId, @RequestParam(value = ParamConstant.BILL_STATUS) String status) {
        BillEntity currentBill = billServiceInterface.findBillByBillId(billId);

        if (currentBill != null) {
            currentBill.setStatus(status);

            billServiceInterface.updateStatusBill(currentBill);
            return true;
        }

        return false;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.REMOVE_BILL_URL, method = RequestMethod.POST)
    public boolean removeBill(@RequestParam(value = ParamConstant.BILL_ID) int billId) {
    BillEntity currentBill = billServiceInterface.findBillByBillId(billId);

        if (currentBill != null) {
            currentBill.setEnabled(false);

            billServiceInterface.removeBill(currentBill);
            return true;
        }

        return false;
    }

}
