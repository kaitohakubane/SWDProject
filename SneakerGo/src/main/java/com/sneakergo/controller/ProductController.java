package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.entity.ProductEntity;
import com.sneakergo.service.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Hung on 11/18/2016.
 */
@Controller
public class ProductController {
    @Autowired
    private ProductServiceInterface productServiceInterface;
    @RequestMapping(value = PageConstant.PRODUCT_PAGE_URL, method = RequestMethod.GET)
    public ModelAndView initProductPage() {
        List<ProductEntity> listProduct = productServiceInterface.getAllProduct();
        System.out.println(listProduct.size());
        System.out.println(listProduct.get(0).getProductName());

        ModelAndView modelAndView = new ModelAndView(PageConstant.PRODUCT_PAGE);
        modelAndView.addObject(ParamConstant.LIST_PRODUCT, listProduct);
        return modelAndView;
    }
}
