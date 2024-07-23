package org.example.print;

import org.example.inter.Printable;

public class SamPrinter implements Printable {

    public void print(String mydoc){
        System.out.println("Samsung Printer printing...");
        System.out.println(mydoc);
    }

    public void printCMYK(String mydoc) {
        System.out.println("Samsung Printer printing...");
        System.out.println(mydoc);
    }

}
