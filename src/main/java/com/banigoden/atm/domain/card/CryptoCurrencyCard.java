package com.banigoden.atm.domain.card;


import java.util.List;

public class CryptoCurrencyCard extends Card {


    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystems> paymentSystems;

    public CryptoCurrencyCard(long cardNumber, String ownedBy, int pinCode, PaymentSystems paymentSystem) {
        super(cardNumber, ownedBy, pinCode, paymentSystem);
        paymentSystems = List.of(PaymentSystems.Visa, PaymentSystems.Mastercard, PaymentSystems.Coinbase);
    }

}
