package TDD.Bank_Account;

public class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        }
    }
    public int getBalance() {
        return balance;
    }


}
