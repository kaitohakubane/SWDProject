package com.shoppee.model.interfaces;

import com.shoppee.entity.ProductEntity;
import com.shoppee.entity.SaleProductEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface SaleProductModelInterface {

    void saveSaleProduct(SaleProductEntity saleProductEntity);

    List<SaleProductEntity> findAllSaleProducts();

    SaleProductEntity findSaleProductsByProduct(ProductEntity product);

    void deleteSaleProduct(SaleProductEntity saleProductEntity);

    void updateSaleProduct(SaleProductEntity saleProductEntity);

}
