package org.example;

import org.example.inter.Printable;

public class Ex02 {

    public static void main(String[] args) {

        Printable prn = new Printable() {
            @Override
            public void print(String mydoc) {
                System.out.println("TEST...\n" + mydoc);
            }
        };

        prn.print("New Document Printing...");

        Printable prn2 = (mydoc) -> {
            System.out.println("Printing Document with Lambda\n" + mydoc);
        };

        prn2.print("LLLLLLaaaaammmmbbbbbDDDDDaaaa");

    }

}
