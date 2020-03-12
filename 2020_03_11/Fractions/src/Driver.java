
public class Driver {

    public static void main(String[] args) {
        Fractions a = new Fractions();
        Fractions b = new Fractions();
        
        System.out.println("a.toString(): "+a.toString());
        System.out.println("a.getValue(): "+a.getValue());
        
        a.setNumerator(1);
        a.setDenominator(5);
        b.setNumerator(3);
        b.setDenominator(5);
        
        Fractions c = a.add(b);
                
        System.out.println("c.toString(): "+c.toString());
        System.out.println("c.getValue(): "+c.getValue());
        
        a.setNumerator(5);
        a.setDenominator(11);
        
        System.out.println("a.toString(): "+a.toString());
        System.out.println("a.getValue(): "+a.getValue());
        
        c = b.add(a);
        System.out.println("c.toString(): "+c.toString());
        System.out.println("c.getValue(): "+c.getValue());
        
        Fractions d = new Fractions();
        java.util.Scanner scanner = new java.util.Scanner(System.in); 

        System.out.print("Please enter a numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter a denominator: ");
        int denominator = scanner.nextInt();
        
        try {
            d.setNumerator(numerator);
            d.setDenominator(denominator);
            
            Fractions e = new Fractions(1,2); // e is the fraction 1/2
            Fractions f = e.divide(d);
            System.out.println(f.toString());
        }
        catch(Exception e)
        {
            System.out.println("Uh oh......");
            e.printStackTrace();
        }
        //finally
        //{
            System.out.println("d.toString(): "+d.toString());
            System.out.println("d.getValue(): "+d.getValue());        
        //}
    }
    
}
