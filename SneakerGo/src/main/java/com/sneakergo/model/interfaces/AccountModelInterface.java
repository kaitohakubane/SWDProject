package com.shoppee.model.interfaces;

import com.shoppee.entity.AccountEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface AccountModelInterface {

    AccountEntity findAccountByAccountId(int accountId);

    AccountEntity findAccountByUsername(String username);

    AccountEntity checkLogin(String username, String password);

    AccountEntity saveAccount(AccountEntity accountEntity);

}
