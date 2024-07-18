public class Ex06 {

    public static void main(String[] args) {

        String a = "abc";
        String b = "xyz";

        System.out.println(a + b);
        System.out.println(a.concat(b));

        System.out.println(a.compareTo("abc"));
        System.out.println(a.compareTo("ABC"));
        System.out.println(a.compareTo("qweqwe"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ABC"));
        System.out.println(a.compareToIgnoreCase("Abc"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ABcd"));
        System.out.println(a.compareToIgnoreCase("ABcdqwe"));
        System.out.println(a.compareToIgnoreCase("qweqweqwe"));


    }

}
