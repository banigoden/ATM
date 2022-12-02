package bank.card;

import java.util.Arrays;
import java.util.List;

public class Card {
    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystem> paymentSystems;

    public Card() {
        paymentSystems = List.of(PaymentSystem.Visa, PaymentSystem.Mastercard);
    }

    public void addPaymentSystem(PaymentSystem system){
        paymentSystems.add(system);
    }

}
