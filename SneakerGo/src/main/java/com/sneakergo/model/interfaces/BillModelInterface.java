package com.shoppee.model.interfaces;

import com.shoppee.entity.AccountEntity;
import com.shoppee.entity.BillEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface BillModelInterface {

    BillEntity findBillByBillId(int billId);

    List<BillEntity> findAllBills();

    List<BillEntity> findBillByAccountId(AccountEntity accountId);

    List<BillEntity> listAllBillByDay(int day, int month, int year);

    BillEntity saveBill(BillEntity billEntity);

    int countAllOrder();
}
