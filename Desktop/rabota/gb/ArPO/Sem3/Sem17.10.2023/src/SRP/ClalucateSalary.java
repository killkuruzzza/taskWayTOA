package SRP;

public class ClalucateSalary {
    int baseSalary;
    int valueTime;

    public ClalucateSalary(int baseSalary, int valueTime) {
        this.baseSalary = baseSalary;
        this.valueTime = valueTime;
    }
    public int calculateSalary(){
        return valueTime * baseSalary;
    }

}
