package racingcar;

public class RacingCar {
    private String name;
    private String distance;

    public void race() {
        this.distance = distance + "-";
    }

    RacingCar(String name) {
        this.name = name;
        this.distance = "";
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }
}