package KI304.Ovcharenko.Lab6;

/**
 * Драйвер для тестування параметризованого контейнера
 */
public class Lab6Driver {

    public static void main(String[] args) {

        WagonContainer<Wagon> container = new WagonContainer<>();

        PassengerWagon pw1 = new PassengerWagon(50, 30.5);
        PassengerWagon pw2 = new PassengerWagon(80, 35.2);
        CargoWagon cw1 = new CargoWagon("Coal", 40.0);

        container.add(pw1);
        container.add(pw2);
        container.add(cw1);

        System.out.println("Максимальний вагон:");
        System.out.println(container.findMax());
    }
}
