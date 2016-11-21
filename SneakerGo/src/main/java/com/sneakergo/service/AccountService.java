package com.sneakergo.service;

import com.sneakergo.entity.AccountEntity;
import com.sneakergo.model.interfaces.AccountModelInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hung on 11/21/2016.
 */
@Service
@Transactional
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
