public class Bankaccount {

    public int a = 10;

    public void mod() {
        a = 20;
    }

    @Override
    public String toString() {
        return "Bankaccount a = " + a;
    }
}
