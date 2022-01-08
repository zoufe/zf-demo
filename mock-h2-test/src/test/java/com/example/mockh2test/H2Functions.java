package com.example.mockh2test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class H2Functions {
    public static String dateFormat(Date date,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format.replace("%", "")
                .replace("m", "M"));
        return sdf.format(date);

    }

}
