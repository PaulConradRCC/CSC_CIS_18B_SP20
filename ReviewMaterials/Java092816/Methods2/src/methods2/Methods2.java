
package methods2;

import java.util.Scanner;

public class Methods2 {

    public static void main(String[] args) {
             
        int x = getIntegerValue("Enter a value for X: ");
        int y = getIntegerValue("Enter a value for Y: ");
        
        int sum = add(x,y);
        
        System.out.printf("The sum of %d and %d is %d\n\n", x, y, sum);
        
    }

    public static int getIntegerValue(String prompt)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print(prompt);
        return kb.nextInt();
        
    }
    
    public static int add(int x, int y, int z)
    {
        return x+y+z;
    }
    
    public static int add(int x, int y)
    {
        return x+y;
    }    
}
