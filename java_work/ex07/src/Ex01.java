// ctrl + alt + l 자동정렬
// shift + f10 컴파일
// alt + 1 프로젝트 경로
// esc 다시 소스

public class Ex01 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
        }

        System.out.println(sum);

//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j < i + 1; j++){
//                System.out.println(j);
//            }
//        }

    }

}
