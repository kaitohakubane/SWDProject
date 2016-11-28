package com.sneakergo.model;

import com.sneakergo.common.constants.SQLParamConstant;
import com.sneakergo.entity.StockDisplayEntity;
import com.sneakergo.entity.StockEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.StockModelInterface;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Hung on 11/20/2016.
 */
@Repository
public class StockModel extends CommonDAO implements StockModelInterface {

    @Override
    public StockEntity getStockByProductIDAndAttributeID(int productID, int attributeID) {
        Criteria criteria = getSession().createCriteria(StockEntity.class).add(Restrictions.eq("attributeId", attributeID))
                .add(Restrictions.eq("productId", productID));
        StockEntity stockEntity = (StockEntity) criteria.uniqueResult();
        return stockEntity;
    }

    public StockEntity getStockByStockID(int stockID) {
        StockEntity stockEntity=getSession().get(StockEntity.class,stockID);
        return stockEntity;
    }

    @Override
    public void updateStockQuantity(StockEntity stockEntity) {
            getSession().saveOrUpdate(stockEntity);
    }

    @Override
    public void createStock(StockEntity stockEntity) {
            getSession().persist(stockEntity);
    }

    @Override
    public boolean isProductStockAvailable(int productID) {
        Query query = getSession().createSQLQuery(SQLParamConstant.COUNT_ALL_STOCK_QUANTITY_OF_PRODUCT);
        query.setParameter(1, productID);
        if ((Integer) query.uniqueResult() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<StockDisplayEntity> getStock() {
        Query query = getSession().createSQLQuery(SQLParamConstant.GET_STOCK_RECORDS).
                setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List<StockDisplayEntity> stockDisplayEntities = query.list();
        return stockDisplayEntities;
    }

}
