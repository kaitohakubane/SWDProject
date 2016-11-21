package com.sneakergo.service;

import com.sneakergo.entity.StockDisplayEntity;
import com.sneakergo.entity.StockEntity;
import com.sneakergo.model.interfaces.StockModelInterface;
import com.sneakergo.service.interfaces.StockServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Hung on 11/21/2016.
 */
@Service
@Transactional
public class StockService implements StockServiceInterface{
    @Autowired
    StockModelInterface stockModelInterface;

    @Override
    public StockEntity getStockByProductIDAndAttributeID(int productID, int attributeID){
        return stockModelInterface.getStockByProductIDAndAttributeID(productID,attributeID);
    }

    @Override
    public boolean updateStockQuantity(StockEntity stockEntity, int quantity){
        return stockModelInterface.updateStockQuantity(stockEntity,quantity);
    }

    @Override
    public boolean createStock(StockEntity stockEntity){
        return stockModelInterface.createStock(stockEntity);
    }

    @Override
    public boolean isProductStockAvailable(int productID){
        return stockModelInterface.isProductStockAvailable(productID);
    }

    @Override
    public List<StockDisplayEntity> getStock(){
        return stockModelInterface.getStock();
    }

}
