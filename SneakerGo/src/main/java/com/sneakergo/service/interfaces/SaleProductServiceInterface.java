package com.shoppee.service.interfaces;

import com.shoppee.entity.ProductEntity;
import com.shoppee.entity.SaleProductEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface SaleProductServiceInterface {

    void saveSaleProduct(SaleProductEntity saleProductEntity);

    List<SaleProductEntity> findAllSaleProducts();

    SaleProductEntity findSaleProductByProduct(ProductEntity product);

    void deleteSaleProduct(SaleProductEntity saleProductEntity);

    void updateSaleProduct(SaleProductEntity saleProductEntity);
}
