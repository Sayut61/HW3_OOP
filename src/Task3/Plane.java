package Task3;

public class Plane extends Vehicle{
    private int height;
    private int numberOfPassangers;

    public Plane(double coordinatesX, double coordinatesY, String name, int height, int numberOfPassangers)  {
        super(coordinatesX, coordinatesY, name);
        this.height = height;
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    @Override
    void vehicle() {
        System.out.println(getName() + " находится: " + getCoordinatesX() + " " + getCoordinatesY() +
                ", на высоте: " + getHeight() + ", с " + getNumberOfPassangers() +
                " человек на борту." );
    }
}
