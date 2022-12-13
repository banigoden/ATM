package com.banigoden.atm.domain.card;


import java.util.List;

public class CryptoCurrencyCard extends Card {
    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystems> paymentSystems;
}
