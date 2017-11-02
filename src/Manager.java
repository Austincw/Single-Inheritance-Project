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

    @Override
    public String Display(){
        return "testing manager";
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
