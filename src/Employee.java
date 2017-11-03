
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
    private double actualPay;
    private double tax;


    public Employee(){ // constructor to initialize each variable created
        firstname = "";
        lastname = "";
        address = "";
        phoneNum = "";
        SSN = "";
        monthlyPay = 0;
        annualSalary = 0;
        actualPay = 0.0;
        tax = .20;

    }

    public Employee(String firstname, String lastname, String address, String phoneNum, String SSN){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phoneNum = phoneNum;
        this.SSN = SSN;
    }


    public int calculateMonthlyPayment(int pay){ // method to calculate the particular employees monthly payment
        int temp;
        pay = pay/12;
        temp = (int)(pay * tax);
        monthlyPay = pay - temp;
        return monthlyPay;
    }

    public int calculateAnnualSalary(int sal){ // method to calculate the employees annual salary
        int temp = (int)(sal * tax);
        annualSalary = sal - temp;
        return annualSalary;
    }

    public double calculateActualPay(int sal){ // method to calculate the actual payment of an employee per hour of work in a work week
        double temp = sal / 52; //divide the salary up by the amount of weeks in a year
        temp = temp / 5; //  divide the salary up by the amount of hours worked one week a week
        actualPay = temp / 8; // divide the salary up by amount of hours worked per day which is actual payment
        return Math.round(actualPay);
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

    public double getActualPay() {
        return actualPay;
    }

    public void setActualPay(double actualPay) {
        this.actualPay = actualPay;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}