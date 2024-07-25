public class B06 {

    public static void main(String[] args) {

        String myString = "abstract algebra";

        char[] c = myString.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] > 65 && c[i] <= 90) {
                c[i] = (char)(c[i] + 32);
            }
            else if(c[i] == 97){
                c[i] = (char)(c[i] - 32);
            }
        }

        String answer = new String(c);

        System.out.println(answer);

    }

}
