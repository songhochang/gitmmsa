package org.example;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex07 {

    public static void main(String[] args) throws  Exception{

        Path path = Paths.get("cc");

        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write(10);
            outputStream.write(65);
            outputStream.write(10);
            outputStream.write(65);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
