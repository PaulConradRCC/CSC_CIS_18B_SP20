package pjc;

public class Person {
    private String name="";
    private Date dob;

    public Person()
    {
        dob = new Date();
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s, dob: %s",name,dob.toString());
    }
}
