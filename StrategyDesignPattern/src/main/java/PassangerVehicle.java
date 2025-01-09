import strategy.DrivingStrategy;
import strategy.NormalDriveStrategy;
import strategy.Vehicle;

public class PassangerVehicle extends Vehicle {
     PassangerVehicle() {
        super(new NormalDriveStrategy());
    }
}
