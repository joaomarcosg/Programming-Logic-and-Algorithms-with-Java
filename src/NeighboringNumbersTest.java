import static org.junit.jupiter.api.Assertions.*;

class NeighboringNumbersTest {

    @org.junit.jupiter.api.Test
    void calcNeighbor() {

        int entryNumber = 15;

        NeighboringNumbers result = NeighboringNumbers.CalcNeighbor(entryNumber);


        assertEquals(14, result.getPrev());
        assertEquals(16, result.getNext());

    }
}