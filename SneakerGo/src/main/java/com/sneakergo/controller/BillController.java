package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.common.constants.UtilsConstant;
import com.sneakergo.common.utils.NumbericUtils;
import com.sneakergo.common.utils.StringUtils;
import com.sneakergo.entity.BillDisplayEntity;
import com.sneakergo.entity.BillEntity;
import com.sneakergo.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/23/2016.
 */
@Controller
public class BillController {
    @Autowired
    BillServiceInterface billServiceInterface;

    @RequestMapping(value = {PageConstant.BILL_PAGE_URL}, method = RequestMethod.GET)
    public ModelAndView initHomePage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.BILL_PAGE);
        Date currentDate= NumbericUtils.getCurrentDate();
        Date aMonthAgo=NumbericUtils.getNDateBeforeDate(UtilsConstant.THIRTY);

        List<BillDisplayEntity> billDisplayEntities= billServiceInterface.getBillByTime(aMonthAgo,currentDate);
        modelAndView.addObject(ParamConstant.LIST_BILL_ATTR,billDisplayEntities)
                .addObject(ParamConstant.FROM_DATE,aMonthAgo).addObject(ParamConstant.TO_DATE,currentDate);
        return modelAndView;
    }


    @RequestMapping(value = {PageConstant.SEARCH_BILL_URL}, method = RequestMethod.POST)
    public ModelAndView searchBill(@RequestParam(value = ParamConstant.FROM_DATE) String fromDate,
                                   @RequestParam(value = ParamConstant.TO_DATE) String toDate) {
        ModelAndView modelAndView = new ModelAndView(PageConstant.BILL_PAGE);
        String[] from = StringUtils.formatDate(fromDate);
        String[] to = StringUtils.formatDate(toDate);
        Date fromTime = NumbericUtils.getDate(from[UtilsConstant.ZERO],
                from[UtilsConstant.ONE], from[UtilsConstant.TWO]);
        Date toTime = NumbericUtils.getDate(to[UtilsConstant.ZERO],
                to[UtilsConstant.ONE], to[UtilsConstant.TWO]);
        List<BillDisplayEntity> billDisplayEntities= billServiceInterface.getBillByTime(fromTime,toTime);
        modelAndView.addObject(ParamConstant.LIST_BILL_ATTR,billDisplayEntities)
                .addObject(ParamConstant.FROM_DATE,fromTime).addObject(ParamConstant.TO_DATE,toTime);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = {PageConstant.DELETE_BILL_URL}, method = RequestMethod.POST)
    public boolean deleteBill(@RequestParam(value = ParamConstant.BILL_ID) int billId) {
        BillEntity billEntity=billServiceInterface.getBillByID(billId);
        if(billEntity!=null){
            billEntity.setEnabled(false);
            billServiceInterface.updateBill(billEntity);
            return true;
        }
        return false;
    }

}
