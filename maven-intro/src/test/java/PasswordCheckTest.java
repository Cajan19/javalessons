import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    @Test
            public void containsLessThanEightDigits () {

//    given
        String enterPassword = "Zhags";
//    when
        boolean result = PasswordCheck.passwordHasAtLeastEightDigits(enterPassword);

//    then
        assertEquals(false, result);
    }

    @Test
    public void containsSomeNumber () {
//        given
        String enterPassword = "7ajdhkajhdka";
//        when
        boolean result = PasswordCheck.passwordContainsNumber(enterPassword);
//        then
        assertEquals(true, result);
    }

    @Test
    public void hasLowerOrUpperCase () {
//        given
        String enterPassword = "ajksdhakjshd";

//        when
        boolean result = PasswordCheck.passwordContainsUpperandLowerCase(enterPassword);

//        then
        assertEquals(false, result);
    }



}