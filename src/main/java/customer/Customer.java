package customer;

public class Customer {
    private String firstName;
    private String secondName;
    private String address;
    private String dob; //Department of Bank
    private int customerID;
    private int cardNumber;
    private int pinCode;

    public Customer(String firstName, String secondName, String address, String dob, int customerID, int cardNumber, int pinCode) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.dob = dob;
        this.customerID = customerID;
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void passess(){

    }

}
