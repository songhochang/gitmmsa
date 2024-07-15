public class Hw03 {

    public static void main(String[] args) {

        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        String count1 = "";
        String count2 = "";
        String count3 = "";
        String count4 = "";


        for(int i = 0; i < answer.length; i++){
            if(answer[i] == 1){
                count1 = count1 + "*";
            }
            else if(answer[i] == 2){
                count2 = count2 + "*";
            }
            else if(answer[i] == 3){
                count3 = count3 + "*";
            }
            else{
                count4 = count4 + "*";
            }
        }

        System.out.println("1" + count1);
        System.out.println("2" + count2);
        System.out.println("3" + count3);
        System.out.println("4" + count4);

    }

}
