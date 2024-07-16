public class ElonsToyCar {
    public int distance = 0;
    public int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar newWhip = new ElonsToyCar();
        return newWhip;
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return batteryPercentage == 0 ? "Battery empty" : "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage != 0) {
            distance += 20;
            batteryPercentage--;
        }
    }
}
