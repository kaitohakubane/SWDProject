package com.shoppee.service.interfaces;

import com.shoppee.entity.BillDetailEntity;
import com.shoppee.entity.BillEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface BillDetailServiceInterface {

    List<BillDetailEntity> findBillDetailByBillId(BillEntity billId);

    void saveBillDetail(BillDetailEntity billDetailEntity);

}
