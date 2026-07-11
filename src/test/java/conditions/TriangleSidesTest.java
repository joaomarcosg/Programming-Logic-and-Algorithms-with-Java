package test.java.conditions;

import main.java.conditions.ResultTriangleSides;
import main.java.conditions.TriangleSides;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleSidesTest {
    private TriangleSides triangleSides;

    @BeforeEach
    void setUp() {
        triangleSides = new TriangleSides();
    }

    @Test
    void shouldReturnTrueIfIsATriangle_AndItsType() {
        ResultTriangleSides result = triangleSides.triangle(8, 10, 8);

        assertTrue(result.isTriangle());
        assertEquals("Isosceles", result.triangleType());
    }

    @Test
    void shouldReturnFalseIfIsNotTriangle() {
        ResultTriangleSides result = triangleSides.triangle(20, 10, 6);

        assertFalse(result.isTriangle());
        assertEquals("Its not a triangle", result.triangleType());
    }
    

}
