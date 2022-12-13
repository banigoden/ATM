package com.banigoden.atm.domain.card;

import java.util.List;

public class DebitCard extends Card {
    private int cardNumber;
    private String ownedBy;
    private List<Card> cards;
    private PaymentSystems paymentSystem;

    public void addPaymentSystem(Card card){
        cards.add(card);
    }
}
