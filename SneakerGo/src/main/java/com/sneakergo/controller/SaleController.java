//package com.shoppee.controller;
//
//import com.shoppee.common.constants.PageConstant;
//import com.shoppee.common.constants.ParamConstant;
//import com.shoppee.controller.interfaces.SaleControllerInterface;
//import com.shoppee.entity.SaleEntity;
//import com.shoppee.service.interfaces.SaleServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.text.SimpleDateFormat;
//import java.util.Collections;
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/27/2016.
// */
//@RestController
//public class SaleController implements SaleControllerInterface {
//
//    @Autowired
//    private SaleServiceInterface saleServiceInterface;
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.SALE_PAGE_URL, method = RequestMethod.GET)
//    public ModelAndView initSalePage() {
//        List<SaleEntity> listSale = saleServiceInterface.findAllSales();
//
//        ModelAndView modelAndView = new ModelAndView(PageConstant.SALE_PAGE);
//        modelAndView.addObject(ParamConstant.LIST_SALE_ATTR, listSale);
//
//        return modelAndView;
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.CREATE_SALE_URL, method = RequestMethod.POST)
//    public boolean createSale(@RequestParam(value = ParamConstant.SALE_PERCENT) String salePercent,
//                              @RequestParam(value = ParamConstant.FROM_DATE) String fromDate,
//                              @RequestParam(value = ParamConstant.TO_DATE) String toDate) {
//        try {
//            SaleEntity saleEntity = new SaleEntity();
//            saleEntity.setSalePercent(Integer.parseInt(salePercent));
//            saleEntity.setFromDate(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(fromDate).getTime()));
//            saleEntity.setToDate(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(toDate).getTime()));
//            saleEntity.setEnabled(true);
//
//            saleServiceInterface.saveSale(saleEntity);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.EDIT_SALE_URL, method = RequestMethod.POST)
//    public boolean updateSale(@RequestParam(value = ParamConstant.SALE_ID) int saleId,
//                              @RequestParam(value = ParamConstant.SALE_PERCENT) String salePercent,
//                              @RequestParam(value = ParamConstant.FROM_DATE) String fromDate,
//                              @RequestParam(value = ParamConstant.TO_DATE) String toDate) {
//        SaleEntity currentSale = saleServiceInterface.findSaleBySaleId(saleId);
//
//        if (currentSale != null) {
//            try {
//                currentSale.setSalePercent(Integer.parseInt(salePercent));
//                currentSale.setFromDate(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(fromDate).getTime()));
//                currentSale.setToDate(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(toDate).getTime()));
//
//                saleServiceInterface.updateSale(currentSale);
//                return true;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        return false;
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.REMOVE_SALE_URL, method = RequestMethod.POST)
//    public boolean removeSale(@RequestParam(value = ParamConstant.SALE_ID) int saleId) {
//        SaleEntity currentSale = saleServiceInterface.findSaleBySaleId(saleId);
//
//        if (currentSale != null) {
//            currentSale.setEnabled(false);
//
//            saleServiceInterface.removeSale(currentSale);
//            return true;
//        }
//
//        return false;
//    }
//
//}
