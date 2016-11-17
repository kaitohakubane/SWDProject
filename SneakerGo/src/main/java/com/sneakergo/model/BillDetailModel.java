package com.shoppee.model;

import com.shoppee.entity.BillDetailEntity;
import com.shoppee.entity.BillEntity;
import com.shoppee.model.common.AbstractDao;
import com.shoppee.model.interfaces.BillDetailModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
@Repository
public class BillDetailModel extends AbstractDao<Integer, BillDetailEntity> implements BillDetailModelInterface {

    @Override
    public List<BillDetailEntity> findBillDetailByBillId(BillEntity billId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("billByBillId", billId));
        List<BillDetailEntity> billDetails = (List<BillDetailEntity>) criteria.list();
        return billDetails;
    }

    @Override
    public void saveBillDetail(BillDetailEntity billDetailEntity) {
        persist(billDetailEntity);
    }

}
