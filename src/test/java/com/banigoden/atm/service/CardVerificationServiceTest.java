package com.banigoden.atm.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardVerificationServiceTest {

    public CardVerificationServise cardVerificationServise = new CardVerificationServise();
    @Test
    void validate() {
        //given
        String cardName = "visa";


        //when
       boolean actual = cardVerificationServise.verify(cardName);

        //then
        assertTrue(actual);
    }

    @Test
    void invalidate() {
        //given
        String cardName = "no";
        //when
       boolean actual = cardVerificationServise.verify(cardName);
        //then
        assertFalse(actual);
    }
}