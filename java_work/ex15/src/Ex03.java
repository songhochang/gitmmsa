//오버로딩?
//메서드 생성자 이름이 같지만 파라메터가 다를떄 사용가능

public class Ex03 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("111111");
        Person p3 = new Person("111111", "12345");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.show();
        p2.show();
        p3.show();
    }

}
