package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Hung on 11/21/2016.
 */
@Controller
public class IndexController {


    @RequestMapping(value = {PageConstant.ADMIN_ROOT_PATH_URL, PageConstant.HOME_PAGE_URL}, method = RequestMethod.GET)
    public ModelAndView initHomePage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.HOME_PAGE);
//        int numOfProduct = productServiceInterface.countAllProduct();
//        int numOfOrder = billServiceInterface.countAllOrder();
//        modelAndView.addObject(ParamConstant.NUMBER_PRODUCT_ATTR, numOfProduct);
//        modelAndView.addObject(ParamConstant.NUMBER_ORDER_ATTR, numOfOrder);
        return modelAndView;
    }

}
