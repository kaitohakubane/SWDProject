package com.shoppee.controller;

import com.shoppee.common.constants.PageConstant;
import com.shoppee.common.constants.ParamConstant;
import com.shoppee.common.utils.StringUtils;
import com.shoppee.controller.interfaces.AccountControllerInterface;
import com.shoppee.entity.AccountEntity;
import com.shoppee.service.interfaces.AccountServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by HuanTNH on 9/27/2016.
 */
@RestController
public class AccountController implements AccountControllerInterface {

    @Autowired
    private AccountServiceInterface accountServiceInterface;

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.GET_ACCOUNT_URL, method = RequestMethod.POST)
    public AccountEntity getAccount(@RequestParam(value = ParamConstant.ACCOUNT_ID) int accountId) {
        return accountServiceInterface.findAccountByAccountId(accountId);
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.ACCOUNT_REGISTER_PAGE_URL, method = RequestMethod.POST)
    public AccountEntity saveAccount(@RequestParam(value = ParamConstant.LASTNAME) String lastName,
                                     @RequestParam(value = ParamConstant.FIRSTNAME) String firstName,
                                     @RequestParam(value = ParamConstant.USERNAME) String username,
                                     @RequestParam(value = ParamConstant.PASS) String password,
                                     @RequestParam(value = ParamConstant.BIRTHDAY) String birthday,
                                     @RequestParam(value = ParamConstant.ADDRESS) String address,
                                     @RequestParam(value = ParamConstant.PHONE) String phone,
                                     @RequestParam(value = ParamConstant.EMAIL) String email) {
        AccountEntity accountEntity = accountServiceInterface.findAccountByUsername(username);
        if (accountEntity == null) {
            try {
                accountEntity = new AccountEntity();
                accountEntity.setLastName(lastName);
                accountEntity.setFirstName(firstName);
                accountEntity.setUsername(username);
                accountEntity.setPassword(StringUtils.generateEncodePassword(password));
                accountEntity.setBirthday(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE_API).parse(birthday).getTime()));
                accountEntity.setAddress(address);
                accountEntity.setPhone(phone);
                accountEntity.setEmail(email);
                accountEntity.setRole(ParamConstant.ROLE);
                accountEntity.setEnabled(true);

                return accountServiceInterface.saveAccount(accountEntity);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.ACCOUNT_LOGIN_PAGE_URL, method = RequestMethod.POST)
    public AccountEntity checkLogin(@RequestParam(value = ParamConstant.USERNAME) String username,
                                    @RequestParam(value = ParamConstant.PASS) String password) {
        return accountServiceInterface.checkLogin(username, password);
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.ACCOUNT_UPDATE_PAGE_URL, method = RequestMethod.POST)
    public boolean updateAccount(@RequestParam(value = ParamConstant.ACCOUNT_ID) int accountId,
                                 @RequestParam(value = ParamConstant.LASTNAME) String lastName,
                                 @RequestParam(value = ParamConstant.FIRSTNAME) String firstName,
                                 @RequestParam(value = ParamConstant.BIRTHDAY) String birthday,
                                 @RequestParam(value = ParamConstant.ADDRESS) String address,
                                 @RequestParam(value = ParamConstant.PHONE) String phone,
                                 @RequestParam(value = ParamConstant.EMAIL) String email) {
        AccountEntity currentAccount = accountServiceInterface.findAccountByAccountId(accountId);

        if (currentAccount != null) {
            try {
                currentAccount.setLastName(lastName);
                currentAccount.setFirstName(firstName);
                currentAccount.setBirthday(new java.sql.Date(new SimpleDateFormat(ParamConstant.DATE).parse(birthday).getTime()));
                currentAccount.setAddress(address);
                currentAccount.setPhone(phone);
                currentAccount.setEmail(email);

                accountServiceInterface.updateAccount(currentAccount);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = PageConstant.ACCOUNT_CHANGE_PASS_PAGE_URL, method = RequestMethod.POST)
    public boolean changePassword(@RequestParam(value = ParamConstant.ACCOUNT_ID) int accountId,
                                  @RequestParam(value = ParamConstant.OLD_PASS) String oldPassword,
                                  @RequestParam(value = ParamConstant.NEW_PASS) String newPassword) {
        AccountEntity currentAccount = accountServiceInterface.findAccountByAccountId(accountId);

        if (currentAccount != null) {
            if (StringUtils.matchPassword(oldPassword, currentAccount.getPassword())) {
                currentAccount.setPassword(StringUtils.generateEncodePassword(newPassword));

                accountServiceInterface.changePassword(currentAccount);
                return true;
            }
        }

        return false;
    }

}
