package KI304.Ovcharenko.Lab6;

/**
 * Пасажирський вагон
 */
public class PassengerWagon implements Wagon {

    private int passengers;
    private double weight;

    public PassengerWagon(int passengers, double weight) {
        this.passengers = passengers;
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
        return "PassengerWagon [passengers=" + passengers +
               ", weight=" + weight + "]";
    }
}
