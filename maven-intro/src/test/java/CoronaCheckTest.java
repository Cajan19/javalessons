import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoronaCheckTest {

    @Test
    public void AlarmRed() {
//        given
        String levelOfAlarm = "red";
//        when
        int result = CoronaCheck.numberAllowedInside(levelOfAlarm);

//        then
        assertEquals(0, result);
    }

    @Test
    public void AlarmGreen() {
        //        given
        String levelOfAlarm = "green";
//        when
        int result = CoronaCheck.numberAllowedInside(levelOfAlarm);

//        then
        assertEquals(60, result);

    }
}