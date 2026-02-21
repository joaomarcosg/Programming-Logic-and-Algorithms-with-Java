import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentOptionsTest {

    @Test
    void calcCashPayment() {
        double price = 60;

        double result = PaymentOptions.CalcCashPayment(price);

        assertEquals(54, result);

    }

    @Test
    void calInstallmentPayment() {
        double price = 60;

        double result = PaymentOptions.CalcInstallmentPayment(price);

        assertEquals(54, result);
    }

}
