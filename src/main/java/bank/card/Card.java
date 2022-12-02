package bank.card;

import java.util.List;

public class Card {
    private long cardNumber;
    private String ownedBy;
    private int pinCode;
    private PaymentSystem paymentSystem;
    private boolean isBlocked;

    public Card(long cardNumber, String ownedBy, int pinCode, PaymentSystem paymentSystem) {
        this.cardNumber = cardNumber;
        this.ownedBy = ownedBy;
        this.pinCode = pinCode;
        this.paymentSystem = paymentSystem;
        isBlocked = false;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
