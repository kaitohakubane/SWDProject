package com.shoppee.model.interfaces;

import com.shoppee.entity.SaleEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface SaleModelInterface {

    SaleEntity findSaleBySaleId(int saleId);

    List<SaleEntity> findAllSales();

    void saveSale(SaleEntity saleEntity);

}
