package main.java.conditions;

public class ParkingMeter {

    public ResultParkingMeter lengthOfStay(double amount) {
        String time = "";
        double change = 0.00;

        if (amount >= 3.00) {
            time = "120 min";
            change = amount - 3.00;
        } else if (amount >= 1.75) {
            time = "60 min";
            change = amount - 1.75;
        } else if (amount >= 1.00) {
            time = "30 min";
            change = amount - 1.00;
        } else {
            time = "Insufficient amount";
            change = 0.0;
        }
        return new  ResultParkingMeter(time, change);
    }

}
