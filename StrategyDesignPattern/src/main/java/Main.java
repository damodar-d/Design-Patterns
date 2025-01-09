import strategy.NormalDriveStrategy;
import strategy.SportyDriveStrategy;
import strategy.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PassangerVehicle();
        vehicle.drive();
    }
}
