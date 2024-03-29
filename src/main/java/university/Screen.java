package university;

public class Screen {

    // display a message
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // display message with new line
    public void messageNewLine(String message) {
        System.out.println(message);
    }

    // display a dollar amount
    public void displayDollerAmount(double amount) {
        System.out.printf("$%,.2f", amount);
    }

}
