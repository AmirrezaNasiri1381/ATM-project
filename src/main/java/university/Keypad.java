package university;

import java.util.Scanner;

public class Keypad {

    private Scanner input;
// Constructor without argument for initializes the scanner
    public Keypad() {
        input = new Scanner(System.in);

    }
// return an integer entered by user
    public int getinput() {
       return input.nextInt();
  
    }
    
}
