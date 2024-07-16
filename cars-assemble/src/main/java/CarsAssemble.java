public class CarsAssemble {
    public static double SuccessRate(int speed) {
        if (speed == 10) {
            return 0.77;
        }
        if (speed == 9) {
            return 0.80;
        }
        if (speed == 0) {
            return 0.00;
        } else if (speed >= 1 && speed <= 4) {
            return 1.00;
        } else if (speed >= 5 && speed <= 8) {
            return 0.90;
        } else {
            return -1.00;
        }

    }

    public double productionRatePerHour(int speed) {
        return SuccessRate(speed) * 221 * speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(SuccessRate(speed) * 221 * speed / 60);
    }
}
