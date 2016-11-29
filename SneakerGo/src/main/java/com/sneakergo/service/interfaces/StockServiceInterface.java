package com.sneakergo.service.interfaces;

import com.sneakergo.entity.StockDisplayEntity;
import com.sneakergo.entity.StockEntity;

import java.util.List;

/**
 * Created by Hung on 11/21/2016.
 */
public interface StockServiceInterface {
    StockEntity getStockByProductIDAndAttributeID(int productID, int attributeID);

    void updateStockQuantity(StockEntity stockEntity2);

    void createStock(StockEntity stockEntity);

    boolean isProductStockAvailable(int productID);

    List<StockDisplayEntity> getStock();

    public StockEntity getStockByStockID(int stockID);

}
