package methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a value for X: ");
        int x = kb.nextInt();
        
        System.out.print("Enter a value for Y: ");
        int y = kb.nextInt();
        
        int sum = add(x,y);
        
        System.out.printf("The sum of %d and %d is %d\n\n", x, y, sum);
        
    }
    
    public static int add(int x, int y)
    {
        return x+y;
    }    
}
