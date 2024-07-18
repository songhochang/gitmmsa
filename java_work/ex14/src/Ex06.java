class Test {
    public static void doA() {
        System.out.println("static doA");
    }

    public void doB() {
        System.out.println("그냥 instance doB");
    }
}

public class Ex06 {

    int num = 0;

//    static void Add(int n){
//        num += n; // Add함수는 main함수에서 호출하지 않아도 데이터가 올라가있지만
//                  // num은 main함수에서 호출해야 데이터가 저장되기 때문에 안되
//
//    }

    public static void main(String[] args) {

        Test.doA();

        Test test = new Test();
        test.doB();

//        test.doA();

    }
}
