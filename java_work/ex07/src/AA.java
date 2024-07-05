/*
 * ctrl + shift =f10; 현재 열린 파일 실행
 */

public class AA {

    public static void main(String[] args) {

        int sum = 0;

        int i = 1;

        for (; ; i++) {
            if (i % 2 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
            if (sum >= 100) {
                System.out.println(i);
                break;
            }
        }

    }

}
