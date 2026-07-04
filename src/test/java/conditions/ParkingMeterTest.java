package test.java.conditions;

import main.java.conditions.ParkingMeter;
import main.java.conditions.ResultParkingMeter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingMeterTest {
    private ParkingMeter parkingMeter;

    @BeforeEach
    void setUp() {
        parkingMeter = new ParkingMeter();
    }

    @Test
    void shouldReturnTimeWithoutChange_WhenAmountIsExact() {
        ResultParkingMeter result = parkingMeter.lengthOfStay(1.75);

        assertEquals("60 min", result.time());
        assertEquals(0.0, result.change());
    }

    @Test
    void shouldCalculateChangeCorrectly_WhenAmountIsGreater() {
        ResultParkingMeter result = parkingMeter.lengthOfStay(5.00);

        assertEquals("120 min", result.time());
        assertEquals(2.00, result.change());
    }

    @Test
    void shouldCalculateChangeCorrectly_WhenAmountIsRandom() {
        ResultParkingMeter result = parkingMeter.lengthOfStay(2.00);

        assertEquals("60 min", result.time());
        assertEquals(0.25, result.change());
    }

    @Test
    void shouldReturnInsufficientAmount_WhenAmountIsLess() {
        ResultParkingMeter result = parkingMeter.lengthOfStay(0.75);

        assertEquals("Insufficient amount", result.time());
        assertEquals(0.00, result.change());
    }
}
