package bank;

public class BankAccount {

    int num = 0;

    public int cmb(){
        System.out.println("잔액 : " + num);
        return num;
    }

    public void deposit(int a){
        num += a;
    }

    public void withdraw(int b){
        num -= b;
    }

}
