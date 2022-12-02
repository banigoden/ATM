package bank.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebitCard extends Card {

    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystem> paymentSystems;

    public DebitCard() {
        paymentSystems = Arrays.asList(PaymentSystem.Visa, PaymentSystem.Mastercard,PaymentSystem.UnionPay, PaymentSystem.Coinbase);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public List<PaymentSystem> getPaymentSystems() {
        return paymentSystems;
    }

    public void setPaymentSystems(List<PaymentSystem> paymentSystems) {
        this.paymentSystems = paymentSystems;
    }

}
