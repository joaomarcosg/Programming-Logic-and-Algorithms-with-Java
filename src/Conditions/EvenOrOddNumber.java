package Conditions;

public class EvenOrOddNumber {
    private final int num;

    public EvenOrOddNumber(int num) {
        this.num = num;
    }

    public static String checkNumber(int num) {
        String evenOrOdd = num % 2 == 0 ? "Even" : "Odd";
        return evenOrOdd;
    }
}
