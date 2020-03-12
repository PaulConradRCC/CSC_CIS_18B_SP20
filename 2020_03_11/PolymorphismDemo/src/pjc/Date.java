package pjc;

public class Date {
    private int month=1;
    private int day=1;
    private int year=1900;

    public Date()
    {      
    }
    
    public Date(int m, int d, int y)
    {
        setYear(y);
        setMonth(m);
        setDay(d);
    }
    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        if (month >=1 && month <= 12)
            this.month = month;
        else
            throw new IllegalArgumentException("Month cannot be "+month);
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        switch(month)
        {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                if (day>=1 && day <=31)
                {
                    this.day = day;
                }
                else
                    throw new IllegalArgumentException("Day cannot be "+day+" for month "+month);
                break;
                
            case 4: case 6: case 9: case 11:
                if (day>=1 && day <=30)
                {
                    this.day = day;
                }
                else
                    throw new IllegalArgumentException("Day cannot be "+day+" for month "+month);
                break;
            
            case 2:
                int last=28;
                if (this.year%100 == 0)
                {
                    if(this.year%400 == 0)
                        last=29;
                }
                else
                    if(this.year%4 == 0)
                        last=29;
                
                if (day>=1 && day <=last)
                {
                    this.day = day;
                }
                else
                    throw new IllegalArgumentException("Day cannot be "+day+" for month "+month+" year "+year);
                break;
            
            default:
                throw new IllegalArgumentException("Month cannot be "+month);
        }        
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        if (this.year >= 0 )
            this.year = year;
        else
            throw new IllegalArgumentException("Year cannot be "+year);
    }
    
    @Override
    public String toString()
    {
        return String.format("%d-%d-%d", this.year, this.month, this.day);
    }
}
