package com.banigoden.atm.domain.card;

import lombok.*;


@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {
    private long cardNumber;
    private String ownedBy;
    private int pinCode;
    private PaymentSystems paymentSystem;
    private String nameOfBank;
    private boolean block;
    private int attempt;

    public boolean getBlock() {
        return block;
    }
}
