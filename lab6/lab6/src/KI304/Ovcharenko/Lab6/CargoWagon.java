package KI304.Ovcharenko.Lab6;

/**
 * Вантажний вагон
 */
public class CargoWagon implements Wagon {

    private String cargoType;
    private double weight;

    public CargoWagon(String cargoType, double weight) {
        this.cargoType = cargoType;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Wagon o) {
        return Double.compare(this.weight, o.getWeight());
    }

    @Override
    public String toString() {
        return "CargoWagon [cargoType=" + cargoType +
               ", weight=" + weight + "]";
    }
}
