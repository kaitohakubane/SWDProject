package com.shoppee.controller;

import com.shoppee.common.constants.PageConstant;
import com.shoppee.common.constants.ParamConstant;
import com.shoppee.controller.interfaces.IndexControllerInterface;
import com.shoppee.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 9/21/2016.
 */
@Controller
public class IndexController implements IndexControllerInterface {

    @Autowired
    ProductServiceInterface productServiceInterface;

    @Autowired
    BillServiceInterface billServiceInterface;

    @Override
    @RequestMapping(value = {PageConstant.ROOT_PATH_URL}, method = RequestMethod.GET)
    public ModelAndView initIndexPage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.REDIRECT + PageConstant.ADMIN_ROOT_PATH_URL);
        return modelAndView;
    }

    @Override
    @RequestMapping(value = {PageConstant.ADMIN_ROOT_PATH_URL, PageConstant.HOME_PAGE_URL}, method = RequestMethod.GET)
    public ModelAndView initHomePage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.HOME_PAGE);
        int numOfProduct = productServiceInterface.countAllProduct();
        int numOfOrder = billServiceInterface.countAllOrder();
        modelAndView.addObject(ParamConstant.NUMBER_PRODUCT_ATTR, numOfProduct);
        modelAndView.addObject(ParamConstant.NUMBER_ORDER_ATTR, numOfOrder);
        return modelAndView;
    }

}

