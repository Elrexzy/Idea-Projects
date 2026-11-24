public class Account {

    private int balance;
    private int pin;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance +=amount;
    }
    public void withdraw(int amount) {
        if (balance >= amount) balance -= amount;
    }
    public void setPin(int accountPin) {
        if (accountPin >= 1000 && accountPin <= 9999) {
            pin = accountPin;
        }

    }
    public boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    public void changePin(int oldPin, int newPin) {
        if (pin == oldPin && newPin >= 1000 && newPin <= 9999) {
            pin = newPin;
        }
    }
}
