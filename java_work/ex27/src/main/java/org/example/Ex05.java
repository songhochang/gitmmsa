package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05 {

    public static void main(String[] args) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();

        System.out.println(df.format(c.getTime()));

        c.add(Calendar.DAY_OF_MONTH, +7);

        System.out.println(df.format(c.getTime()));

    }

}
