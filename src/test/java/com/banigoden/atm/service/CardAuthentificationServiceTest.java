package com.banigoden.atm.service;

import com.banigoden.atm.domain.card.Card;
import com.banigoden.atm.domain.card.PaymentSystems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardAuthentificationServiceTest {
    public AuthentificationService authentificationService = new AuthentificationService();
    private Card card = new Card(765883666, "Kevin Fiber", 3632, PaymentSystems.MASTERCARD, "Vivid", false, 3);

    @Test
    void shouldReturnTrueInCaseRightPin(){
        int pin = 3632;
        boolean actual = authentificationService.validate(card, pin);
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseInCaseNotRightPin(){
        int pin = 36;
        boolean actual = authentificationService.validate(card, pin);
        assertFalse(actual);
    }
}
