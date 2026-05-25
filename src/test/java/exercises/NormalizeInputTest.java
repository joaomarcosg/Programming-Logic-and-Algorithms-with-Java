package test.java.exercises;

import main.java.exercises.NormalizeInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalizeInputTest {
    @Test
    @DisplayName("Should remove spaces at the border, reduce internal spaces and convert to lowercase")
    void shouldNormalizeTextWithMultipleSpacesAndUppercase() {

        String input = "  joão   Silva";
        NormalizeInput normalizer = new NormalizeInput(input);
        String expected = "joão silva";

        String get = normalizer.normalize();

        assertEquals(expected, get, "The text has not been normalized");

    }
}
