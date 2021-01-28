package Task3;

public class Vehicle {
    double coordinatesX;
    double coordinatesY;
    int price;
    int speed;
    int year;
    String name;

    public Vehicle(double coordinatesX, double coordinatesY, String name) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.name = name;
    }


    void vehicle(){

    }


    public double getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(double coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public double getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(double coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
