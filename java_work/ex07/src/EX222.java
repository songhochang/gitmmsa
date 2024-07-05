public class EX222 {

    public static void main(String[] args) {

//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//
//            }
//        }


        //1 X X
        //X 1 X
        //X X 1

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(i%j == 0){
                    System.out.println("1 ");
                }
                System.out.println();
            }
        }

        // X X 1 0 2 1 3
        // X 1 X 1 1 2 2
        // 1 X X 2 0 3 1

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

            }
        }

        // X 1 X  0 1
        // X X 1  1 2
        // 1 X X  2 0

    }

}
