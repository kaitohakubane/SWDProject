package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.common.utils.NumbericUtils;
import com.sneakergo.entity.SaleDisplayEntity;
import com.sneakergo.service.interfaces.SaleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Hung on 11/27/2016.
 */
@Controller
public class SaleController {
    @Autowired
    SaleServiceInterface saleServiceInterface;

    @RequestMapping(value = PageConstant.SALE_PAGE_URL, method = RequestMethod.GET)
    public ModelAndView initSalePage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.SALE_PAGE);
        Date currentDate=NumbericUtils.getCurrentDate();
        List<SaleDisplayEntity> listSale = saleServiceInterface.getSaleByTime(currentDate);
        modelAndView.addObject(ParamConstant.LIST_SALE_ATTR, listSale);
        return modelAndView;
    }
}
