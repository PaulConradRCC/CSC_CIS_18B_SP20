package pjc;

public class BasePlusComm extends Employee {
    private double basePay;
    private double commRate;
    private double sales;

    @Override
    public double getPay() {
        return getBasePay() + getCommRate()*getSales();
    }

    /**
     * @return the basePay
     */
    public double getBasePay() {
        return basePay;
    }

    /**
     * @param basePay the basePay to set
     */
    public void setBasePay(double basePay) {
        if (basePay>=0)
            this.basePay = basePay;
        else
            throw new IllegalArgumentException("BasePay cannot be "+basePay);
    }

    /**
     * @return the commRate
     */
    public double getCommRate() {
        return commRate;
    }

    /**
     * @param commRate the commRate to set
     */
    public void setCommRate(double commRate) {
        if (commRate>0 && commRate<0.40)
            this.commRate = commRate;
        else
            throw new IllegalArgumentException("CommRate cannot be "+commRate);
    }

    /**
     * @return the sales
     */
    public double getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(double sales) {
        if(sales>=0)
            this.sales = sales;
        else
            throw new IllegalArgumentException("Sales cannot be "+sales);
    }   
    
    public BasePlusComm(double bp, double cr, double sales)
    {
        setBasePay(bp);
        setCommRate(cr);
        setSales(sales);
    }
}
