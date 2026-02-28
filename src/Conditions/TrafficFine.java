package Conditions;

public class TrafficFine {
    private int permittedSpeed;
    private int driverSpeed;

    public TrafficFine(int permittedSpeed, int driverSpeed) {
        this.permittedSpeed = permittedSpeed;
        this.driverSpeed = driverSpeed;
    }

    public static String severityFine(int permittedSpeed, int driverSpeed) {
        String ok = "Okay";
        String light = "Light";
        String serious = "Serious";

        var upToTwentyPercentHigher = permittedSpeed + (permittedSpeed * 20/100);

        if (driverSpeed <= permittedSpeed) {
            return ok;
        } else if (driverSpeed == upToTwentyPercentHigher) {
            return light;
        } else {
            return serious;
        }
    }

}
