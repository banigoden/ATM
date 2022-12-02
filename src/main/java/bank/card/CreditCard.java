package bank.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard  extends Card{

    private int cardNumber;
    private String ownedBy;
    private List<PaymentSystem> paymentSystems;

    public CreditCard() {
        paymentSystems = List.of(PaymentSystem.Visa, PaymentSystem.Mastercard);
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

    public void setPaymentSystems(ArrayList<PaymentSystem> paymentSystems) {

        this.paymentSystems = paymentSystems;
    }


}
