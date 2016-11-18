//package com.shoppee.controller;
//
//import com.shoppee.common.constants.PageConstant;
//import com.shoppee.common.utils.IntegerUtils;
//import com.shoppee.controller.interfaces.ReportControllerInterface;
//import com.shoppee.entity.FlotPieChart;
//import com.shoppee.entity.MorisAreaChart;
//import com.shoppee.service.interfaces.ReportServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
///**
// * Created by Administrator on 10/10/2016.
// */
//@RestController
//public class ReportController implements ReportControllerInterface {
//
//    @Autowired
//    ReportServiceInterface reportServiceInterface;
//
//    @Override
//    @RequestMapping(value = PageConstant.DAILY_REPORT_PAGE_URL, method = RequestMethod.GET)
//    public ModelAndView initDailyReportPage() {
//        return new ModelAndView(PageConstant.DAILY_REPORT_PAGE);
//    }
//
//    @Override
//    @RequestMapping(value = PageConstant.MONTHLY_REPORT_PAGE_URL, method = RequestMethod.GET)
//    public ModelAndView initMonthlyReportPage() {
//        return new ModelAndView(PageConstant.MONTHLY_REPORT_PAGE);
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.CURRENT_WAREHOUSE_CONSUMER_REPORT_URL, method = RequestMethod.POST)
//    public List<FlotPieChart> staticWarehouseConsumer() {
//        return reportServiceInterface.staticWarehouseConsumer();
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.MONTHLY_IMPORT_PRODUCT_REPORT_URL, method = RequestMethod.POST)
//    public List<FlotPieChart> findImportProductInMonth() {
//        return reportServiceInterface.findImportProductInMonth(IntegerUtils.getCurrentMonth(), IntegerUtils.getCurrentYear());
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.REVENUE_REPORT_URL, method = RequestMethod.POST)
//    public List<MorisAreaChart> getRevenueByYear() {
//        return reportServiceInterface.getRevenueByYear(IntegerUtils.getCurrentYear());
//    }
//}
