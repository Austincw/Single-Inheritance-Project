/**
 * A child class of Employee which inherits the variables and methods
 * that are within parent class Employee
 */

public class Technician extends Employee {

    private int salary;
    private int overTimeHours;
    private double overTimeRate;

    public Technician(){
        super();
        salary = 0;
        overTimeHours = 0;
        overTimeRate = 1.5;
    }

    @Override
    public String Display(){
        return "";
    }



    /**
     * All of my getters and setters for each variable created
     * @return
     */

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
