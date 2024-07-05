public class EX111 {

    public static void main(String[] args){

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j < i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

        //1 2 3
        //4 5 6
        //7 8 9

        for(int i = 0; i < 9; i = i + 3){
            // i 0 3 6
            // j 1 2 3
            // 1 2 3
            // 4 5 6
            // 7 8 9
            for(int j = 1; j <= 3; j++){

                System.out.print(i + j + " ");

            }
            System.out.println();
        }

        int a = 0;

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <=3; j++){
             a++;
                System.out.print(a + " ");
            }
            System.out.println();
        }

        //1 4 7
        //2 5 8
        //3 6 9

        for(int i = 1; i <= 3; i++){
            for(int j = 0; j < 9; j = j + 3){
                // 1 2 3    0 3 6
                // 1
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }

        int b = 0;

        for(int i = 0; i < 3; i++){
            b = i + 1;
            for(int j = 0; j < 3; j++){
                System.out.print(b + " ");
                b = b + 3;
            }
            System.out.println();
        }
        //1 X X
        //X 2 X
        //X X 3

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        //1 X X
        //X 1 X
        //X X 1



    }

}
