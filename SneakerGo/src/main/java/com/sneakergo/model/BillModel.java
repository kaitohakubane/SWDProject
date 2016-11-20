package com.sneakergo.model;

import com.sneakergo.entity.AccountEntity;
import com.sneakergo.entity.BillEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.BillModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/20/2016.
 */
public class BillModel extends CommonDAO implements BillModelInterface {
    @Override
    public BillEntity getBillByID(int billID) {
        return getSession().get(BillEntity.class, billID);
    }

    @Override
    public List<BillEntity> getBillByAccount(AccountEntity accountEntity) {
        Criteria criteria = getSession().createCriteria(BillEntity.class)
                .add(Restrictions.eq("accountId", accountEntity.getAccountId())).addOrder(Order.desc("date"));
        List<BillEntity> bills = criteria.list();
        return bills;
    }

    @Override
    public List<BillEntity> getBillByTime(Date fromDate, Date toDate) {
        Criteria criteria = getSession().createCriteria(BillEntity.class).add(Restrictions.ge("date", fromDate))
                .add(Restrictions.lt("date", toDate));
        List<BillEntity> bills = criteria.list();
        return bills;
    }

}
