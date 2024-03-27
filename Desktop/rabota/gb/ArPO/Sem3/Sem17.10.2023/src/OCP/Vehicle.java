package OCP;

public class Vehicle {
    private int maxspeed;
    private String type;

    public Vehicle(int maxspeed, String type) {
        this.maxspeed = maxspeed;
        this.type = type;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public String getType() {
        return type;
    }

    public double calculateAllowedSpeed(){
        return maxspeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxspeed=" + calculateAllowedSpeed() +
                ", type='" + type + '\'' +
                '}';
    }
}
