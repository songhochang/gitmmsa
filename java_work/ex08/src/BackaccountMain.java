public class BackaccountMain {

    public static void main(String[] args) {

        Bankaccount a = new Bankaccount();
        Bankaccount b = new Bankaccount();

        //toString 은 참조 변수 출력시 생략가능하다
        //toString 은 내가 다시 정의 할 수 있다
        System.out.println("a참조변수 = " + a);
        System.out.println("b참조변수 = " + b);

        System.out.println();
        a.mod();

        System.out.println("a참조변수 = " + a);
        System.out.println("b참조변수 = " + b);

    }

}
