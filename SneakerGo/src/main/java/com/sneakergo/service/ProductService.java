package com.sneakergo.service;

import com.sneakergo.entity.ProductEntity;
import com.sneakergo.model.interfaces.ProductModelInterface;
import com.sneakergo.service.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Hung on 11/17/2016.
 */
@Service
@Transactional
public class ProductService implements ProductServiceInterface {
    @Autowired
    private ProductModelInterface productModelInterface;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productModelInterface.getAllProduct();
    }

    @Override
    public boolean addProduct(ProductEntity product) {
        return productModelInterface.addProduct(product);
    }

    @Override
    public boolean updateProduct(ProductEntity product) {
        return productModelInterface.updateProduct(product);
    }

    @Override
    public ProductEntity getProductByID(int productID) {
        return productModelInterface.getProductByID(productID);
    }
}
