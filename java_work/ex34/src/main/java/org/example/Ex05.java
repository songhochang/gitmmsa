package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ex05 {

    public static void main(String[] args) throws IOException {

        Path fp = Paths.get("d:/a/lines.file");

        List list = Arrays.asList("test", "ffff");

        Files.write(fp,list);

        List<String> readlist = Files.readAllLines(fp);

        System.out.println(readlist);

    }

}
