package strategy;

public class Vehicle {
    DrivingStrategy strategy;

    public Vehicle(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive(){
        this.strategy.drive();
    }
}
