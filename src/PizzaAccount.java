public class PizzaAccount {
    private final double value;
    private final int numberOfClients;

    public PizzaAccount(double value, int numberOfClients) {
        this.value = value;
        this.numberOfClients = numberOfClients;
    }

    public double getValue() {
        return value;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public static int CalcPizzaAccount(double value, int numberOfClients) {
        return (int) (value / numberOfClients);
    }
}
