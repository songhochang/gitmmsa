package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class Ex04 {

    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter((new FileWriter("myfile",true)));

        bw.write("글자 바꾸기");
        bw.newLine();
        bw.write("???");
        bw.newLine();
        bw.write("bbb");
        bw.close();

        BufferedReader fr = new BufferedReader(new FileReader("myfile"));

        while (true){
            String str = fr.readLine();
            System.out.println(str);

            if(str == null){
                break;
            }
        }

        fr.close();

    }

}
