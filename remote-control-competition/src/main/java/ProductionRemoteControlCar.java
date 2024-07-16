class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int victoriesNum;

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victoriesNum;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victoriesNum = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar car){
        return car.getNumberOfVictories() - victoriesNum;
    }
}
