package bank.card;

public enum PaymentSystem {

    // Visa, Mastercard, UnionPay, Coinbase
     Visa("visa"), Mastercard("mastercard"), UnionPay("unionpay"), Coinbase("coinbase");

     private final String paymentSystem;

     PaymentSystem(String paymentSystem) {
          this.paymentSystem = paymentSystem;
     }

     public String getPaymentSystem() {
          return paymentSystem;
     }
}
