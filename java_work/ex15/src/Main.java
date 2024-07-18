import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str = "Hello.java";
        String temp[] = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "Hello.java";
        temp = str.split("[A-Z]");

        System.out.println(temp);
        System.out.println(Arrays.toString(temp));
    }
}