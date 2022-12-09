package com.banigoden.atm.domain.card;

public enum PaymentSystems {

    // Visa, Mastercard, UnionPay, Coinbase
     Visa("visa"), Mastercard("mastercard"), UnionPay("unionpay"), Coinbase("coinbase");

     private final String paymentSystem;

     PaymentSystems(String paymentSystem) {
          this.paymentSystem = paymentSystem;
     }

     public String getPaymentSystem() {
          return paymentSystem;
     }
}
