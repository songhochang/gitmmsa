package bank;

public class BackAccountMain {

//    public static void checkMyBalance(){
//    }

    public static void main(String[] args) {
        System.out.println("시작");
        System.out.println("====================");

        BankAccount park = new BankAccount("박길동","1234", "850511", 0);
        BankAccount yoon = new BankAccount("윤길동","5678", "950511", 0);

        park.cmb();
        yoon.cmb();
        System.out.println("====================");

        park.deposit(3000);
        yoon.deposit(4000);

        park.cmb();
        yoon.cmb();
        System.out.println("====================");

//        park.initAccount("1234", "850511", 5000);
//        yoon.initAccount("5678", "950511", 5000);

        park.withdraw(1000);
        yoon.withdraw(2000);

        park.cmb();
        yoon.cmb();
        System.out.println("====================");

        System.out.println("끝");
    }
}