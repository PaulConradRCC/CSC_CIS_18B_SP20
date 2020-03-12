package pjc;

public class TestBasePlusCommission {

    public static void main(String[] args) {
        BasePlusComm a = new BasePlusComm(1000,0.10,25000);
        a.setName("John Smith");
        a.setDob( new Date(2,29,1972) );
        a.setHire( new Date(8,15,1995) );
        System.out.println(a.toString());
    }
    
}
