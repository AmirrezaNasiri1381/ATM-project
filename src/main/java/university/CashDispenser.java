package university;

public class CashDispenser {

    private static final int INITIAL_COUNT = 500;
    private int count;

    public CashDispenser() {
        count = INITIAL_COUNT;
    }

    public void dispensCash(int amount) {
        int billsRequrment = amount / 20;
        count -= billsRequrment;

    }

    public boolean isSufficientCashAvailable(int amount) {
        int billsRequrment = amount / 20;
        if (count >= billsRequrment) {
            return true;
        } else {
            return false;
        }

    }
}
