import java.util.Arrays;
import java.util.Scanner;

public class A06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("num : ");
        int num = sc.nextInt();
        System.out.print("total : ");
        int total = sc.nextInt();

        int[] answer = new int[num];

        int index = 0;

        while(true){
            int sum = 0;

            for(int i = index; i < num + index; i++){
                sum = sum + i;
            }

            if(sum > total){
                index--;
                index--;
            }

            if(sum == total){
                for(int i = 0; i < num; i++){
                    answer[i] = index;
                    index++;
                }
                break;
            }

            index++;

        }

        System.out.println(Arrays.toString(answer));

    }

}
