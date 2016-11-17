package com.shoppee.common.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by thanh on 16/9/2016.
 */
public class IntegerUtils {

    // Get current date
    public static int getCurrentDay() {
        GregorianCalendar date = new GregorianCalendar();
        return date.get(Calendar.DAY_OF_MONTH);
    }

    // Get current month
    public static int getCurrentMonth() {
        GregorianCalendar date = new GregorianCalendar();
        return date.get(Calendar.MONTH) + 1;
    }

    // Get current year
    public static int getCurrentYear() {
        GregorianCalendar date = new GregorianCalendar();
        return date.get(Calendar.YEAR);
    }
}
