public class FF {

    public static void main(String[] args){

        // math.random() -> 0 < r < 1 = 0.0000001 < r < 0.999999999
        // mat.random()*100 - > 000.00001 < r < 99.99999
        // (int) -> 0 < (int)r < 99
        for(int i = 0; i < 5; i++){
            double r = Math.random()*100;
            System.out.println((int)r);
        }

    }

}
