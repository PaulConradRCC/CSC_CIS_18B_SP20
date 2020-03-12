package pjc;

import java.util.Scanner;

public class StaticMethods {

    public static void main(String[] args) {
        
        float value;
        
        System.out.print("Enter an angle in degrees: ");
        value = new Scanner(System.in).nextFloat();
        
        System.out.printf("sin(%f°)=%.5f\n", value,Math.sin(value*Math.PI/180));
    }
    
}
