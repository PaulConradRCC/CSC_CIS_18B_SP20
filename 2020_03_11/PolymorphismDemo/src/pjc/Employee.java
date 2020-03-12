package pjc;

public abstract class Employee extends Person {
    private Date hire;

    public Employee()
    {
        hire = new Date();
    }
    
    /**
     * @return the hire
     */
    public Date getHire() {
        return hire;
    }

    /**
     * @param hire the hire to set
     */
    public void setHire(Date hire) {
        this.hire = hire;
    }
    
    // abstract method for getPay
    public abstract double getPay();
    
    @Override
    public String toString()
    {
        return String.format("%s, hire: %s, $%.2f", super.toString(),hire.toString(),getPay());
    }
}
