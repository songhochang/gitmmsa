import java.util.Arrays;

public class A03 {

    public static void main(String[] args) {

        int start_num = 3;
        int end_num = 10;

        int[] answer = new int[end_num - start_num + 1];

        for(int i = 0; i < answer.length; i++){
            answer[i] = end_num;
            end_num--;
        }

        System.out.println(Arrays.toString(answer));

    }

}
