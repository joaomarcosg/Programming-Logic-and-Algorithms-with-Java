public class PizzaAccount {
    private final int value;
    private final int numberOfClients;

    public PizzaAccount(int value, int numberOfClients) {
        this.value = value;
        this.numberOfClients = numberOfClients;
    }

    public double getValue() {
        return value;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public int CalcPizzaAccount(int value, int numberOfClients) {
        return  value / numberOfClients;
    }
}
