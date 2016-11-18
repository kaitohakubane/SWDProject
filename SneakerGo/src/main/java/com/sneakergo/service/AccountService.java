//package com.shoppee.service;
//
//import com.shoppee.entity.AccountEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * Created by HuanTNH on 9/25/2016.
// */
//@Service
//@Transactional
//public class AccountService implements AccountServiceInterface {
//
//    @Autowired
//    private AccountModelInterface accountModelInterface;
//
//    @Override
//    public AccountEntity findAccountByAccountId(int accountId) {
//        return accountModelInterface.findAccountByAccountId(accountId);
//    }
//
//    @Override
//    public AccountEntity findAccountByUsername(String username) {
//        return accountModelInterface.findAccountByUsername(username);
//    }
//
//    @Override
//    public AccountEntity checkLogin(String username, String password) {
//        return accountModelInterface.checkLogin(username, password);
//    }
//
//    @Override
//    public AccountEntity saveAccount(AccountEntity accountEntity) {
//        return accountModelInterface.saveAccount(accountEntity);
//    }
//
//    @Override
//    public void updateAccount(AccountEntity accountEntity) {
//        AccountEntity account = accountModelInterface.findAccountByAccountId(accountEntity.getAccountId());
//        if (account != null) {
//            account.setLastName(accountEntity.getLastName());
//            account.setFirstName(accountEntity.getFirstName());
//            account.setBirthday(accountEntity.getBirthday());
//            account.setAddress(accountEntity.getAddress());
//            account.setPhone(accountEntity.getPhone());
//            account.setEmail(accountEntity.getEmail());
//        }
//    }
//
//    @Override
//    public void changePassword(AccountEntity accountEntity) {
//        AccountEntity account = accountModelInterface.findAccountByAccountId(accountEntity.getAccountId());
//        if (account != null) {
//            account.setPassword(accountEntity.getPassword());
//        }
//    }
//
//
//}
