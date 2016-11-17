package com.shoppee.model.interfaces;

import com.shoppee.entity.BillDetailEntity;
import com.shoppee.entity.BillEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface BillDetailModelInterface {

    List<BillDetailEntity> findBillDetailByBillId(BillEntity billId);

    void saveBillDetail(BillDetailEntity billDetailEntity);

}
