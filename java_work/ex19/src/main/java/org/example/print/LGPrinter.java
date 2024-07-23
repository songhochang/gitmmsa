package org.example.print;

import org.example.inter.Printable;

public class LGPrinter implements Printable {

    public void print(String mydoc){
        System.out.println("LG Printer printing...");
        System.out.println(mydoc);
    }

    public void printCMYK(String mydoc) {
        System.out.println("LG Printer printing...");
        System.out.println(mydoc);
    }

}
