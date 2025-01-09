package strategy;

public class NormalDriveStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Driving Strategy");
    }
}
