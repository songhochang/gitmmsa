import java.util.Scanner;

public class Hw03 {

    public static void doA() {

        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                sum = i + j;
                if (sum == 6) {
                    System.out.print("첫번째 주사위 눈 : " + i + " ");
                    System.out.println("두번째 주사위 눈" + j);
                }
            }
        }

    }

    public static void doB() {

        while (true) {
            int a = (int) (Math.random() * 100);
            if (a >= 1 && a <= 6) {

                int value = a;
                System.out.println(value);

                break;
            }
        }

    }

    public static void doC() {
        int a = (int) (Math.random() * 10 % 6 + 1);
        System.out.println(a);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.equals("A")) {
            doA();
        } else if (s.equals("B")) {
            doB();
        } else if (s.equals("C")) {
            doC();
        } else {
            return;
        }

    }

}