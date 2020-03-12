package overloaded;

import java.util.Scanner;

public class Overloaded {

public static void main(String[] args) {
             
        int x = f("Enter a value for X: ");
        int y = f("Enter a value for Y: ");
        
        int sum = f(x,y);
        
        System.out.printf("The sum of %d and %d is %d\n\n", x, y, sum);        
    }

    public static int f(String prompt)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print(prompt);
        return kb.nextInt();
        
    }
    
    public static int f(int x, int y, int z)
    {
        return x+y+z;
    }
    
    public static int f(int x, int y)
    {
        return x+y;
    }
    
}
