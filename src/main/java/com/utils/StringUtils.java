package com.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * @Description
 * @Author semstouch
 * @Date 2017/4/7
 **/
public class StringUtils {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
    public static Long getNowTime(){
        Date date = new Date(System.currentTimeMillis());
        return  date.getTime();
    }

    /**
     * 获取现在时间
     *
     * @return 返回短时间字符串格式yyyy-MM-dd
     */
    public static String getStringMonthShort() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 获取现在时间
     * @return 返回短时间字符串格式yyyyMMdd
     */
    public static String getStringToday() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 获取昨日起始时间
     * @return
     */
    public static Long yesterdayStartTime(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String yesterday = new SimpleDateFormat( "yyyy-MM-dd").format(cal.getTime());
        String yesterdayBegin = yesterday + " 00:00:00";
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(yesterdayBegin);
            return date.getTime();
        }
        catch (ParseException e)
        {
            System.out.println("时间获取失败"+e.getMessage());
        }
        return null;
    }

    /**
     * 获取昨日结束时间
     * @return
     */
    public static Long yesterdayEndTime(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String yesterday = new SimpleDateFormat( "yyyy-MM-dd").format(cal.getTime());
        String yesterdayBegin = yesterday + " 23:59:59";
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(yesterdayBegin);
            return date.getTime();
        }
        catch (ParseException e)
        {
            System.out.println("时间获取失败"+e.getMessage());
        }
        return null;
    }


    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat2.parse("2017-04-11 00:00:00");
        System.out.println(date.getTime());

        System.out.println(yesterdayStartTime());

    }
}
