package service;

import atm.menu.Requester;
import bank.card.PaymentSystem;

import java.net.Authenticator;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CardVerificationServise {

    public static Optional<PaymentSystem> verify(String card) {
        Optional<PaymentSystem> result =
                    Arrays.stream(PaymentSystem.values())
                            .filter(cards -> cards.getPaymentSystem().toLowerCase().equalsIgnoreCase(card))
                            .findFirst();

        try{
        if (result.get().toString().toLowerCase(Locale.ROOT).equals(card)) {
            System.out.println("The card is valid");
        } else {
            System.out.println("The card doesn't support by ATM." +
                    "Please put other card.");
            verify(Requester.requestLine("Enter card : "));
        }
        }catch (NoSuchElementException e){
            System.out.println("Please insert a valid card!");
        }
        
        return result;
    }
}
