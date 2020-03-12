package commandlinecalculator;

public class CommandLineCalculator {

    public static void main(String[] args) {
        if ( args.length != 3)
        {
            System.out.println("Usage: java CommandLineCalculator number1 operator number2");
            System.out.println("Where number1 and number2 are two double values, and operator");
            System.out.println("is: +, -, *, /, or %");            
        }
        else
        {
            double number1 = Double.parseDouble(args[0]);
            double number2 = Double.parseDouble(args[2]);
            double result=0.0;
            
            if (args[1].charAt(0)=='+') result = number1+number2;                
            else if (args[1].charAt(0)=='-') result = number1-number2;
            else if (args[1].charAt(0)=='x') result = number1*number2;
            else if (args[1].charAt(0)=='/') result = number1/number2;
            else if (args[1].charAt(0)=='%') result = number1%number2;
            else {
                System.out.println("Unrecognized operator: "+args[1]);
                System.exit(1);
            }          
            System.out.printf("%s %s %s = %f\n",args[0],args[1],args[2],result);
        }
    }
    
}
