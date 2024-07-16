import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomPlanet = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[randomPlanet];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + random.nextInt(1000, 10000);
    }

    double randomStardate() {
        return 41000.0 + random.nextDouble() * (42000.0 - 41000.0);
    }
}
