import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {

        int[][] num = new int [4][3];

        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num[3].length);

        int a = 12;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                num[i][j] = a--;
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println(a);
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

        Arrays.fill(num[0], 20);
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));

        for(int i = 0; i < num.length; i++){
            Arrays.fill(num[i], 15);
            System.out.println(Arrays.toString(num[i]));
        }

        int[][][][] four = new int[1][3][4][2];

    }

}
