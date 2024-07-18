public class Person {

    private String jumin;
    private String passport;

    public Person() {
    }

    public Person(String jumin) {
        this();
        this.jumin = jumin;
    }

    public Person(String jumin, String passport) {
        this(jumin);
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "jumin='" + jumin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void show(){
        System.out.println("주민 = " + jumin);
        System.out.println("여권 = " + passport);
    }
}
