//package com.shoppee.service;
//
//import com.shoppee.entity.FlotPieChart;
//import com.shoppee.entity.MorisAreaChart;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * Created by Administrator on 10/10/2016.
// */
//@Service
//@Transactional
//public class ReportService implements ReportServiceInterface {
//    @Autowired
//    ReportModelInterface reportModelInterface;
//
//    @Override
//    public List<FlotPieChart> findImportProductInMonth(int month, int year) {
//        return reportModelInterface.findImportProductInMonth(month, year);
//    }
//
//    @Override
//    public List<FlotPieChart> staticWarehouseConsumer() {
//        return reportModelInterface.staticWarehouseConsumer();
//    }
//
//    @Override
//    public List<MorisAreaChart> getRevenueByYear(int year) {
//        return reportModelInterface.getRevenueByYear(year);
//    }
//}
