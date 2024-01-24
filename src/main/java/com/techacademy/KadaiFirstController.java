package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
    
    @GetMapping("/dayofweek/{ad}")
    public String dispDayOfWeek(@PathVariable String ad) {
        String year = ad.substring(0, 4);
        String month = ad.substring(4, 6);
        String day = ad.substring(6);
        
        int year1 = Integer.parseInt(year);
        int month1 = Integer.parseInt(month);
        int day1 = Integer.parseInt(day);
        
        Calendar calender = Calendar.getInstance();
        calender.set(year1, month1-1, day1);
        int week = calender.get(Calendar.DAY_OF_WEEK) - 1;
        String[] week_name = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return week_name[week];
    }
    
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res;
    }
}
