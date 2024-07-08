public class Ex04 {

    public static int fact(int a) {

        if (a > 0) {
            return a * fact(a - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        int result = fact(5);
        System.out.println(result);

    }

}
