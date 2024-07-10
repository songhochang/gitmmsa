class B {
//    (public)생략가능 B(){
//        System.out.println("생성자");
//    }  <- 이것도 생략되있음(생성자)

    int a = 10;

    //    public String toString(){} 이거 생략되있음
    B() {
        System.out.println("생성자");
        a = 20;
    }

}

public class Ex02 {

    public static void main(String[] args) {
        //생성자는 함수와 비슷한 모양이지만 변환값을 적지 않는다

        B b = new B();
        System.out.println(b.a);

    }

}
