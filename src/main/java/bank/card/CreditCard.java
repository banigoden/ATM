package bank.card;


import java.util.List;

public class CreditCard  extends Card{

    private long cardNumber;
    private String ownedBy;
    private List<Card> cards;
    private PaymentSystem paymentSystem;

    public CreditCard(long cardNumber, String ownedBy, int pinCode, PaymentSystem paymentSystem) {
        super(cardNumber, ownedBy, pinCode, paymentSystem);
    }

    @Override
    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String getOwnedBy() {
        return ownedBy;
    }

    @Override
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    @Override
    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    @Override
    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void addCard(Card card){
        cards.add(card);
    }






}
