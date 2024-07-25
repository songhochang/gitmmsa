public class B05 {

    public static void main(String[] args) {

        String my_string = "cccCCC";

        char[] c = my_string.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] <= 90){
                c[i] = (char)(c[i] + 32);
            }
            else if(c[i] <= 122){
                c[i] = (char)(c[i] -32);
            }
        }

        String answer = new String(c);

        System.out.println(answer);

    }

}
