package customer;

import bank.card.Card;
import bank.card.PaymentSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String secondName;
    private String address;
    private String dob; //Department of Bank
    private long customerID;
    private Card card;
    private List<Card> cards;

    public Customer(String firstName, String secondName, String address, String dob, long customerID, Card card) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.dob = dob;
        this.customerID = customerID;

        this.card = card;
        cards = new ArrayList<>();
        cards.add(card);
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

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void deleteCard(Card card){
        cards.removeIf(card1 -> card1.equals(card));
    }

}
