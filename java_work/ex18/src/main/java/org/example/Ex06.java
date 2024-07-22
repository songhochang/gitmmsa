package org.example;

public class Ex06 {

    public static void main(String[] args) {

        String mydoc = "My document";

        Printable prn = new SPrint();
        prn.print(mydoc);

        prn = new LPrint();
        prn.print(mydoc);

    }

}
