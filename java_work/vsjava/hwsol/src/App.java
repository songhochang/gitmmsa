public class App {

    public static void doA() {
        int sum = 0;

        for (int i = 0; i <= 20; i++) {

            if (i % 2 != 0 && i % 3 != 0) {

                sum = sum + i;

            }

        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws Exception {

        doA();

    }
}
