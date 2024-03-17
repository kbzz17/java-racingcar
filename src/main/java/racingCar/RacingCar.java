package racingCar;

public class RacingCar {

    private CarName name;
    private Location location;

    public RacingCar() {
        this.location = new Location();
    }

    public RacingCar(CarName name) {
        this.name = name;
        this.location = new Location();
    }

    public RacingCar(CarName name, Location location) {
        this.name = name;
        this.location = location;
    }

    public int findCurrentLocation() {
        return this.location.getLocation();
    }

    public String findCarName() {
        return this.name.getName();
    }

    public void move(boolean isMovable) {
        if (isMovable) {
            this.location.increase();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(findCarName())
            .append(" : ")
            .append("-".repeat(Math.max(0, location.getLocation())))
            .toString();
    }
}
