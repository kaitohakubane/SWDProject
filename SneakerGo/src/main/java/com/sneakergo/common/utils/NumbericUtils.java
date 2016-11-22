package com.sneakergo.common.utils;

import java.sql.Date;
import java.util.Calendar;

/**
 * Created by Hung on 11/22/2016.
 */
public class NumbericUtils {
    public static Date getCurrentDate(){
        Date currentDate = new Date(Calendar.getInstance().getTimeInMillis());
        return currentDate;
    }

    public static Date getNDateBeforeDate(int n){
        Calendar cDate=Calendar.getInstance();
        cDate.add(Calendar.DATE,-n);
        Date nDate=new Date(cDate.getTimeInMillis());
        return nDate;
    }
}
