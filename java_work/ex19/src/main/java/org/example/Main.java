package org.example;

import org.example.inter.Printable;
import org.example.print.LGPrinter;
import org.example.print.SamPrinter;

public class Main {

    public static void main(String[] args) {

        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

        // fianl 예약이 붙어 있어서 값의 변경이 불가능
//        Printable.HEIGHT = 90;

        Printable prn = new LGPrinter();
        prn.print("My document");

        prn = new SamPrinter();
        prn.print("My document");


    }

}