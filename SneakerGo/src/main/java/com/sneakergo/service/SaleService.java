package com.shoppee.service;

import com.shoppee.entity.SaleEntity;
import com.shoppee.model.interfaces.SaleModelInterface;
import com.shoppee.service.interfaces.SaleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
@Service
@Transactional
public class SaleService implements SaleServiceInterface {

    @Autowired
    private SaleModelInterface saleModelInterface;

    @Override
    public SaleEntity findSaleBySaleId(int saleId) {
        return saleModelInterface.findSaleBySaleId(saleId);
    }

    @Override
    public List<SaleEntity> findAllSales() {
        return saleModelInterface.findAllSales();
    }

    @Override
    public void saveSale(SaleEntity saleEntity) {
        saleModelInterface.saveSale(saleEntity);
    }

    @Override
    public void updateSale(SaleEntity saleEntity) {
        SaleEntity sale = findSaleBySaleId(saleEntity.getSaleId());
        if (sale != null) {
            sale.setSalePercent(saleEntity.getSalePercent());
            sale.setFromDate(saleEntity.getFromDate());
            sale.setToDate(saleEntity.getToDate());
        }
    }

    @Override
    public void removeSale(SaleEntity saleEntity) {
        SaleEntity sale = findSaleBySaleId(saleEntity.getSaleId());
        if (sale != null) {
            sale.setEnabled(saleEntity.getEnabled());
        }
    }

}
