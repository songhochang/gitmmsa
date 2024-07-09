package bank;

public class BankAccountMain {

    public static void main(String[] args){
        System.out.println("Start");
        System.out.println();
        System.out.println();

        BankAccount park = new BankAccount();
        BankAccount yoon = new BankAccount();

        System.out.print("park's ");
        park.cmb();
        System.out.print("yoon's ");
        yoon.cmb();
        System.out.println("-------------------");

        park.deposit(3000);
        yoon.deposit(4000);

        System.out.print("park's ");
        park.cmb();
        System.out.print("yoon's ");
        yoon.cmb();
        System.out.println("-------------------");

        park.withdraw(1500);
        yoon.withdraw(2000);

        System.out.print("park's ");
        park.cmb();
        System.out.print("yoon's ");
        yoon.cmb();
        System.out.println("-------------------");

        System.out.println();
        System.out.println();
        System.out.println("Finish");

    }

}
