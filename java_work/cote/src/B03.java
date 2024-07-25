import java.util.Arrays;

public class B03 {

    public static void main(String[] args) {

        String num_str = "123456789";
        int answer = 0;

        char[] c = num_str.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] == '0'){
                answer = answer + 0;
            }
            else if(c[i] == '1'){
                answer = answer + 1;
            }
            else if(c[i] == '2'){
                answer = answer + 2;
            }
            else if(c[i] == '3'){
                answer = answer + 3;
            }
            else if(c[i] == '4'){
                answer = answer + 4;
            }
            else if(c[i] == '5'){
                answer = answer + 5;
            }
            else if(c[i] == '6'){
                answer = answer + 6;
            }
            else if(c[i] == '7'){
                answer = answer + 7;
            }
            else if(c[i] == '8'){
                answer = answer + 8;
            }
            else if(c[i] == '9'){
                answer = answer + 9;
            }
        }

        System.out.println(answer);

    }

}

