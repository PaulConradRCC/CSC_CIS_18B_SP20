package pjc;

import java.util.Scanner;

public class BasicInputOutputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // declare integer variables
        int value1, value2, sum, difference;
        int product, quotient, remainder;
        
        // create scanner object called keyboard to read in characters user types
        Scanner keyboard = new Scanner(System.in);
        
        // prompt the user to enter a value for value1
        System.out.print("Enter a value for value1: ");
        value1 = keyboard.nextInt();
        
        // prompt the user to enter a value for value2
        System.out.print("Enter a value for value2: ");
        value2 = keyboard.nextInt();
        
        // let's do some basic computations
        sum = value1+value2;
        difference = value1-value2;
        product = value1*value2;
        quotient = value1/value2;
        remainder = value1%value2;
        
        // output our results
        // System.out.printf("The sum of %d and %d is %d%n",value1,value2,sum);
        System.out.println("The sum of "+value1+" and "+value2+" is "+sum);
        // System.out.printf("The difference of %d and %d is %d%n",value1,value2,difference);
        System.out.println("The difference of "+value1+" and "+value2+" is "+difference);
        // System.out.printf("The product of %d and %d is %d%n",value1,value2,product);
        System.out.println("The product of "+value1+" and "+value2+" is "+product);
        // System.out.printf("The quotient of %d and %d is %d%n",value1,value2,quotient);
        System.out.println("The quotient of "+value1+" and "+value2+" is "+quotient);
        // System.out.printf("The remainder of %d and %d is %d%n",value1,value2,remainder);
        System.out.println("The remainder of "+value1+" and "+value2+" is "+remainder);
        
    }
    
}
