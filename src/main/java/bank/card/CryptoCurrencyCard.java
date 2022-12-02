package bank.card;


import java.util.Arrays;
import java.util.List;

public class CryptoCurrencyCard extends Card {


    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystem> paymentSystems;

    public CryptoCurrencyCard(long cardNumber, String ownedBy, int pinCode, PaymentSystem paymentSystem) {
        super(cardNumber, ownedBy, pinCode, paymentSystem);
        paymentSystems = List.of(PaymentSystem.Visa, PaymentSystem.Mastercard, PaymentSystem.Coinbase);
    }

}
