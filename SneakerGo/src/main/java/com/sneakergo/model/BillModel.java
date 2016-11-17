package com.shoppee.model;

import com.shoppee.common.constants.SQLParamConstant;
import com.shoppee.entity.AccountEntity;
import com.shoppee.entity.BillEntity;
import com.shoppee.model.common.AbstractDao;
import com.shoppee.model.interfaces.BillModelInterface;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
@Repository
public class BillModel extends AbstractDao<Integer, BillEntity> implements BillModelInterface {

    @Override
    public BillEntity findBillByBillId(int billId) {
        BillEntity billEntity = getByKey(billId);
        if (billEntity != null) {
            return billEntity;
        }
        return null;
    }

    @Override
    public List<BillEntity> findAllBills() {
        Criteria criteria = createEntityCriteria();
        List<BillEntity> bills = (List<BillEntity>) criteria.list();
        return bills;
    }

    @Override
    public List<BillEntity> findBillByAccountId(AccountEntity accountId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("accountByAccountId", accountId));
        List<BillEntity> bills = (List<BillEntity>) criteria.list();
        return bills;
    }

    @Override
    public List<BillEntity> listAllBillByDay(int day, int month, int year) {
        Query query = getSession().createSQLQuery(SQLParamConstant.GET_ALL_BILL_BY_DAY).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        query.setParameter("day", day);
        query.setParameter("month", month);
        query.setParameter("year", year);
        return query.list();
    }

    @Override
    public BillEntity saveBill(BillEntity billEntity) {
        persist(billEntity);
        return billEntity;
    }

    @Override
    public int countAllOrder() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("enabled", true));
        return criteria.list().size();
    }

}
