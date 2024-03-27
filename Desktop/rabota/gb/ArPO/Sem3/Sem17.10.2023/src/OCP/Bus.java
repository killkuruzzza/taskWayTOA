package OCP;

public class Bus extends Vehicle {
    public Bus(int maxspeed) {
        super(maxspeed, "Bus");

    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxspeed() * 0.5;
    }
}
