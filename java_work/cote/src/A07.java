public class A07 {

    public static void main(String[] args) {

        int n = 15;

        int answer = 0;

        String nums = "";

        for(int i = 1; i <= n; i++){
            answer = answer + 1;
            nums = String.valueOf(answer);
            if(nums.contains("3")){
                answer = answer + 1;
            }
            if(answer % 3 == 0){
                answer = answer + 1;
            }
            System.out.println(answer);
        }
        System.out.println(answer);
    }

}
