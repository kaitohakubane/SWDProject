package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.entity.AccountEntity;
import com.sneakergo.entity.BillDetailDisplayEntity;
import com.sneakergo.entity.BillEntity;
import com.sneakergo.service.interfaces.AccountServiceInterface;
import com.sneakergo.service.interfaces.BillDetailServiceInterface;
import com.sneakergo.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Hung on 11/30/2016.
 */
@Controller
public class BillDetailController {

    @Autowired
    BillDetailServiceInterface billDetailServiceInterface;

    @Autowired
    AccountServiceInterface accountServiceInterface;

    @Autowired
    BillServiceInterface billServiceInterface;

    @RequestMapping(value = PageConstant.BILL_DETAIL_PAGE_URL, method = RequestMethod.POST)
    public ModelAndView searchBillDetail(@RequestParam(value = ParamConstant.BILL_ID) int billId,
                                         @RequestParam(value = ParamConstant.FROM_DATE) String fromDate,
                                         @RequestParam(value = ParamConstant.TO_DATE) String toDate) {
        ModelAndView modelAndView = new ModelAndView(PageConstant.BILL_DETAIL_PAGE);
        BillEntity billEntity = billServiceInterface.getBillByID(billId);
        if (billEntity != null) {
            AccountEntity accountEntity = accountServiceInterface.getAccountByID(billEntity.getAccountId());
            List<BillDetailDisplayEntity> billDetail = billDetailServiceInterface.getBillDetailByBill(billId);
            modelAndView.addObject(ParamConstant.BILL_DETAIL_LIST, billDetail).
                    addObject(ParamConstant.CUSTOMER, accountEntity).addObject(ParamConstant.BILL, billEntity)
                    .addObject(ParamConstant.FROM_DATE, fromDate).addObject(ParamConstant.TO_DATE, toDate);
        }
        return modelAndView;
    }

}
