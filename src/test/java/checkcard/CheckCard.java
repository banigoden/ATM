package checkcard;

import com.banigoden.atm.domain.card.PaymentSystems;
import org.junit.jupiter.api.DisplayName;
import com.banigoden.atm.service.CardVerificationServise;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;


public class CheckCard {
    //positive  Negative




    @Test
    public void shouldValidateSuccesfulyWhenCardIsExist(){ //shouldValidateSuccesfulyWhenCardIsExist
        //given


        //when

        //then
        Optional<PaymentSystems> result = CardVerificationServise.verify("visa");
        assertThat(result, equalTo(Optional.of(PaymentSystems.Visa)));
    }

    @Test
    public void givenCard_whenInvalidCardProvided_optionalEmptyIsReturned(){
        Optional<PaymentSystems> result = CardVerificationServise.verify("Care");
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
        Optional<PaymentSystems> result = CardVerificationServise.verify("123");
        assertFalse(result.isEmpty());
    }

    @DisplayName("PIN test")
    @Test
    public void checkPIN_whenInvalidLetterProvided_exceptionIsReturn(){
//        Exception exception = assertThrows();
    }
}
