
/**
 * The super class Employee which holds the general information for an
 * employee as well as the methods to calculate their different payments
 */

public class Employee {

    //declaration of variables
    private String firstname;
    private String lastname;
    private String address;
    private String phoneNum;
    private String SSN; // made a string since SSN's have -'s ex. 123-45-6789
    private int monthlyPay;
    private int annualSalary;
    private int actualPay;
    private int tax;


    public Employee(){ // constructor to initialize each variable created
        firstname = "";
        lastname = "";
        address = "";
        phoneNum = "";
        SSN = "";
        monthlyPay = 0;
        annualSalary = 0;
        tax = 20;

    }

    public Employee(String firstname, String lastname, String address, String phoneNum, String SSN){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phoneNum = phoneNum;
        this.SSN = SSN;
    }


    public int calculateMonthlyPayment(int pay){ // method to calculate the particular employees monthly payment
        monthlyPay = (pay/12) * tax;
        return monthlyPay;
    }

    public int calculateAnnualSalary(){ // method to calculate the employees annual salary

        return 0;
    }

    public int calculateActualPay(){ // method to calculate the actual payment of an employee

        return 0;
    }

    public String Display(){
        return "testing\n"+"new line";
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(int monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getActualPay() {
        return actualPay;
    }

    public void setActualPay(int actualPay) {
        this.actualPay = actualPay;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

}