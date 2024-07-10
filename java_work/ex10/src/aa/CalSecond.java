package aa;

import java.util.Scanner;

public class CalSecond {

    public int inputNumber(){

        System.out.print("초를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt();

        return result;
    }

    public String calculate(int second){

        int hour = second / 3600;
        int min = (second % 3600) / 60;
        int sec = (second % 3600) % 60;

        return hour + "시간 " + min + "분 " + sec + "초";
    }

}
