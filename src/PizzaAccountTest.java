import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaAccountTest {

    @Test
    void calcPizzaAccount() {
        int accountValue = 90;
        int numberOfClients = 3;

        int result = PizzaAccount.CalcPizzaAccount(accountValue, numberOfClients);

        assertEquals(30, result);
    }
}