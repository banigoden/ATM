package com.banigoden.atm.domain.card;


import java.util.List;

public class CreditCard  extends Card{
    private long cardNumber;
    private String ownedBy;
    private List<Card> cards;
    private PaymentSystems paymentSystem;

}
