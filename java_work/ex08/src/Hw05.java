public class Hw05 {

    public static void main(String[] args){

//        for(int x = 0; x <= 10; x++){
//            for(int y = 0; y <= 10; y++){
//                if(2 * x + 4 * y == 10){
//                    System.out.println("x = " + x + ", y = " + y);
//                }
//            }
//        }

        int x = 0, y = 0;

        d(x, y, 10);

    }

    public static void d(int x, int y, int n){

        if(n == 10){
            return;
        }
        else{
            d(x+1,y,n+2);
            d(x,y, n+4);
        }


    }

}
