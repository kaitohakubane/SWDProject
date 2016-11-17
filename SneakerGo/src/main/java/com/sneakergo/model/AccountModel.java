package com.sneakergo.model;

import com.sneakergo.entity.AccountEntity;
import com.sneakergo.model.common.CommonDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by Hung on 11/17/2016.
 */
@Repository
public class AccountModel extends CommonDAO {
    public AccountEntity getAccountByID(String accountID){
        AccountEntity accountEntity=getSession().get(AccountEntity.class,accountID);
        return accountEntity;
    }
}
