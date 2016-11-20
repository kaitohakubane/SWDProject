package com.sneakergo.model.interfaces;

import com.sneakergo.entity.SaleEntity;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/20/2016.
 */
public interface SaleModelInterface {
    SaleEntity getSaleByID(int saleID);

    List<SaleEntity> getSaleByTime(Date time);

    List<SaleEntity> getAllSale();

    List<SaleEntity> getSaleFromToday();

    boolean createSave(SaleEntity saleEntity);

}
