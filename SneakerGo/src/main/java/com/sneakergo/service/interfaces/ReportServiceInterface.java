package com.shoppee.service.interfaces;

import com.shoppee.entity.FlotPieChart;
import com.shoppee.entity.MorisAreaChart;

import java.util.List;

/**
 * Created by Administrator on 10/10/2016.
 */
public interface ReportServiceInterface {
    List<FlotPieChart> findImportProductInMonth(int month, int year);

    List<FlotPieChart> staticWarehouseConsumer();

    List<MorisAreaChart> getRevenueByYear(int year);
}
