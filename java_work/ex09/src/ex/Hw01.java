package ex;

import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {

        int countwin = 0;
        int countdraw = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("가위 바위 보 중에서 입력하세요 : ");
            String s = sc.next();

            int com = (int) (Math.random() * 3 + 1);
            String cs = "";
            if(com == 1){
                cs = "가위";
            }
            else if(com == 2){
                cs = "바위";
            }
            else{
                cs = "보";
            }

            if(s.equals("가위")){
                if(com == 1){
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("무승부");
                    countdraw++;
                }
                else if(com == 3){
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("이겼다");
                    countwin++;
                }
                else{
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("졌다");
                    System.out.println(countwin + "승 " + countdraw + "무");
                    break;
                }
            }
            else if(s.equals("바위")){
                if(com == 2){
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("무승부");
                    countdraw++;
                }
                else if(com == 1){
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("이겼다");
                    countwin++;
                }
                else{
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("졌다");
                    System.out.println(countwin + "승 " + countdraw + "무");
                    break;
                }
            }
            else if(s.equals("보")){
                if(com == 3){
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("무승부");
                    countdraw++;
                }
                else if(com == 2){
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("이겼다");
                    countwin++;
                }
                else{
                    System.out.println("컴퓨터 " + cs);
                    System.out.println("졌다");
                    System.out.println(countwin + "승 " + countdraw + "무");
                    break;
                }
            }
            else{
                System.out.println("가위 바위 보 중에서 입력해주세요");
            }

        }

    }

}
