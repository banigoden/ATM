package checkcard;

import bank.card.PaymentSystem;
import service.CardVerificationServise;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

}
