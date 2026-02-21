public class PaymentOptions {
    private final double price;

    public double getPrice() {
        return price;
    }

    public PaymentOptions(int price) {
        this.price = price;
    }

    public static double CalcCashPayment(double price) {
        var discount = 0.10 * price;
        return price - discount;
    }

    public static double CalcInstallmentPayment(double price) {
        return price / 3;
    }

}
