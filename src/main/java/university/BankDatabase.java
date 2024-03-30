package university;

//for in this part i use array for DB
public class BankDatabase {

    private Account accounts[];

    public BankDatabase() {
        accounts = new Account[2];
        accounts[0] = new Account(123456, 1728, 10000, 20000);
        accounts[1] = new Account(234578, 9051, 30000.0, 20000.0);
    }

    public Account geAccount(int accountNumber) {

        for (Account currentAccount : accounts) {
            if (currentAccount.getAccountNumber() == accountNumber) {
                return currentAccount;
            }
        }
        return null;
    }

    public boolean authenticatedUser(int userAccountNumber, int pin) {

        Account userAccount = geAccount(userAccountNumber);
        if (userAccount != null) {
            return userAccount.validatePin(pin);
        }
        return false;

    }

    public double getAvailbaleBalance(int accountNumber) {
        
        return geAccount(accountNumber).getAvailbaleBalance();
        
    }

    public double getTotalBalance(int accountNumber) {
        return geAccount(accountNumber).totalBalance();
    }

    public void credit() {

    }

    public void debit() {

    }

}
