package com.banigoden.atm.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardVerificationServiseTest {

    public CardVerificationServise cardVerificationServise = new CardVerificationServise();
    @Test
    void validate() {
        //given
        String cardName = "";


        //when
       boolean actual = cardVerificationServise.validate(cardName);

        //then
        assertTrue(actual);
    }

    @Test
    void invalidate() {
        //given
        String cardName = "";


        //when
       boolean actual = cardVerificationServise.validate(cardName);

        //then
        assertFalse(actual);
    }


//    @Test
//    ShouldValidateWhen
}