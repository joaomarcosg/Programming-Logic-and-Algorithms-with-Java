package test.java.exercises;

import main.java.exercises.NormalizeInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    @DisplayName("Should return null when input is null")
    void shouldReturnNullWhenInputIsNull() {
        NormalizeInput normalizer = new NormalizeInput(null);

        String expected = normalizer.normalize();

        assertNull(expected, "The method should return null when input is null");
    }
}
