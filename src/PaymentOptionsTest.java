import org.junit.jupiter.api.Test;

public class PaymentOptionsTest {

    @Test
    void calcCashPayment() {
        int price = 60;

        int result = PaymentOptions.CalcCashPayment(int price);

        assertEquals(20, result);

    }

}
