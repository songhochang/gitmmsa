public class Hw02 {

    public static void main(String[] args) {

//        while (true) {
//            int a = (int) (Math.random() * 100);
//            if (a >= 1 && a <= 6) {
//                int value = a;
//                System.out.println(value);
//                break;
//            }
//        }
        // 0 <= random < 1
        // 0 <= random < 10 => random % 6 => 0 ~ 5
        // 0 <= random < 6
        // 1 <= random < 7
//        int a = (int)(Math.random() * 6);
//        System.out.println(a);

        //1~6 0~5
        for(int i = 0; i < 100; i++){
            int a = (int)(Math.random() * 6) + 1;
            System.out.println(a);
        }


        // 13 ~ 38 -> 0 ~ 25
//        for(int i = 0; i < 100; i++){
//            int a = (int)(Math.random() * 100 % 26) + 13;
//            System.out.println(a);
//        }
    }

}
