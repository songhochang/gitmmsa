package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex02 {

    public static void main(String[] args) {

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("mydata"))){
            dos.writeInt(4);
            dos.writeDouble(17.3);
            dos.writeInt(9);
        }catch (Exception e){
            e.printStackTrace();
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("mydata"))){
            int temp = dis.readInt();
            double temp2 = dis.readDouble();
            int temp3 = dis.read();

            System.out.println(temp);
            System.out.println(temp2);
            System.out.println(temp3);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
