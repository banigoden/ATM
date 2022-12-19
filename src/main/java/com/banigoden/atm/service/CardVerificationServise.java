package com.banigoden.atm.service;

import com.banigoden.atm.service.menu.Requester;
import com.banigoden.atm.domain.card.PaymentSystems;

import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CardVerificationServise {
    public Optional<PaymentSystems> verify(String card) {
        Optional<PaymentSystems> result =
                    Arrays.stream(PaymentSystems.values())
                            .filter(cards -> cards.getPaymentSystem().toLowerCase().equalsIgnoreCase(card))
                            .findFirst();
        try{
        if (result.get().toString().toLowerCase(Locale.ROOT).equals(card))
            System.out.println("The card is valid");

        }catch (NoSuchElementException e){
            System.out.println("Please insert a valid card!");
            verify(Requester.requestLine("Enter card : "));
        }
        return result;
    }

    public boolean validate(String cardName) {
        if(cardName.isEmpty()){
            return false;
        }
        return true;
    }
}
