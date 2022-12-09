package com.banigoden.atm.domain.card;

import java.util.List;

public class DebitCard extends Card {

    private int cardNumber;
    private String ownedBy;
    private List<Card> cards;
    private PaymentSystems paymentSystem;

    public DebitCard(long cardNumber, String ownedBy, int pinCode, PaymentSystems paymentSystem) {
        super(cardNumber, ownedBy, pinCode, paymentSystem);
    }


    public void addPaymentSystem(Card card){
        cards.add(card);
    }
}
