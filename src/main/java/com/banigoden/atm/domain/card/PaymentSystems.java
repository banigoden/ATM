package com.banigoden.atm.domain.card;

public enum PaymentSystems {
     VISA("visa"), MASTERCARD("mastercard"), UNIONPAY("unionpay"), COINBASE("coinbase");

     private final String paymentSystem;

     PaymentSystems(String paymentSystem) {
          this.paymentSystem = paymentSystem;
     }

     public String getPaymentSystem() {
          return paymentSystem;
     }
}
