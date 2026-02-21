import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeAverageTest {

    @Test
    void calcGradeAverage() {
        int firstGrade = 7;
        int secondGrade = 8;

        int result = GradeAverage.CalcGradeAverage(firstGrade, secondGrade);

        assertEquals(7, result);
    }

}
