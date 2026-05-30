package main.java.exercises;

import java.util.ArrayList;
import java.util.List;

public class InsertAtArray {

    public InsertAtArray() {}

    public List<Integer> insertAtBeginning(List<Integer> arr, int value) {

        arr.addFirst(value);
        return arr;
    }
}
