import java.util.Arrays;

public class A02 {

    public static void main(String[] args) {

        String my_string = "banana";
        String[] msarr = new String[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            msarr[i] = my_string.substring(i);
        }

        String[] answer = msarr;
        
        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
    }

}
