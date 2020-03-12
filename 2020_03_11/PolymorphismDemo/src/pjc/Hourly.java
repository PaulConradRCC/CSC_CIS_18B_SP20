package pjc;

public class Hourly extends Employee {
    private double hourlyRate=20.00;
    private int hoursWorked=0;

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate>=11.00)
            this.hourlyRate = hourlyRate;
        else
            throw new IllegalArgumentException("HourlyRate cannot be "+hourlyRate);
    }

    /**
     * @return the hoursWorked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked>=0)
            this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPay() {
        return this.hoursWorked*this.hourlyRate;
    }
}
