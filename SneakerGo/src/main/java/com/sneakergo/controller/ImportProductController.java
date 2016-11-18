//package com.shoppee.controller;
//
//import com.shoppee.common.constants.PageConstant;
//import com.shoppee.common.constants.ParamConstant;
//import com.shoppee.controller.interfaces.ImportProductControllerInterface;
//import com.shoppee.entity.ImportProductEntity;
//import com.shoppee.entity.ProductEntity;
//import com.shoppee.service.interfaces.ImportProductServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.text.SimpleDateFormat;
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/27/2016.
// */
//@RestController
//public class ImportProductController implements ImportProductControllerInterface {
//
//    @Autowired
//    private ImportProductServiceInterface importProductServiceInterface;
//
//    @Autowired
//    private ProductServiceInterface productServiceInterface;
//
//    @Override
//    @RequestMapping(value = PageConstant.IMPORT_PRODUCT_PAGE_URL, method = RequestMethod.GET)
//    public ModelAndView initImportProductPage() {
//        List<ImportProductEntity> listImportProduct = importProductServiceInterface.findAllImportProducts();
//        List<ProductEntity> listProduct = productServiceInterface.findAllProducts();
//
//        ModelAndView modelAndView = new ModelAndView(PageConstant.IMPORT_PRODUCT_PAGE);
//        modelAndView.addObject(ParamConstant.LIST_IMPORT_PRODUCT_ATTR, listImportProduct);
//        modelAndView.addObject(ParamConstant.LIST_PRODUCT_ATTR, listProduct);
//
//        return modelAndView;
//    }
//
//    @Override
//    @RequestMapping(value = PageConstant.CREATE_IMPORT_PRODUCT_URL, method = RequestMethod.POST)
//    public boolean createImportProduct(@RequestParam(value = ParamConstant.IMPORT_DATE) String importDate,
//                                       @RequestParam(value = ParamConstant.PRODUCT) String productId,
//                                       @RequestParam(value = ParamConstant.IMPORT_PRICE) String importPrice,
//                                       @RequestParam(value = ParamConstant.IMPORT_QUANTITY) String importQuantity) {
//        try {
//            ImportProductEntity importProductEntity = new ImportProductEntity();
//            ProductEntity productEntity = productServiceInterface.findProductByProductId(Integer.parseInt(productId));
//
//            importProductEntity.setImportDate(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(importDate).getTime()));
//            importProductEntity.setProductByProductId(productEntity);
//            importProductEntity.setImportPrice(importPrice);
//            importProductEntity.setImportQuantity(Integer.parseInt(importQuantity));
//            importProductEntity.setEnabled(true);
//
//            productEntity.setQuantity(Integer.parseInt(importQuantity) + productEntity.getQuantity());
//            productServiceInterface.updateQuantityProduct(productEntity);
//
//            importProductServiceInterface.saveImportProduct(importProductEntity);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    @RequestMapping(value = PageConstant.EDIT_IMPORT_PRODUCT_URL, method = RequestMethod.POST)
//    public boolean updateImportProduct(@RequestParam(value = ParamConstant.IMPORT_PRODUCT_ID) int importProductId,
//                                       @RequestParam(value = ParamConstant.IMPORT_DATE) String importDate,
//                                       @RequestParam(value = ParamConstant.PRODUCT) String productId,
//                                       @RequestParam(value = ParamConstant.IMPORT_DATE) String importPrice,
//                                       @RequestParam(value = ParamConstant.IMPORT_QUANTITY) String importQuantity) {
//        ImportProductEntity currentImportProduct = importProductServiceInterface.findImportProductByImportProductId(importProductId);
//        ProductEntity productEntity = productServiceInterface.findProductByProductId(Integer.parseInt(productId));
//
//        if (currentImportProduct != null) {
//            try {
//                currentImportProduct.setImportDate(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(importDate).getTime()));
//                currentImportProduct.setProductByProductId(productEntity);
//                currentImportProduct.setImportPrice(importPrice);
//                currentImportProduct.setImportQuantity(Integer.parseInt(importQuantity));
//
//                productEntity.setQuantity(Integer.parseInt(importQuantity) + productEntity.getQuantity());
//                productServiceInterface.updateQuantityProduct(productEntity);
//
//                importProductServiceInterface.updateImportProduct(currentImportProduct);
//                return true;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        return false;
//    }
//
//    @Override
//    @RequestMapping(value = PageConstant.REMOVE_IMPORT_PRODUCT_URL, method = RequestMethod.POST)
//    public boolean removeImportProduct(@RequestParam(value = ParamConstant.IMPORT_PRODUCT_ID) int importProductId) {
//        ImportProductEntity currentImportProduct = importProductServiceInterface.findImportProductByImportProductId(importProductId);
//
//        if (currentImportProduct != null) {
//            currentImportProduct.setEnabled(false);
//
//            importProductServiceInterface.removeImportProduct(currentImportProduct);
//            return true;
//        }
//
//        return false;
//    }
//
//}
