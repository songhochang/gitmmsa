import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String a = "Progra21Sremm3";

        char[] c = a.substring(6,13).toCharArray();

        for(int i = 0; i < c.length/2; i++){
            char ch = c[i];
            c[i] = c[c.length -1 - i];
            c[c.length -1 - i] = ch;
        }

        String str = new String(c);

        String answer = a.substring(0,6) + str + a.substring(13);

        System.out.println(answer);

    }

}