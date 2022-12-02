package bank.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebitCard extends Card {

    private int cardNumber;
    private String ownedBy;
    private List<Card> cards;
    private PaymentSystem paymentSystem;

    public DebitCard(long cardNumber, String ownedBy, int pinCode, PaymentSystem paymentSystem) {
        super(cardNumber, ownedBy, pinCode, paymentSystem);
    }


    public void addPaymentSystem(Card card){
        cards.add(card);
    }
}
