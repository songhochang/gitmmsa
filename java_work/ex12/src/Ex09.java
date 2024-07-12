import java.util.Arrays;

public class Ex09 {

    public static void main(String[] args) {

        String[] str = {"aa", "bb", "cc"};

        for(String e : str){
            System.out.print(e + " ");
        }

        System.out.println();


        int ar[] = {1, 2, 3, 4 ,5};

        //첫번째
        System.out.println(Arrays.toString(ar));
        //두번째
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        //3번째
        for(int e : ar){
            System.out.print(e + " ");
        }

    }

}
