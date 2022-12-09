package com.banigoden.atm.domain.card;

public class Card {
    private long cardNumber;
    private String ownedBy;
    private int pinCode;
    private PaymentSystems paymentSystem;
    private boolean isBlocked;

    public Card(long cardNumber, String ownedBy, int pinCode, PaymentSystems paymentSystem) {
        this.cardNumber = cardNumber;
        this.ownedBy = ownedBy;
        this.pinCode = pinCode;
        this.paymentSystem = paymentSystem;
        isBlocked = false;
    }

}
