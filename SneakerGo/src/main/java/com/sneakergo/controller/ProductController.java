package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.common.utils.FileUtils;
import com.sneakergo.common.utils.StringUtils;
import com.sneakergo.entity.ProductEntity;
import com.sneakergo.service.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

/**
 * Created by Hung on 11/18/2016.
 */
@Controller
public class ProductController {
    @Value("${product.image.location}")
    String imagePath;

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @RequestMapping(value = PageConstant.PRODUCT_PAGE_URL, method = RequestMethod.GET)
    public ModelAndView initProductPage() {
        List<ProductEntity> listProduct = productServiceInterface.getAllProduct();
        ModelAndView modelAndView = new ModelAndView(PageConstant.PRODUCT_PAGE);
        modelAndView.addObject(ParamConstant.LIST_PRODUCT, listProduct);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = PageConstant.SEARCH_PRODUCT_URL, method = RequestMethod.POST)
    public List<ProductEntity> listSearchProducts(@RequestParam(value = ParamConstant.PRODUCT_NAME) String productName) {
        return productServiceInterface.getProductByName(productName);
    }

    @ResponseBody
    @RequestMapping(value = PageConstant.CREATE_PRODUCT_URL, method = RequestMethod.POST)
    public boolean createProduct(
            @RequestParam(value = ParamConstant.PICTURE, required = false) MultipartFile picture,
            @RequestParam(value = ParamConstant.PRODUCT_NAME) String productName,
            @RequestParam(value = ParamConstant.PRICE) String price,
            @RequestParam(value = ParamConstant.SALE) int saleId,
            @RequestParam(value = ParamConstant.SIZE) String size,
            @RequestParam(value = ParamConstant.COLOR) String color,
            @RequestParam(value = ParamConstant.NATION) String nation,
            @RequestParam(value = ParamConstant.DESCRIPTION) String description) {
        try {
            ProductEntity productEntity = new ProductEntity();
            File imageDirectory = new File(imagePath);
            if (!imageDirectory.exists()) {
                imageDirectory.mkdirs();
            }

            if (!picture.isEmpty()) {
                String imageName = StringUtils.generateProductImageName() + StringUtils.getExtension(picture.getOriginalFilename());
                FileUtils.saveImageFile(picture, imageDirectory, imageName);
                productEntity.setPicture(imageName);
            }

            productEntity.setProductName(productName);
            productEntity.setPrice(price);
            productEntity.setNation(nation);
            productEntity.setDescription(description);
            productEntity.setEnabled(true);
            boolean result = productServiceInterface.addProduct(productEntity);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @ResponseBody
    @RequestMapping(value = PageConstant.EDIT_PRODUCT_URL, method = RequestMethod.POST)
    public boolean editProduct(@RequestParam(value = ParamConstant.PRODUCT_ID) int productId,
                               @RequestParam(value = ParamConstant.PICTURE, required = false) MultipartFile picture,
                               @RequestParam(value = ParamConstant.PRODUCT_NAME) String productName,
                               @RequestParam(value = ParamConstant.PRICE) String price,
                               @RequestParam(value = ParamConstant.SALE) int saleId,
                               @RequestParam(value = ParamConstant.SIZE) String size,
                               @RequestParam(value = ParamConstant.COLOR) String color,
                               @RequestParam(value = ParamConstant.NATION) String nation,
                               @RequestParam(value = ParamConstant.DESCRIPTION) String description) {
        try {
            ProductEntity productEntity = productServiceInterface.getProductByID(productId);
            File imageDirectory = new File(imagePath);
            if (!imageDirectory.exists()) {
                imageDirectory.mkdirs();
            }

            if (!picture.isEmpty()) {
                String imageName = StringUtils.generateProductImageName() + StringUtils.getExtension(picture.getOriginalFilename());
                FileUtils.saveImageFile(picture, imageDirectory, imageName);
                productEntity.setPicture(imageName);
            }

            productEntity.setProductName(productName);
            productEntity.setPrice(price);
            productEntity.setNation(nation);
            productEntity.setDescription(description);
            productEntity.setEnabled(true);
            boolean result = productServiceInterface.addProduct(productEntity);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @ResponseBody
    @RequestMapping(value = PageConstant.REMOVE_PRODUCT_URL, method = RequestMethod.POST)
    public boolean removeProduct(@RequestParam(value = ParamConstant.PRODUCT_ID) int productId) {

        ProductEntity productEntity = productServiceInterface.getProductByID(productId);

        if (productEntity != null) {
            productEntity.setEnabled(false);

            productServiceInterface.updateProduct(productEntity);

            new File(imagePath + productEntity.getPicture()).delete();
            return true;
        }

        return false;
    }

    @RequestMapping(value = {PageConstant.CREATE_PRODUCT_PAGE_URL}, method = RequestMethod.GET)
    public ModelAndView initHomePage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.CREATE_PRODUCT_PAGE);
//        int numOfProduct = productServiceInterface.countAllProduct();
//        int numOfOrder = billServiceInterface.countAllOrder();
//        modelAndView.addObject(ParamConstant.NUMBER_PRODUCT_ATTR, numOfProduct);
//        modelAndView.addObject(ParamConstant.NUMBER_ORDER_ATTR, numOfOrder);
        return modelAndView;
    }


}
