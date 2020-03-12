package printf_demo_integers;

public class Printf_demo_integers {

    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        System.out.print("Hello, please enter an integer: ");
        
        int my_value = kb.nextInt();
        
        System.out.printf("You entered the integer '%10d'\n", my_value); // default right justified
        System.out.printf("You entered the integer '%-10d'\n", my_value); // default left justified
        
        System.out.print("Please enter another integer: ");
        int another_value = kb.nextInt();
        
        int sum = my_value + another_value;
        int product = my_value * another_value;
        
        java.io.PrintStream out = System.out;
        
        out.printf("    The sum of %10d and %10d is %10d", my_value, another_value, sum);
        out.printf("The product of %10d and %10d is %10d\n", my_value, another_value, product);        
    }
    
}
