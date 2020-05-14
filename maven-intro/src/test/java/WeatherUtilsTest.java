import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherUtilsTest {

    @Test
    public void lowerThan() {
//          given
        int numberOfPeople = 20;
//        when
        String result = WeatherUtils.isTooCrowded(numberOfPeople);
//        then
        assertEquals("Noch Platz", result);
    }

    @Test
    public void MoreThan() {
//        given
        int numberOfPeople = 33;
//        when
        String result = WeatherUtils.isTooCrowded(numberOfPeople);
//        THEN
        assertEquals("Zu voll", result);

    }
}

