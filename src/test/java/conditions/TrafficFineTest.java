package test.java.conditions;

import main.java.conditions.TrafficFine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TrafficFineTest {
    @Test
    void trafficTicketSituation() {
        int permittedSpeed = 80;

        int driverSpeed1 = 50;
        int driverSpeed2 = 90;
        int driverSpeed3 = 100;

        String okResult = TrafficFine.severityFine(permittedSpeed, driverSpeed1);
        String lightResult = TrafficFine.severityFine(permittedSpeed, driverSpeed2);
        String seriousResult = TrafficFine.severityFine(permittedSpeed, driverSpeed3);

        assertEquals("Okay", okResult );
        assertNotEquals("Okay", lightResult);
        assertEquals("Light", lightResult );
        assertEquals("Serious", seriousResult );
    }
}
