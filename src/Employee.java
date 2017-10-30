public class Employee {

    private String firstname;
    private String lastname;
    private String address;
    private int phoneNum;
    private int SSN;

    public Employee(){
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

    public void monthPayment(){

    }

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
