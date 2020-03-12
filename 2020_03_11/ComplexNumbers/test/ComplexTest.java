
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {
    
    public ComplexTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /** Test of getReal method, of class Complex. */
    @Test
    public void testGetReal1() {
        System.out.println("Testing getReal");
        Complex instance = new Complex();
        double expResult = 0.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);        
    }
    
    @Test
    public void testGetReal2() {
        System.out.println("Testing getReal");
        Complex instance = new Complex(1.0,1.0);
        double expResult = 1.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);        
    }
    
    @Test
    public void testGetReal3() {
        System.out.println("Testing getReal");
        Complex original = new Complex(2.0,2.0);
        Complex instance = new Complex(original);
        double expResult = 2.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);        
    }
    
     /** Test of getImaginary method, of class Complex. */
    @Test
    public void testGetImaginary1() {
        System.out.println("Testing getImaginary");
        Complex instance = new Complex();
        double expResult = 0.0;
        double result = instance.getImaginary();
        assertEquals(expResult, result, 0.0);        
    }
    
    @Test
    public void testGetImaginary2() {
        System.out.println("Testing getImaginary");
        Complex instance = new Complex(1.0,1.0);
        double expResult = 1.0;
        double result = instance.getImaginary();
        assertEquals(expResult, result, 0.0);        
    }
    
    @Test
    public void testGetImaginary3() {
        System.out.println("Testing getImaginary");
        Complex original = new Complex(2.0,2.0);
        Complex instance = new Complex(original);
        double expResult = 2.0;
        double result = instance.getImaginary();
        assertEquals(expResult, result, 0.0);        
    }

    /** Test of setReal method, of class Complex. */
    @Test
    public void testSetReal() {
        System.out.println("setReal");
        double real = 1.0;
        Complex instance = new Complex();
        instance.setReal(real);
        double actual = instance.getReal();
        assertEquals(real,actual,0.0);
    }
   
    /**
     * Test of setImaginary method, of class Complex.
     */
    @Test
    public void testSetImaginary() {
        System.out.println("setImaginary");
        double imaginary = 1.0;
        Complex instance = new Complex();
        instance.setImaginary(imaginary);
        double actual = instance.getImaginary();
        assertEquals(imaginary,actual,0.0);
    }

    @Test
    public void testAdd()
    {
        System.out.println("Testing add");
        Complex a = new Complex(1.0,1.0);
        Complex b = new Complex(2.0,2.0);
        Complex expResult = new Complex(3.0,3.0);
        Complex result = a.add(b);
        assertEquals(expResult.getReal(), result.getReal(), 0.0);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 0.0);
    }
    
    @Test
    public void testSubtract()
    {
        System.out.println("Testing subtract");
        Complex a = new Complex(3.0,3.0);
        Complex b = new Complex(1.0,1.0);
        Complex expResult = new Complex(2.0,2.0);
        Complex result = a.subtract(b);
        assertEquals(expResult.getReal(), result.getReal(), 0.0);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 0.0);
    }
    
    @Test
    public void testMultiply()
    {
        System.out.println("Testing multiply");
        Complex a = new Complex(1.0,2.0);
        Complex b = new Complex(3.0,4.0);
        Complex expResult = new Complex(-5.0,10.0);
        Complex result = a.multiply(b);
        assertEquals(expResult.getReal(), result.getReal(), 0.0);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 0.0);
    }
    
    @Test
    public void testDivide()
    {
        System.out.println("Testing divide");
        Complex a = new Complex(-6.0,-3.0);
        Complex b = new Complex(4.0,6.0);
        Complex expResult = new Complex(-21.0/26.0,6.0/13.0);
        Complex result = a.divide(b);
        assertEquals(expResult.getReal(), result.getReal(), 0.0);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 0.0);
    }
}
