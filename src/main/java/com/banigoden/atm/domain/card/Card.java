package com.banigoden.atm.domain.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "card")
public class Card {
    @Value("${cardNumber}")
    private long cardNumber;
    private String ownedBy;
    private int pinCode;
    private PaymentSystems paymentSystem;
    private boolean isBlocked;

    public Card(long cardNumber, String ownedBy, int pinCode, PaymentSystems paymentSystem) {
        this.cardNumber = cardNumber;
        this.ownedBy = ownedBy;
        this.pinCode = pinCode;
        this.paymentSystem = paymentSystem;
        isBlocked = false;
    }
}
