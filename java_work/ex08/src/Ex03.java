public class Ex03 {

    public static void doA(int a) {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {

        doA(10);
        doA(20);

        int num1 = 10, num2 = 20;

        if (num1 == 10) {
            num2 = 20;
        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        for (int i = 0; i < 3; i++) {

            int a = 20;
            System.out.println(a);

        }

    }

}
