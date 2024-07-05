public class Ex02 {

    public static void main(String[] args) {

        int sum1 = 0, sum2 = 0;
        int i = 1;
        for (; ; i++) {
            if (i % 2 != 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 - i;
            }

            if (sum1 + sum2 >= 100) {
                System.out.println(i);
                break;
            }

        }


    }

}
