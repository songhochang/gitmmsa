import java.util.Arrays;

public class A01 {

    public static void main(String[] args) {

        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        char[] carr = my_string.toCharArray();

        char[][] ch = new char[my_string.length()/m][m];

        int k = 0;

        for(int i = 0; i < my_string.length()/m; i++){
            for(int j = 0; j < m; j++){
                ch[i][j] = carr[k];
                k++;
            }
        }

        char[] ca1 = new char[ch.length];

        for(int i = 0; i < ch.length; i++){
            ca1[i] = ch[i][c-1];
        }

        String answer = new String(ca1);
        System.out.println(answer);

    }

}
