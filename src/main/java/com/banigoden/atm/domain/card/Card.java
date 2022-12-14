package com.banigoden.atm.domain.card;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ConfigurationProperties(prefix = "card")
public class Card {
    @Value("$(card.cardNumber)")
    private long cardNumber;
    @Value("$(card.ownedBy)")
    private String ownedBy;
    @Value("$(card.pinCode)")
    private int pinCode;
    @Value("$(card.paymentSystem)")
    private PaymentSystems paymentSystem;
    private boolean isBlocked;


}
