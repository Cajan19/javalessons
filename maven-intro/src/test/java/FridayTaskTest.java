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
    public void passwordMeetsRequirements() {

//        given

        String password = "kdsjhfksajhfkajsdfh777";

//        when

        boolean result = FridayTask.passwordIsSecureOrNot(password);

//        then

        assertTrue(result);
    }

    @Test
    public void passwordContainsUpperLetter() {

//        given

        String password = "HGhgdsfSDJHBD";

//        when

        boolean result = FridayTask.passwordIsSecureOrNot(password);

//        then

        assertEquals(true, result);
    }
}