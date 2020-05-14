import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
@Test
    public void checkSum () {

//        given

        int valueOne = 3;
        int valueTwo = 55;

//        when
        int result = Calculations.add(valueOne,valueTwo);

//        then
        assertEquals(58, result);
    }

}