package test.java.exercises;

import main.java.exercises.InsertAtArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertAtArrayTest {
    @Test
    @DisplayName("Should insert at beginning of the array")
    void shouldInsertAtBeginningOfArray() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 4));
        int value = 1;

        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        InsertAtArray.insertAtBeginning(arr, value);

        assertEquals(expected, arr);

    }
}
