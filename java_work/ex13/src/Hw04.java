public class Hw04 {

    public static void main(String[] args) {

        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};

        for(int i = 1; i <= 4; i++){
            String count = "";
            for(int j = 0; j < answer.length; j++){
                if(answer[j] == i){
                    count = count + "*";
                }
            }
            System.out.println(i + count);
        }

    }

}
