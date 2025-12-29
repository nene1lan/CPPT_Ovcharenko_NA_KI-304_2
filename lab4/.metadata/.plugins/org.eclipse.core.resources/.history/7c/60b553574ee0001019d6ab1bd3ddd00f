package KI304.Ovcharenko.Lab4;

/**
 * Клас для обчислення математичного виразу:
 * y = cos(2x) / ctg(3x - 1)
 *
 * @author Ovcharenko
 * @version 1.0
 */
public class ExpressionCalculator {

    /**
     * Обчислює значення виразу y = cos(2x) / ctg(3x - 1)
     *
     * @param x значення змінної x
     * @return результат обчислення
     * @throws ArithmeticException якщо обчислення неможливе
     */
    public double calculate(double x) throws ArithmeticException {
        double sin = Math.sin(3 * x - 1);
        double cos = Math.cos(3 * x - 1);

        if (sin == 0) {
            throw new ArithmeticException("Помилка: ctg не існує (sin(3x-1) = 0)");
        }

        double ctg = cos / sin;

        if (ctg == 0) {
            throw new ArithmeticException("Помилка: ділення на нуль (ctg = 0)");
        }

        return Math.cos(2 * x) / ctg;
    }
}
