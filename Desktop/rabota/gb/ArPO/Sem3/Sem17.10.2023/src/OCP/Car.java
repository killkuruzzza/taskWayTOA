package OCP;

public class Car extends Vehicle {
    public Car(int maxspeed) {
        super(maxspeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxspeed() * 0.8;
    }
}
