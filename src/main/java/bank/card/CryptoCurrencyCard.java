package bank.card;


import java.util.Arrays;
import java.util.List;

public class CryptoCurrencyCard extends Card {


    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystem> paymentSystems;

    public CryptoCurrencyCard() {
        paymentSystems = List.of(PaymentSystem.Visa, PaymentSystem.Mastercard, PaymentSystem.Coinbase);

    }
}
