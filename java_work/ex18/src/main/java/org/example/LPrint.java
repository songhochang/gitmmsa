package org.example;

public class LPrint implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("LG Printer");
        System.out.println(doc);
    }
    @Override
    public void doA() {

    }
}
