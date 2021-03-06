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
        salary = 110850;
        overTimeHours = 0;
        overTimeRate = 1.5;
    }

    public Technician(int overTimeHours){
        super();
        salary = 110850;
        overTimeRate = 1.5;
        this.overTimeHours = overTimeHours;
    }


    @Override
    public String Display(){ // Display all related information for a Technician
        return "Name: "+super.getFirstname()+" "+super.getLastname()+"\nAddress: "+super.getAddress()+"\nPhone number: "+super.getPhoneNum()+"\nSSN: "+super.getSSN()
                +"\nMonthly Pay: $"+super.calculateMonthlyPayment(salary)+"\nAnnual Pay: $"+super.calculateAnnualSalary(salary)+"\nActual Pay: $"+super.calculateActualPay(super.getAnnualSalary())
                +"\nTax: 20%"+"\nOver Time Hours: "+getOverTimeHours()+"\nOver Time Rate: "+overTimeRate;
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
