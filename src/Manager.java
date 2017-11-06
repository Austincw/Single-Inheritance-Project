/**
 * The child class Manager which inherits the variables and
 * functions of the parent class Employee
 */

public class Manager extends Employee {

    private int salary;
    private double bonus;
    private boolean performance;

    public Manager(){
        super();
        salary = 140080;
    }

    public Manager(boolean performance){
        super();
        salary = 140080;
        this.performance = performance;
    }

    public int performaceBonus(){ // adds the calculated 3% performance bonus to the managers salary
        int temp = (int)(salary * bonus);
        salary = salary + temp;
        return salary;
    }


    @Override
    public String Display(){ // Display all the related information for a Manager
        return "Name: "+super.getFirstname()+" "+super.getLastname()+"\nAddress: "+super.getAddress()+"\nPhone number: "+super.getPhoneNum()+"\nSSN: "+super.getSSN()
                +"\nMonthly Pay: $"+super.calculateMonthlyPayment(salary)+"\nAnnual Pay: $"+super.calculateAnnualSalary(salary)+"\nActual Pay: $"+super.calculateActualPay(super.getAnnualSalary())
                +"\nTax: 20%";
    }



    /**
     * All of my getters and setters for each variable created
     * @return
     */

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isPerformance() {
        return performance;
    }

    public void setPerformance(boolean performance) {
        this.performance = performance;
    }


}
