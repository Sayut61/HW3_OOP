package Task3;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane(43.54,12.324,"Airbus", 7000, 230);
        plane.vehicle();
        Vehicle ship = new Ship(54.768, 72.83,"Titanik", 24, "Kotor");
        ship.vehicle();
    }
}
