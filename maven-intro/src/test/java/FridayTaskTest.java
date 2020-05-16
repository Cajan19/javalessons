import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridayTaskTest {

    @Test
    public void isNotLongEnough() {

//        given
        String aPassword = "ushs";

//              WHEN

        boolean result = FridayTask.passwordIsSecureOrNot(aPassword);
//        THEN

        assertFalse(result);
    }




    @Test
    public void atLeastOneDigit() {
//        given
        String thePassword = "hsdjhafdhj";

//        when

        boolean result = FridayTask.passwordIsSecureOrNot(thePassword);

//        then

        assertFalse(result);
    }




    @Test
    public void passwordContainsDigitAndUpperAndLowerCases() {

//        given

        String password = "HGhgds7fSDJHBD";

//        when

        boolean result = FridayTask.passwordIsSecureOrNot(password);

//        then

        assertEquals(true, result);
    }
}