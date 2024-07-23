package org.example;

import org.example.inter.CMYKPrintable;
import org.example.inter.Printable;
import org.example.print.CMYKPrinter;

public class Ex01 {

    public static void main(String[] args) {

        System.out.println(Printable.WIDTH);
        System.out.println(CMYKPrintable.HEIGHT);

        CMYKPrintable prn = new CMYKPrinter();
        prn.print("Old Printer");
        prn.printCMYK("My document");

        prn.clean();

        Printable.printLine();

    }

}
