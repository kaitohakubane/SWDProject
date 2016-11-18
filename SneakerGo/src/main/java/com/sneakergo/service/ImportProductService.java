//package com.shoppee.service;
//
//import com.shoppee.entity.ImportProductEntity;
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
//public class ImportProductService implements ImportProductServiceInterface {
//
//    @Autowired
//    private ImportProductModelInterface importProductModelInterface;
//
//    @Override
//    public ImportProductEntity findImportProductByImportProductId(int importProductId) {
//        return importProductModelInterface.findImportProductByImportProductId(importProductId);
//    }
//
//    @Override
//    public List<ImportProductEntity> findAllImportProducts() {
//        return importProductModelInterface.findAllImportProducts();
//    }
//
//    @Override
//    public void saveImportProduct(ImportProductEntity importProductEntity) {
//        importProductModelInterface.saveImportProduct(importProductEntity);
//    }
//
//    @Override
//    public void updateImportProduct(ImportProductEntity importProductEntity) {
//        ImportProductEntity importProduct = importProductModelInterface.findImportProductByImportProductId(importProductEntity.getImportProductId());
//        if (importProduct != null) {
//            importProduct.setImportDate(importProductEntity.getImportDate());
//            importProduct.setProductByProductId(importProductEntity.getProductByProductId());
//            importProduct.setImportPrice(importProductEntity.getImportPrice());
//            importProduct.setImportQuantity(importProductEntity.getImportQuantity());
//        }
//    }
//
//    @Override
//    public void removeImportProduct(ImportProductEntity importProductEntity) {
//        ImportProductEntity importProduct = importProductModelInterface.findImportProductByImportProductId(importProductEntity.getImportProductId());
//        if (importProduct != null) {
//            importProduct.setEnabled(false);
//        }
//    }
//
//}
