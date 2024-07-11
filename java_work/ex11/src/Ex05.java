public class Ex05 {

    public static void main(String[] args) {

        String str = "안/녕/하/세/요/";
        String[] teststr = str.split("/");
        for(int i = 0; i < teststr.length; i++){
            System.out.println(teststr[i]);
        }

        String a = "abcdefgh";
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));

        System.out.println(a.substring(2));
        System.out.println(a.substring(2, 5));
        System.out.println(a.toUpperCase());
        System.out.println("cd 있냐 " + a.contains("cd"));

        System.out.println("배열시작");
        char[] test = a.toCharArray();
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
        System.out.println("배열끝");

        test[2] = 'A';
        String testStr = new String(test);
        System.out.println(testStr);

        int[] b = new int[3];
        System.out.println(b.length);

        char[] qwer = {'A', 'b', 'c', 'd'};
        String qwerstr = new String(qwer);

    }

}
