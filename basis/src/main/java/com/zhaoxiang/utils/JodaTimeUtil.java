package com.zhaoxiang.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Author: RiversLau
 * Date: 2017/7/10 11:34
 */
public class JodaTimeUtil {

    private static final DateTimeFormatter YYYY_MM_DDHHMMSSEE = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss EE");

    private JodaTimeUtil() {}

    public static String long2YYYY_MM_DDHHMMSS(Date sourceDate) {

        DateTime targetTime = new DateTime(sourceDate);
        return targetTime.toString(YYYY_MM_DDHHMMSSEE);
    }
}
