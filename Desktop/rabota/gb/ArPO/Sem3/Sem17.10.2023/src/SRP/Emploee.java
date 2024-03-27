package SRP;

public class Emploee {
    public String name;


    public Emploee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                '}';
    }
}
