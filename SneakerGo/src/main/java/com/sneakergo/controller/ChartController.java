package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mynvtse61526 on 12/4/2016.
 */
@Controller
public class ChartController {
    @RequestMapping(value = PageConstant.REVENUE_REPORT_URL, method = RequestMethod.GET)
    public ModelAndView initProductPage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.CHART_PAGE);
        return modelAndView;
    }
}
