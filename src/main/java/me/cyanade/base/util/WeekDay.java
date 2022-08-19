package me.cyanade.base.util;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;

public class WeekDay {

    private static ZonedDateTime ZONED_DATE_TIME = ZonedDateTime.now();

    public static void update(){
        ZONED_DATE_TIME = ZonedDateTime.now();
    }

    public static DayOfWeek getDayOfWeek(){
        update();
        return ZONED_DATE_TIME.toLocalDateTime().getDayOfWeek();
    }

    public static String getDayOfWeekDisplay(){
        return getDayOfWeek().name().substring(0, 1).toUpperCase() + getDayOfWeek().name().substring(1).toLowerCase();
    }

    public static boolean isWeekend(){
        return getDayOfWeek() == DayOfWeek.SATURDAY || getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    public static boolean isWeekDay(){
        return !isWeekend();
    }

}