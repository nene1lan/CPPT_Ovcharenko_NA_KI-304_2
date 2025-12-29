package KI304.Ovcharenko.Lab5;

import java.io.*;

/**
 * Клас для збереження та читання результатів обчислень
 * у текстовому та двійковому форматах.
 *
 * @author Ovcharenko
 * @version 1.0
 */
public class CalculationResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private double x;
    private double y;

    /**
     * Конструктор
     *
     * @param x значення аргументу
     * @param y результат обчислення
     */
    public CalculationResult(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Запис результату у текстовий файл
     *
     * @param fileName ім'я файлу
     * @throws IOException помилка вводу/виводу
     */
    public void writeText(String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(x);
            writer.println(y);
        }
    }

    /**
     * Читання результату з текстового файлу
     *
     * @param fileName ім'я файлу
     * @return об'єкт CalculationResult
     * @throws IOException помилка вводу/виводу
     */
    public static CalculationResult readText(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            double x = Double.parseDouble(reader.readLine());
            double y = Double.parseDouble(reader.readLine());
            return new CalculationResult(x, y);
        }
    }

    /**
     * Запис результату у двійковий файл
     *
     * @param fileName ім'я файлу
     * @throws IOException помилка вводу/виводу
     */
    public void writeBinary(String fileName) throws IOException {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        }
    }

    /**
     * Читання результату з двійкового файлу
     *
     * @param fileName ім'я файлу
     * @return об'єкт CalculationResult
     * @throws IOException помилка вводу/виводу
     * @throws ClassNotFoundException помилка класу
     */
    public static CalculationResult readBinary(String fileName)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            return (CalculationResult) ois.readObject();
        }
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
