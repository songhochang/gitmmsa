//person
class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    //행동하는 매서드(함수)
    public void greeting() {
        System.out.println(name + " say hello");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//constructor 생성자로 private 변수를 바꿀수 있다.
//setter로 private 변수를 바꿀수 있다.
//다른 생성자 선언시 기본 생성자 생략 불가능

public class Ex01 {

    public static void main(String[] args) {
        // 기본생성자 선언 후 setter 로 변수 name 변경
        Person p1 = new Person();
        // name 을 바꾸는 다른 생성자 선언해서 변수 name 변경
        Person p2 = new Person("훈이");

        p1.setName("철수");
        p2.setName("훈발놈");

        p1.greeting();
        p2.greeting();

        System.out.println(p1);
        System.out.println(p2);
    }

}
