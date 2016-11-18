//package com.shoppee.service;
//
//import com.shoppee.entity.BillDetailEntity;
//import com.shoppee.entity.BillEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/25/2016.
// */
//@Service
//@Transactional
//public class BillDetailService implements BillDetailServiceInterface {
//
//    @Autowired
//    private BillDetailModelInterface billDetailModelInterface;
//
//    @Override
//    public List<BillDetailEntity> findBillDetailByBillId(BillEntity billId) {
//        return billDetailModelInterface.findBillDetailByBillId(billId);
//    }
//
//    @Override
//    public void saveBillDetail(BillDetailEntity billDetailEntity) {
//        billDetailModelInterface.saveBillDetail(billDetailEntity);
//    }
//
//}
