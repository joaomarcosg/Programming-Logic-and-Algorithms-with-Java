package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficFineTest {
    @Test
    void trafficTicketSituation() {
        int permittedSpeed = 80;

        int driverSpeed1 = 90;
        int driverSpeed2 = 96;
        int driverSpeed3 = 100;

        String result = TrafficFine.severityFine(permittedSpeed, driverSpeed);

        assertEquals("Ok", result );
        assertEquals("Light", result );
        assertEquals("Serious", result );
    }
}
