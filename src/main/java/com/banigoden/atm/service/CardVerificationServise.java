package com.banigoden.atm.service;

import com.banigoden.atm.service.menu.Requester;
import com.banigoden.atm.domain.card.PaymentSystems;

import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CardVerificationServise {
    public boolean verify(String cardName) {
        boolean isValid = false;
        if (cardName.isEmpty()){
            isValid = false;
        }
        Optional<PaymentSystems> result =
                    Arrays.stream(PaymentSystems.values())
                            .filter(cards -> cards.getPaymentSystem().toLowerCase().equalsIgnoreCase(cardName))
                            .findFirst();
        try {
            if (result.get().toString().toLowerCase(Locale.ROOT).equals(cardName)) {
                System.out.println("The card is valid");
                isValid = true;
            }
        }catch (NoSuchElementException exception){
            System.out.println("Please insert a valid card!");
        }
        return isValid;
    }
}
