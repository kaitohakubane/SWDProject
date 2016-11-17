package com.shoppee.service.interfaces;

import com.shoppee.entity.AccountEntity;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface AccountServiceInterface {

    AccountEntity findAccountByAccountId(int accountId);

    AccountEntity findAccountByUsername(String username);

    AccountEntity checkLogin(String username, String password);

    AccountEntity saveAccount(AccountEntity accountEntity);

    void updateAccount(AccountEntity accountEntity);

    void changePassword(AccountEntity accountEntity);

}
