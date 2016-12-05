package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.service.interfaces.ChartServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Hung on 12/4/2016.
 */

@Controller
public class ChartController {

    @Autowired
    ChartServiceInterface chartServiceInterface;

    @RequestMapping(value = PageConstant.REVENUE_REPORT_URL, method = RequestMethod.GET)
    public ModelAndView initChartPage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.CHART_PAGE);
//        chartServiceInterface.getRevenueByYear();
        return modelAndView;
    }

    @RequestMapping(value = PageConstant.SEARCH_REVENUE_REPORT_URL, method = RequestMethod.POST)
    public ModelAndView initProductPage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.CHART_PAGE);
//        chartServiceInterface.getRevenueByYear();
        return modelAndView;
    }
}
