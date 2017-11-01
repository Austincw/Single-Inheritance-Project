/**
 * The child class Engineer which inherits the variables and
 * functions of the parent class Employee
 */

public class Engineer extends Employee {

    private double salary;
    private boolean newProduct;

    public Engineer(){
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }


}
