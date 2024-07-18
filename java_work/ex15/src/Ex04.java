public class Ex04 {

    public static void main(String[] args) {

        String str1 = "String";
        String str2 = "new String";

//        System.out.println(str1);
//        System.out.println(str1.length());
//        System.out.println();
//
//        System.out.println(str2);
//        System.out.println(str2.length());
//        System.out.println();

        show(str1);
        show(str2);
        show("Fucking String");
    }

    public static void show(String str){
        System.out.println(str);
        System.out.println(str.length());
        System.out.println();
    }

}
