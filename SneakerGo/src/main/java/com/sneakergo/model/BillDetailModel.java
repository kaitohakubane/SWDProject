package com.sneakergo.model;

import com.sneakergo.entity.BillEntity;
import com.sneakergo.entity.BilldetailEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.BillDetailModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Hung on 11/21/2016.
 */
public class BillDetailModel extends CommonDAO implements BillDetailModelInterface {

    @Override
    public List<BilldetailEntity> getBillDetailByBillID(BillEntity billEntity) {
        Criteria criteria = getSession().createCriteria(BilldetailEntity.class)
                .add(Restrictions.eq("billId", billEntity.getBillId()));
        List<BilldetailEntity> billdetailEntities = criteria.list();
        return billdetailEntities;
    }
}
