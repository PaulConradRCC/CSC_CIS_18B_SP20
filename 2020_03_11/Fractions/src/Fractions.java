
public class Fractions {

    // private member attributes (also known as properties)
    private int numerator=0;
    private int denominator=1;
    
    public Fractions()
    {}
    
    public Fractions(int n, int d)
    {
        //throw new UnsupportedOperationException("Fractions(int n, int d) not yet implemented");
        this.numerator=n;
        this.setDenominator(d);
        //this.denominator=d;
    }
    
    public Fractions subtract(Fractions f2)
    {
        //throw new UnsupportedOperationException("subtract(Fractions f2) not yet implemented");
        int a = this.numerator;
        int b = this.denominator;
        int c = f2.numerator;
        int d = f2.denominator;
        
        Fractions result = new Fractions();
        result.setNumerator(a*d-b*c);
        result.setDenominator(b*d);
        
        int g = this.gcd(result.numerator, result.denominator );
        result.setNumerator(result.numerator/g);
        result.setDenominator(result.denominator/g);
        
        return result;
    }
    
    public Fractions multiply(Fractions f2)
    {
        throw new UnsupportedOperationException("multiply(Fractions f2) not yet implemented");
    }
    
    /*public Fractions divide(Fractions f2)
    {
        if ( f2.numerator==0 )
        {
            throw new ArithmeticException("Fraction f2 is zero! Cannot divide!");
        }
        else return new Fractions(this.numerator*f2.denominator, this.denominator*f2.numerator);            
    }*/
    
    public Fractions divide(Fractions f2)
    {
        Fractions result = null;
        
        try {
            result = new Fractions();
            result.setNumerator(this.numerator*f2.denominator);
            result.setDenominator(this.denominator*f2.numerator);            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            throw new ArithmeticException("Fraction f2 is zero! Cannot divide!");            
        }        
        return result;
    }
    
    public Fractions add(Fractions f2)
    {
        int a = this.numerator;
        int b = this.denominator;
        int c = f2.numerator;
        int d = f2.denominator;
        
        Fractions result = new Fractions();
        result.setNumerator(a*d+b*c);
        result.setDenominator(b*d);
        
        int g = this.gcd(result.numerator, result.denominator );
        result.setNumerator(result.numerator/g);
        result.setDenominator(result.denominator/g);
        
        return result;
    }
    
    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if ( denominator != 0 ) 
        {
            this.denominator = denominator;            
        }
        else throw new IllegalArgumentException("Denominator cannot be zero!");
    }
    
    public double getValue()
    {
        return (double)this.numerator/this.denominator;
    }   
    
    @Override
    public String toString()
    {
        return this.numerator+" / "+this.denominator;
    }
    
    // gcd is a private utility method only for use by the Fractions class
    private int gcd(int a, int b)
    {
        if (a==0) return b;
        return gcd( b%a, a);
    }
    
}
