package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.common.constants.UtilsConstant;
import com.sneakergo.common.utils.NumbericUtils;
import com.sneakergo.entity.BillDisplayEntity;
import com.sneakergo.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        Date sevenDateAgo=NumbericUtils.getNDateBeforeDate(UtilsConstant.SEVEN);
        List<BillDisplayEntity> billDisplayEntities= billServiceInterface.getBillByTime(sevenDateAgo,currentDate);
        modelAndView.addObject(ParamConstant.LIST_BILL_ATTR,billDisplayEntities)
                .addObject(ParamConstant.FROM_DATE,sevenDateAgo).addObject(ParamConstant.TO_DATE,currentDate);
        return modelAndView;
    }

}
