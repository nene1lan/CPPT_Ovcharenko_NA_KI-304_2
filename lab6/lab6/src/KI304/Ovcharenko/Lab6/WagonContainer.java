package KI304.Ovcharenko.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований контейнер для вагонів
 *
 * @param <T> тип елементів контейнера
 */
public class WagonContainer<T extends Comparable<T>> {

    private List<T> elements = new ArrayList<>();

    /** Додати елемент */
    public void add(T element) {
        elements.add(element);
    }

    /** Видалити елемент */
    public void remove(T element) {
        elements.remove(element);
    }

    /** Отримати елемент за індексом */
    public T get(int index) {
        return elements.get(index);
    }

    /** Пошук максимального елементу */
    public T findMax() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Контейнер порожній");
        }

        T max = elements.get(0);
        for (T el : elements) {
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }
}
