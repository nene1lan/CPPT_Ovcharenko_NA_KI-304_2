package KI304.Ovcharenko.Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Програма-драйвер для обчислення виразу
 * та запису результату у файл і консоль.
 *
 * @author Ovcharenko
 * @version 1.1
 */
public class Lab4Driver {

    /**
     * Точка входу в програму
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        Scanner scanner = new Scanner(System.in);

        try {
            // Ввід x з клавіатури
            System.out.print("Введіть значення x: ");
            double x = scanner.nextDouble();

            // Обчислення
            double result = calculator.calculate(x);

            // Вивід у консоль
            System.out.println("Результат обчислення:");
            System.out.println("x = " + x);
            System.out.println("y = " + result);

            // Запис у файл
            try (FileWriter writer = new FileWriter("result.txt")) {
                writer.write("x = " + x + "\n");
                writer.write("y = " + result + "\n");
            }

            System.out.println("Результат успішно записано у файл result.txt");

        } catch (ArithmeticException e) {
            System.out.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка роботи з файлом: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Помилка вводу! Введіть числове значення x.");
        } finally {
            scanner.close();
        }
    }
}
