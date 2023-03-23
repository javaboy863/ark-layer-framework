package com.ark.layer.framework.common.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc 日期时间处理工具类
 */
public class DateTimeUtils {
    public static String FORMAT_DEFAULT_MIN = "yyyyMMddHHmmss";
    public static String FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static String FORMAT_YMD_ZERO = "yyyy-MM-dd 00:00:00";
    public static String FORMAT_DEFAULT_CH = "yyyy年MM月dd日 HH时mm分ss秒";
    public static String FORMAT_DEFAULT_YMD = "yyyy-MM-dd";
    public static String FORMAT_DEFAULT_YMD_NS = "yyyyMMdd";
    public static String FORMAT_DEFAULT_WITH_MS = "yyyy-MM-dd HH:mm:ss,SSS";
    public static String FORMAT_MOBILE_WITH_MS = "yyyyMMddHHmmssSSS";

    /**
     * @desc 日期转换为制定的字符串格式
     * @author shaoying
     * @date 2017-12-27 23:05:11
     * @param date
     * @param format
     * @return
     */
    public static String dateToStr(Date date, String format) {
        if (null == date) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }



    /**
     * @desc 计算两日期间相差天数
     * @author shaoying
     * @date 2017-12-27 23:01:28
     * @param d1 开始日期 日期型
     * @param d2 结束日期 日期型
     * @return long 天数
     */
    public static long signDaysBetweenTowDate(Date d1, Date d2) {
        return (d2.getTime() - d1.getTime()) / (3600 * 24 * 1000);
    }

}
