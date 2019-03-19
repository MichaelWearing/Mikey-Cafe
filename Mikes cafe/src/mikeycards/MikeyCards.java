package mikeycards;

public class MikeyCards {

    double balance;

    public MikeyCards(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
        if (this.balance <= amount) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
}