package test.java.conditions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleSidesTest {
    private TriangleSides triangleSides;

    int sideA = 8;
    int sideB = 10;
    int sideC = 8;


    @BeforeEach
    void setUp() {
        triangleSides = new TriangleSides();
    }

    @Test
    void shouldReturnTrueIfIsATriangle_AndItsType() {
        ResultTriangleSides result = new TriangleSides(sideA, sideB, sideC);

        assertTrue(result.isTriangle());
        assertEquals("Isosceles", result.triangleType());
    }

}
