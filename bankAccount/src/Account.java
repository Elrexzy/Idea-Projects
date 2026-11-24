public class Account {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance +=amount;
    }
    public void withdraw(int amount) {
        if (balance >= amount) balance -= amount;
    }

}
