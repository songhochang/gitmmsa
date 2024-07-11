public class Ex03 {

    public static void main(String[] args) {

        int a[] = new int[10];
        int b[] = {1, 2, 3, 4};
        int c[] = a;

        System.out.println(a.length);

        System.out.println(a[0]); //값이 없어서 0
        System.out.println(a[1]); //값이 없어서 0
        System.out.println(a[2]); //값이 없어서 0

        a[0] = 20;
        System.out.println(a[0]);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);

        for(int i = 0; i < a.length; i++){
            a[i] = i;
            System.out.println(a[i]);
        }

    }

}
