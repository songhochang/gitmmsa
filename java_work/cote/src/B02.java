public class B02 {

    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";

        char[] c = my_string.toCharArray();

        int answer = 0;

        for(int i = 0; i < c.length; i++){
            if(c[i] > 48 && c[i] < 58){
                answer = answer + c[i] - 48;
            }
        }

        System.out.println(answer);

    }

}
