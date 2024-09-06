package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws Exception{

        OutputStream os = new FileOutputStream("data.dat");
        os.write(3);;
        os.close();

        InputStream is = new FileInputStream("data.dat");
        int dat = is.read();
        is.close();

        System.out.println(dat);

    }
}