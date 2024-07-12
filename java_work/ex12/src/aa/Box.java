package aa;

//클래스 정의
public class Box {

    String name;
    int count;

    // 기본 생성자는 생략 가능하지만 다른 생성자를 선언할시 기본생성자 생략 불가
    // 접근제어지시자 - public, protected, default, private

    public Box () {
        System.out.println("기본 생성자 호출");
    }

    public Box (String n){
        name = n;
        System.out.println("다른 생성자 호출");
    }

    public Box (String n, int c){
        name = n;
        count = c;
        System.out.println("또 다른 생성자 호출");
    }


    // 생략되어 있지만
    // 개발자가 직접 적게되면 내용이 바뀌는 구조
    public String toString(){
        return "Box name = " + name + "/" + count + "개";
    }
    //기존의 toString은 주소값 출력


    // 매서드 이름이 동일 할 수 없다
    public void doA(){}
    public void doA(String a){}

}
