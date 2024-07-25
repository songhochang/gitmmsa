import java.util.Arrays;

public class B04 {

    public static void main(String[] args) {

        String my_string = "programmers";

        String alp = "p";
        char[] alpc = alp.toCharArray();

        char[] c = my_string.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] == alpc[0]){
                c[i] = (char) (c[i] - 32);
            }
        }

        String answer = new String(c);

        System.out.println(Arrays.toString(c));

    }

}
