package com.sneakergo.model;

import com.sneakergo.common.constants.SQLParamConstant;
import com.sneakergo.entity.StockEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.StockModelInterface;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 * Created by Hung on 11/20/2016.
 */
public class StockModel extends CommonDAO implements StockModelInterface {

    @Override
    public StockEntity getStockByProductIDAndAttributeID(int productID, int attributeID) {
        Criteria criteria = getSession().createCriteria(StockEntity.class).add(Restrictions.eq("attributeId", attributeID))
                .add(Restrictions.eq("productId", productID));
        StockEntity stockEntity = (StockEntity) criteria.uniqueResult();
        return stockEntity;
    }

    @Override
    public boolean updateStockQuantity(StockEntity stockEntity, int quantity) {
        if (getStockByProductIDAndAttributeID(stockEntity.getProductId(), stockEntity.getAttributeId()) != null) {
            stockEntity.setQuantity(stockEntity.getQuantity() + quantity);
            getSession().merge(stockEntity);
            getSession().saveOrUpdate(stockEntity);
            return true;
        }
        return false;
    }

    @Override
    public boolean createStock(StockEntity stockEntity) {
        if (getStockByProductIDAndAttributeID(stockEntity.getProductId(), stockEntity.getAttributeId()) == null) {
            getSession().persist(stockEntity);
            return true;
        }
        return false;
    }

    @Override
    public boolean isProductStockAvailable(int productID) {
        Query query = getSession().createQuery(SQLParamConstant.COUNT_ALL_STOCK_QUANTITY_OF_PRODUCT);
        query.setParameter(1, productID);
        if ((Integer) query.uniqueResult() > 0) {
            return true;
        }
        return false;
    }
}
