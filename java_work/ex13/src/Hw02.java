public class Hw02 {

    public static void main(String[] args) {

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr[0].length; j++){
                sum = sum + arr[i][j];
            }
        }
        int average = sum / (arr.length * arr[0].length);

        System.out.println("배열의 총합 : " + sum);
        System.out.println("배열의 평균 : " + average);

    }

}
