public class Ex01 {

    public static void main(String[] args){

        int total = 5000;
        System.out.println("DVD 하나 빌려서 3500원 남음");
        total = 3500;

        int bread = 500;
        int snack = 700;
        int coke = 400;

        total = total - (bread + snack + coke);
        System.out.println(total);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 4; k++){
                    if(1900 == bread * i + snack * j + coke * k){
                        System.out.println("크림빵 : " + (1 + i) + " 새우깡 : " + (1 + j) + " 콜라 : " + (1 + k));
                    }
                }
            }
        }



    }

}
