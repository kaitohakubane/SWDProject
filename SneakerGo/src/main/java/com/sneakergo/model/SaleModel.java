package com.shoppee.model;

import com.shoppee.entity.SaleEntity;
import com.shoppee.model.common.AbstractDao;
import com.shoppee.model.interfaces.SaleModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
@Repository
public class SaleModel extends AbstractDao<Integer, SaleEntity> implements SaleModelInterface {

    @Override
    public SaleEntity findSaleBySaleId(int saleId) {
        SaleEntity saleEntity = getByKey(saleId);
        if (saleEntity != null) {
            return saleEntity;
        }
        return null;
    }

    @Override
    public List<SaleEntity> findAllSales() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("enabled", true));
        List<SaleEntity> sales = (List<SaleEntity>) criteria.list();
        return sales;
    }

    @Override
    public void saveSale(SaleEntity saleEntity) {
        persist(saleEntity);
    }

}
