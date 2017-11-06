/**
 * The child class Engineer which inherits the variables and
 * functions of the parent class Employee
 */

public class Engineer extends Employee {

    private int salary;
    private boolean newProduct;

    public Engineer(){
        super();
        salary = 120500;
        newProduct = false;
    }

    public Engineer(boolean newProduct){
        super();
        salary = 120500;
        this.newProduct = newProduct;
    }

    @Override
    public String Display(){ // display all related information for the Engineer
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

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }


}
