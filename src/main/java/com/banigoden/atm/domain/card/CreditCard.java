package com.banigoden.atm.domain.card;


import java.util.List;

public class CreditCard  extends Card{

    private long cardNumber;
    private String ownedBy;
    private List<Card> cards;
    private PaymentSystems paymentSystem;

    public CreditCard(long cardNumber, String ownedBy, int pinCode, PaymentSystems paymentSystem) {
        super(cardNumber, ownedBy, pinCode, paymentSystem);
    }







}
