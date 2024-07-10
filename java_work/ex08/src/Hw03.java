public class Hw03 {

    public static void main(String[] args) {

        for(int a = 1; a < 10 ; a++){
            for(int b = 1; b < 10 ; b++){
                for(int c = 1; c < 10 ; c++){
                    if(a * 500 + b * 700 + c * 400 == 3500){
                        System.out.println("크림빵 " + a + "개 " + "새우깡 " + b + "개 " + "콜라 " + c + "개");
                    }
                }
            }
        }

        //크*a + 새*b + 코*c

//        int a = 0, b = 0, c = 0;
//
//        int n = 3500;
//
//        d(a, b, c, n);

    }

//    public static void d(int a, int b, int c, int n) {
//
//        if(n < 0){
//            return;
//        }
//
//        if (n == 0) {
//            if (a != 0 && b != 0 && c != 0) {
//                System.out.println("크림빵 " + a + "개 " + "새우깡 " + b + "개 " + "콜라 " + c + "개");
//            }
//            return;
//        }
//        else {
//            d(a+1, b, c, n - 500);
//            d(a, b+1, c, n - 700);
//            d(a, b, c+1, n - 400);
//        }
//
//
//    }


}
