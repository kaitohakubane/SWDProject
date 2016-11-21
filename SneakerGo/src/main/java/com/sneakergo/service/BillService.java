package com.sneakergo.service;

import com.sneakergo.entity.AccountEntity;
import com.sneakergo.entity.BillEntity;
import com.sneakergo.model.interfaces.BillModelInterface;
import com.sneakergo.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/21/2016.
 */
@Service
@Transactional
public class BillService implements BillServiceInterface{

    @Autowired
    private BillModelInterface billModelInterface;

    @Override
    public BillEntity getBillByID(int billID){
        return billModelInterface.getBillByID(billID);
    }

    @Override
    public List<BillEntity> getBillByAccount(AccountEntity accountEntity){
        return billModelInterface.getBillByAccount(accountEntity);
    }

    @Override
    public List<BillEntity> getBillByTime(Date fromDate, Date toDate){
        return billModelInterface.getBillByTime(fromDate,toDate);
    }
}
