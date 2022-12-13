package com.banigoden.atm.domain.card;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ConfigurationProperties(prefix = "card")
public class Card {
    private long cardNumber;
    private String ownedBy;
    private int pinCode;
    private PaymentSystems paymentSystem;
    private boolean isBlocked;


}
