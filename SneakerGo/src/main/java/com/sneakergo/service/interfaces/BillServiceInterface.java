package com.shoppee.service.interfaces;

import com.shoppee.entity.AccountEntity;
import com.shoppee.entity.BillEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface BillServiceInterface {

    BillEntity findBillByBillId(int billId);

    List<BillEntity> findAllBills();

    List<BillEntity> findBillByAccountId(AccountEntity accountId);

    void updateStatusBill(BillEntity billEntity);

    void removeBill(BillEntity billEntity);

    List<BillEntity> listAllBillByDay(int day, int month, int year);

    BillEntity saveBill(BillEntity billEntity);

    int countAllOrder();
}
