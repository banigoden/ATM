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

//    @Test
//    public void givenFileName_whenUsingFileUtils_thenFileData() {
//        String expectedData = "Hello, world!";
//
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("fileTest.txt").getFile());
//        String data = FileUtils.readFileToString(file, "UTF-8");
//
//        assertEquals(expectedData, data.trim());
//    }

//    @Test
//public void givenFilePath_whenUsingFilesLines_thenFileData() {
//    String expectedData = "Hello, world!";
//
//    Path path = Paths.get(getClass().getClassLoader()
//      .getResource("fileTest.txt").toURI());
//
//    Stream<String> lines = Files.lines(path);
//    String data = lines.collect(Collectors.joining("\n"));
//    lines.close();
//
//    Assert.assertEquals(expectedData, data.trim());
}
