public class Hw01 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                sum = i + j;
                if(sum == 6){
                    System.out.print("첫번째 주사위의 값 : " + i + " ");
                    System.out.println("두번쨰 주사위의 값 : " + j);
                }
            }
        }

//        int a = 0;
//        int b = 6;
//        int sumw;
//
//        while (a < 6 && b > 1 && b <= 6) {
//            a = a + 1;
//            b = b - 1;
//
//            sumw = a + b;
//            if (sumw == 6) {
//                System.out.print("첫번째 주사위의 값 : " + a + " ");
//                System.out.println("두번쨰 주사위의 값 : " + b);
//            }
//        }

    }

}
