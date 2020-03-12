package pjc;

import java.util.Scanner;

public class Even_odd {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int value = keyboard.nextInt();
        
        System.out.printf("isEven(%d) returns %b\n", value,isEven(value));
        System.out.printf("isOdd(%d) returns %b\n", value,isOdd(value));
    }
    
    public static boolean isOdd(int n)
    {
        return !isEven(n);
    }
    
    public static boolean isEven(int n)
    {
        return (n % 2 == 0);
    }
}
