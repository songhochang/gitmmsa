import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));

    }

}
