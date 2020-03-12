package pjc;

public class TestHourly {

    public static void main(String[] args) {
        Hourly a = new Hourly();
        
        a.setName("John Smith");
        a.setDob( new Date(2,29,1972) );
        a.setHire( new Date(8,15,1995) );
        a.setHourlyRate(33.75);
        a.setHoursWorked(38);
        
        System.out.println(a.toString());
    }
    
}
