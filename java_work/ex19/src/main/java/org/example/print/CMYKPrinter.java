package org.example.print;

import org.example.inter.CMYKPrintable;

public class CMYKPrinter implements CMYKPrintable {
    @Override
    public void printCMYK(String mydoc) {
        System.out.println("Color Printer ");
        System.out.println(mydoc);
    }

    @Override
    public void print(String mydoc) {
        System.out.println("BW Printer");
        System.out.println(mydoc);
    }
}
