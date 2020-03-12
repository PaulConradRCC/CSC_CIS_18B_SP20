package printf_demo;

public class Printf_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
        System.err.printf("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
        String result = String.format("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
        
        System.out.println(result);
    }
    
}
