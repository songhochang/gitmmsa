import java.util.Arrays;

public class B01 {

    public static void main(String[] args) {

        String my_string = "nice to meet you";
        String answer = my_string.replace("a","");
        answer = answer.replace("e","");
        answer = answer.replace("i","");
        answer = answer.replace("o","");
        answer = answer.replace("u","");

        System.out.println(answer);

    }

}
