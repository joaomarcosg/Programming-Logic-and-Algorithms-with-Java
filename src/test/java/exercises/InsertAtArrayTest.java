package test.java.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertAtArrayTest {
    @Test
    @DisplayName("Should insert at beginning of the array")
    void shouldInsertAtBeginningOfArray() {
        int[] arr = new int[]{2, 3, 4};
        int value = 1;

        InsertAtArray insertAtArray = new InsertAtArray(arr, value);
        int[] expected = new int[]{1, 2, 3, 4};

        int[] get = insertAtArray.insertAtBeginning();

        assertEquals(expected, get);

    }
}
