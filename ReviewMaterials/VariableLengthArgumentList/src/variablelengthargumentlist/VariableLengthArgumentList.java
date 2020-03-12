
package variablelengthargumentlist;

public class VariableLengthArgumentList {

    private static double average(double... values)
    {
        System.out.println("We have "+values.length+" values passed in values parameter...");
        
        double sum=0.0;
        for(double number:values) {
            System.out.println(number);
            sum+=number;
        }
        return sum/values.length;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Average of 3.2, 5.4, 3.3, 1.2, 6.7 is: "+average(3.2,5.4,3.3,1.2,6.7));
        System.out.println("Average of 3.2, 5.4, 3.3 is: "+average(3.2,5.4,3.3));
        System.out.println("Average of 3.2, 6.7 is: "+average(3.2,6.7));
        System.out.println("Average of 3.2, 5.4, 3.3, 1.2, 6.7, 8.9 is: "+average(3.2,5.4,3.3,1.2,6.7,8.9));
    }
    
}
