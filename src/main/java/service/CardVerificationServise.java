package service;

import bank.card.PaymentSystem;

import java.util.Arrays;
import java.util.Optional;

public class CardVerificationServise {

    public static Optional<PaymentSystem> verify(String card){
        Optional<PaymentSystem> result =
                Arrays.stream(PaymentSystem.values())
                        .filter(cards -> cards.getPaymentSystem().equalsIgnoreCase(card))
                        .findFirst();


        if (result.get().equals(card)){
            System.out.println("The card is valid");
        }else {
            System.out.println("The card doesn't support by ATM");
        }

        for(PaymentSystem cards : PaymentSystem.values()){
            if ( cards.getPaymentSystem().equalsIgnoreCase(card)){
                System.out.println("The card is valid");
            }else {
                System.out.println("The card doesn't support by ATM");
            }
        }
        return result;
    }

    public void printInfoAboutCard(){

//        if (result.get().equals(card)){
//            System.out.println("The card is valid");
//        }else {
//            System.out.println("The card doesn't support by ATM");
//        }
    }
}
