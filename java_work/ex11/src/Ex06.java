public class Ex06 {

    public static void main(String[] args) {

        /*
        String -> char
        char -> String
         */

        String str = "우리는 할 수 있다.";
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                chars[i] = '*';
            }
            System.out.print(chars[i]);
        }

        System.out.println();

        chars[4] = 'A';
        System.out.println(chars[4]);

        String aa = new String(chars);
        System.out.println(aa);

    }

}
