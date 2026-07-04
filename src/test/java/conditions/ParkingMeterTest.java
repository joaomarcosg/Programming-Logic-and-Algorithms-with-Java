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
}
