package university;

public class ATM {

    private boolean userAuthenticated = false;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keybad;
    private CashDispenser cashDispenser;
    private DepositSolt depositSolt;
    private BankDatabase bamBankDatabase;

    public ATM() {
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keybad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSolt = new DepositSolt();
        bamBankDatabase = new BankDatabase();
    }

    public static void main(String[] args) {

        ATM a = new ATM();
        a.run();

    }

    public void run() {

    }

    public void authenticateUser() {
        screen.displayMessage("Enter your account number");
        int accountNumber = keybad.getinput();
        screen.displayMessage("Enter your pin");
        int pin = keybad.getinput();

    }

}
