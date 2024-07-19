package org.example;

import org.example.phone.MobilePhone;
import org.example.phone.SmartPhone;

public class Ex01 {

    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone("5.0", 12345678);
        sp.show();

        System.out.println();

        MobilePhone mb = new MobilePhone(87654321);
        mb.show();

    }

}
