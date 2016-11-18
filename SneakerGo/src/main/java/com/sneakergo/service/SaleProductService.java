//package com.shoppee.service;
//
//import com.shoppee.entity.ProductEntity;
//import com.shoppee.entity.SaleProductEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/25/2016.
// */
//@Service
//@Transactional
//public class SaleProductService implements SaleProductServiceInterface {
//
//    @Autowired
//    private SaleProductModelInterface saleProductModelInterface;
//
//    @Override
//    public void saveSaleProduct(SaleProductEntity saleProductEntity) {
//        saleProductModelInterface.saveSaleProduct(saleProductEntity);
//    }
//
//    @Override
//    public List<SaleProductEntity> findAllSaleProducts() {
//        return saleProductModelInterface.findAllSaleProducts();
//    }
//
//    @Override
//    public SaleProductEntity findSaleProductByProduct(ProductEntity product) {
//        return saleProductModelInterface.findSaleProductsByProduct(product);
//    }
//
//    @Override
//    public void deleteSaleProduct(SaleProductEntity saleProductEntity) {
//        saleProductModelInterface.deleteSaleProduct(saleProductEntity);
//    }
//
//    @Override
//    public void updateSaleProduct(SaleProductEntity saleProductEntity) {
//        saleProductModelInterface.updateSaleProduct(saleProductEntity);
//    }
//
//}
