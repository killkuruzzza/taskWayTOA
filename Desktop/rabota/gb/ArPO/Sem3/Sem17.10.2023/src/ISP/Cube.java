package ISP;

public class Cube implements Shape3d{
    private int  side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double perimetr() {
        return side * 12;
    }

    @Override
    public double value() {
        return side * side * side;
    }
}
