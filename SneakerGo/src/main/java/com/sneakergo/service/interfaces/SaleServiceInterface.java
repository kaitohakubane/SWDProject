package com.shoppee.service.interfaces;

import com.shoppee.entity.SaleEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface SaleServiceInterface {

    SaleEntity findSaleBySaleId(int saleId);

    List<SaleEntity> findAllSales();

    void saveSale(SaleEntity saleEntity);

    void updateSale(SaleEntity saleEntity);

    void removeSale(SaleEntity saleEntity);

}
