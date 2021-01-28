package Task3;

public class Ship extends Vehicle{
    int numbersOfPassanger;
    String port;

    public Ship(double coordinatesX, double coordinatesY, String name, int numbersOfPassanger, String port) {
        super(coordinatesX, coordinatesY, name);
        this.numbersOfPassanger = numbersOfPassanger;
        this.port = port;
    }

    public int getNumbersOfPassanger() {
        return numbersOfPassanger;
    }

    public String getPort() {
        return port;
    }

    @Override
    void vehicle() {
        System.out.println(getName() + " находится: " + getCoordinatesX() + " " + getCoordinatesY() +
                ", c " + getNumbersOfPassanger() + " человек, в порту: " + getPort());
    }
}
