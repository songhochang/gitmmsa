import java.util.Arrays;

public class B07 {

    public static void main(String[] args) {

        String my_string = "abcdef";
        String letter = "f";

        String answer = Arrays.toString(my_string.split(letter));
        System.out.println(answer);

    }

}
