public class PaymentOptions {
    private final double price;

    public PaymentOptions(int price) {
        this.price = price;
    }

    public static double CalcCashPayment(double price) {

        return 0.10 * price;
    }

}
