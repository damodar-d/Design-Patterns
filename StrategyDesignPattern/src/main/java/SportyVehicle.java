import strategy.DrivingStrategy;
import strategy.SportyDriveStrategy;
import strategy.Vehicle;

public class SportyVehicle extends Vehicle {

    public SportyVehicle() {
        super(new SportyDriveStrategy());
    }
}
