package if_else;

import java.io.PrintStream;
import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {
        PrintStream o = System.out;
        Scanner kb = new Scanner(System.in);
        
        o.print("Enter an integer between 1 and 100: ");
        boolean isInt = kb.hasNextInt();
        if ( isInt ) {
            int value = kb.nextInt();
            boolean expr = (value >= 1) && (value <= 100);
            
            if ( expr ) {
                o.println("Your input is in the correct range!");
            } // end of if expr == true block
            else {
                o.println("You must enter a number between 1 and 100!!!!");
            } // end of if expr == false block
        } // end of if isInt == true block   
        else {
            o.println("Uh oh! You did not enter an integer value!!!!\b");
        } // end of if isInt == false block
    }
}
