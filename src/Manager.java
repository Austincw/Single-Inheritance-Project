/**
 * The child class Manager which inherits the variables and
 * functions of the parent class Employee
 */

public class Manager extends Employee {

    private int salary;
    private double bonus;
    private boolean performace;

    public Manager(){
        super();
    }

    @Override
    public String Display(){
        return "";
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

    public boolean isPerformace() {
        return performace;
    }

    public void setPerformace(boolean performace) {
        this.performace = performace;
    }
    //add display method


}
