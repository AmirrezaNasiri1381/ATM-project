package university;

public class Account {

    private int accountNumber;
    private int pin;
    private double availableBalance;
    private double totalBalance;

    public Account(int accountNumber, int pin, double availableBalance, double totalBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }

    public boolean validatePin(int userPin) {
        if (userPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    public double getAvailbaleBalance() {
        return availableBalance;
    }

    public double totalBalance() {
        return totalBalance;
    }

    public void credit(double amount) {
        totalBalance += amount;
        availableBalance += amount;
    }

    public void debit(double amount) {
        totalBalance -= amount;
        availableBalance -= amount;

    }
    public int getAccountNumber(){
        return accountNumber;
    }
}
