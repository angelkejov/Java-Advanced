package bankAccaunt;

public class BankAccaunt {

    private static int accountCount = 1;
    private static double intrestRate = 0.02;
    private int id;
    private double balance;

    public BankAccaunt() {
        this.id = accountCount;
        accountCount++;
    }

    public static void setIntrestRate(double intrest) {
        intrestRate = intrest;
    }

    public double getIntrestRate(int years) {
        return intrestRate * years * balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
