package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EvenOrOddNumberTest {
    @Test
    void checkEvenOrOddNumber() {
        int num = 5;

        String result = EvenOrOddNumber.checkNumber(num);

        assertEquals("Even", result);
        assertNotEquals("Odd", result);
    }
}
