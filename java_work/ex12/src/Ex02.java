public class Ex02 {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "java";
        String c = "system";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());

        System.out.println(a.length() + b.length() + c.length());

//        char[] c = new char[3]; // 문자배열

        String[] str = new String[3]; // 문자열 배열
        str[0] = "abcd";
        str[1] = "java";
        str[2] = "system";

        //배열의 길이는 length
        //스트링의 길이는 length(), charAt(), split, subString, toCharArray()

        System.out.println(str[0].length() + str[1].length() + str[2].length());

        int count = 0;

        for(int i = 0; i < str.length; i++){
            System.out.println(i);
            System.out.println(str[i]);
            System.out.println(str[i].length());
            count = count + str[i].length();
        }

        System.out.println(count);

    }

}
