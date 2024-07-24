public class B03 {

    public static void main(String[] args) {

        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        char[] c = new char[cipher.length() / code];
        char[] c_cipher = cipher.toCharArray();

        for(int i = 0; i < c.length; i++){
            for(int j = 1; j < c_cipher.length; j++){
                if(j % code == 0){
                    c[i] = c_cipher[j];
                }
            }
        }

        String answer = new String(c);

        System.out.println(answer);

    }

}
