
/**
 * The super class Employee which holds the general information for an
 * employee as well as the methods to calculate their different payments
 */

public class Employee {

    //declaration of variables
    private String firstname;
    private String lastname;
    private String address;
    private int phoneNum;
    private int SSN;
    private int monthlyPay;
    private int annualSalary;
    private int actualPay;
    private int tax;


    public Employee(){ // constructor to initialize each variable created
        firstname = "";
        lastname = "";
        address = "";
        phoneNum = 0;
        SSN = 0;
    }

    public Employee(String firstname, String lastname, String address, int phoneNum, int SSN){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phoneNum = phoneNum;
        this.SSN = SSN;
    }

    public void monthPayment(){ // method to calculate the particular employees monthly payment

    }

    public int annualSalary(){ // method to calculate the employees annual salary

        return 0;
    }

    public int actualPay(){ // method to calculate the actual payment of an employee

        return 0;
    }



    /**
     * All of my getters and setters for each variable created
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
}