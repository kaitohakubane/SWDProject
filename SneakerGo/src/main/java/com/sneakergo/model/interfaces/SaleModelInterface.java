package com.sneakergo.model.interfaces;

import com.sneakergo.entity.SaleDisplayEntity;
import com.sneakergo.entity.SaleEntity;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/20/2016.
 */
public interface SaleModelInterface {

    SaleEntity getSaleByID(int saleID);

    List<SaleDisplayEntity> getSaleByTime(Date time);

    List<SaleEntity> getAllSale();

    List<SaleEntity> getSaleContainsToday();

    boolean createSave(SaleEntity saleEntity);

}
