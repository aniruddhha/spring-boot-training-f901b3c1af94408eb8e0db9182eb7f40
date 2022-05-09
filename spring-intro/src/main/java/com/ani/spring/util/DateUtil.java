package com.ani.spring.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtil {

    public long diffFromToday(LocalDate date) {
        return date.until(LocalDate.now(), ChronoUnit.DAYS);
    }

}
