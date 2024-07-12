public class Ex03 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        int[] c = new int[3];

//        c[0] = 1;
//        c[1] = 2;
//        c[2] = 3;

        c = a;

        System.out.println(c[1]);



    }

}
