package com.sneakergo.service.interfaces;

import com.sneakergo.entity.BillEntity;
import com.sneakergo.entity.BilldetailEntity;

import java.util.List;

/**
 * Created by Hung on 11/21/2016.
 */
public interface BillDetailServiceInterface {
    List<BilldetailEntity> getBillDetailByBillID(BillEntity billEntity);
}
