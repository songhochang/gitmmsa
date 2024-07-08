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

    }



}
