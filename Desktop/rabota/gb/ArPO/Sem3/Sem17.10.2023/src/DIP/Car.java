package DIP;

public class Car {
    private  Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    void start(){
        engine.start();
    }
}
