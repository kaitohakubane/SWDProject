package com.sneakergo.service;

import com.sneakergo.entity.AccountEntity;
import com.sneakergo.model.interfaces.AccountModelInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Hung on 11/21/2016.
 */
public class AccountService {
    @Autowired
    AccountModelInterface accountModelInterface;

    public AccountEntity getAccountByID(String accountID) {
        return accountModelInterface.getAccountByID(accountID);
    }

    public boolean updateAccount(AccountEntity accountEntity) {
        return accountModelInterface.updateAccount(accountEntity);
    }

    public boolean createAccount(AccountEntity accountEntity) {
        return accountModelInterface.createAccount(accountEntity);
    }
}
