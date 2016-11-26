package com.sneakergo.common.utils;

import com.sneakergo.common.constants.ParamConstant;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Hung on 11/22/2016.
 */
public class NumbericUtils {
    public static Date getCurrentDate(){
        Date currentDate = new Date(GregorianCalendar.getInstance().getTimeInMillis());
        return currentDate;
    }

    public static Date getNDateBeforeDate(int n){
        Calendar cDate=GregorianCalendar.getInstance();
        cDate.add(Calendar.DATE,-n);
        Date nDate=new Date(cDate.getTimeInMillis());
        return nDate;
    }

    public static Date getDate(int year,int month,int day){
        Calendar calendar = new GregorianCalendar(year,month,day);
        Date nDate=new Date(calendar.getTimeInMillis());
        return nDate;
    }
}
