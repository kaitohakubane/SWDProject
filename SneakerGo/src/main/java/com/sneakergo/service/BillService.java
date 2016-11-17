package com.shoppee.service;

import com.shoppee.entity.AccountEntity;
import com.shoppee.entity.BillEntity;
import com.shoppee.model.interfaces.BillModelInterface;
import com.shoppee.service.interfaces.BillServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
@Service
@Transactional
public class BillService implements BillServiceInterface {

    @Autowired
    private BillModelInterface billModelInterface;

    @Override
    public BillEntity findBillByBillId(int billId) {
        return billModelInterface.findBillByBillId(billId);
    }

    @Override
    public List<BillEntity> findAllBills() {
        return billModelInterface.findAllBills();
    }

    @Override
    public List<BillEntity> findBillByAccountId(AccountEntity accountId) {
        return billModelInterface.findBillByAccountId(accountId);
    }

    @Override
    public void updateStatusBill(BillEntity billEntity) {
        BillEntity bill = billModelInterface.findBillByBillId(billEntity.getBillId());
        if (bill != null) {
            bill.setStatus(billEntity.getStatus());
        }
    }

    @Override
    public void removeBill(BillEntity billEntity) {
        BillEntity bill = billModelInterface.findBillByBillId(billEntity.getBillId());
        if (bill != null) {
            bill.setEnabled(billEntity.getEnabled());
        }
    }

    @Override
    public List<BillEntity> listAllBillByDay(int day, int month, int year) {
        return billModelInterface.listAllBillByDay(day, month, year);
    }

    @Override
    public BillEntity saveBill(BillEntity billEntity) {
        return billModelInterface.saveBill(billEntity);
    }

    @Override
    public int countAllOrder() {
        return billModelInterface.countAllOrder();
    }

}
