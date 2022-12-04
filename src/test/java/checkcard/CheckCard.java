package checkcard;

import bank.card.PaymentSystem;
import org.junit.jupiter.api.DisplayName;
import service.CardVerificationServise;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;


public class CheckCard {

    @Test
    public void givenCardIsProvided_optionalCardIsReturned(){
        Optional<PaymentSystem> result = CardVerificationServise.verify("visa");
        assertThat(result, equalTo(Optional.of(PaymentSystem.Visa)));
    }

    @Test
    public void givenCard_whenInvalidCardProvided_optionalEmptyIsReturned(){
        Optional<PaymentSystem> result = CardVerificationServise.verify("Care");
        assertFalse(result.isEmpty());
    }

    @DisplayName("NoSuchElementException")
    @Test
    public void givenCard_whenInvalidCardProvided_ExceptionIsReturned(){
        Exception exception =  assertThrows(NoSuchElementException.class, () -> CardVerificationServise.verify("Cd"));
        assertEquals("Please insert a valid card!", exception.getMessage());
    }

    @Test
    public void givenCard_whenInvalidStringCardProvided_optionalEmptyIsReturned(){
        Optional<PaymentSystem> result = CardVerificationServise.verify("123");
        assertFalse(result.isEmpty());
    }

    @DisplayName("PIN test")
    @Test
    public void checkPIN_whenInvalidLetterProvided_exceptionIsReturn(){
//        Exception exception = assertThrows();
    }
}
