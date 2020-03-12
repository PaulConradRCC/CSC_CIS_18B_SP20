public class Complex implements MyInterface {
    private double real;
    private double imaginary;

    // parameter-less constructor, default is zero
    public Complex()
    {
        real=0.0;
        imaginary=0.0;
    }
    
    public void my_function1()
    {
        return;
    }
    
    public int my_function2()
    {
        System.out.println("TODO later");
        return 0;
    }
    
    // constructor with two parameters, real and imaginary
    public Complex(double real, double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    
    // copy constructor
    public Complex(Complex org)
    {
        real=org.real;
        imaginary=org.imaginary;
    }
    
    // add method
    public Complex add(Complex b)
    {
        /*Complex temp = new Complex();
        temp.setReal(real+b.real);
        temp.setImaginary(imaginary+b.imaginary);
        
        return temp;*/
        return new Complex(real+b.real,imaginary+b.imaginary);
    }
    
    // subtract method
    public Complex subtract(Complex b)
    {        
        return new Complex(real-b.real,imaginary-b.imaginary);
    }
    
    // multiply method
    public Complex multiply(Complex b)
    {
        return new Complex(real*b.real-imaginary*b.imaginary, 
                           real*b.imaginary+imaginary*b.real);
    }
    
    // divide method
    public Complex divide(Complex b)
    {
        Complex conj = new Complex(b);
        conj.imaginary *= -1.0;
        Complex temp = this.multiply(conj);
        double denom = b.real*b.real + b.imaginary*b.imaginary;
        return new Complex(temp.getReal()/denom,temp.getImaginary()/denom);
    }
    
    // toString
    public String toString()
    {
        if (imaginary>=0) return real+"+"+imaginary+"i";
        else return real+""+imaginary+"i";
    }
    /**
     * @return the real
     */
    public double getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @return the imaginary
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * @param imaginary the imaginary to set
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    
    
}
