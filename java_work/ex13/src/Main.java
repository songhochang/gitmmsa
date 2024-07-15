import java.util.Scanner;

class Exam {

    Scanner sc = new Scanner(System.in);

    public int inputNumber() {

        System.out.print("10진수 입력 : ");
        int inputNumber = sc.nextInt();
        System.out.println(inputNumber);
        return inputNumber;

    }

}

public class Main {

    public static void main(String[] args) {

        Exam exam = new Exam();
        int result = exam.inputNumber();
        System.out.println(result);

        int 몫, 나머지;

        몫 = result / 2;
        나머지 = result % 2;

        System.out.println(몫);
        System.out.println(나머지);

        String 나머지들 = "" + 나머지;

        while (true) {

            나머지 = 몫 % 2;
            몫 = 몫 / 2;
            나머지들 = 나머지 + 나머지들;

            System.out.println(몫);
            System.out.println(나머지);
            System.out.println(나머지들);

            if (몫 < 2) {
                if (몫 != 0) {
                    나머지들 = 몫 + 나머지들;
                    System.out.println(나머지들);
                }
                break;
            }

        }

    }

}
