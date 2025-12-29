# filename: expression_module.py

import math
import pickle  # для роботи з двійковими файлами

def calculate_expression(x):
    """
    Обчислює y = cos(2x) / ctg(3x-1)
    (реалізовано через y = cos(2x) * tan(3x-1))
    """
    try:
        y = math.cos(2 * x) * math.tan(3 * x - 1)
        return y
    except Exception as e:
        print(f"Помилка при обчисленні: {e}")
        return None

def write_text_file(filename, data):
    """Записує дані у текстовий файл"""
    try:
        with open(filename, 'w', encoding='utf-8') as f:
            for x, y in data:
                f.write(f"{x},{y}\n")
    except Exception as e:
        print(f"Помилка при записі текстового файлу: {e}")

def read_text_file(filename):
    """Читає дані з текстового файлу"""
    results = []
    try:
        with open(filename, 'r', encoding='utf-8') as f:
            for line in f:
                x_str, y_str = line.strip().split(',')
                results.append((float(x_str), float(y_str)))
    except Exception as e:
        print(f"Помилка при читанні текстового файлу: {e}")
    return results

def write_binary_file(filename, data):
    """Записує дані у двійковий файл"""
    try:
        with open(filename, 'wb') as f:
            pickle.dump(data, f)
    except Exception as e:
        print(f"Помилка при записі двійкового файлу: {e}")

def read_binary_file(filename):
    """Читає дані з двійкового файлу"""
    try:
        with open(filename, 'rb') as f:
            data = pickle.load(f)
            return data
    except Exception as e:
        print(f"Помилка при читанні двійкового файлу: {e}")
        return []

# Приклад використання
if __name__ == "__main__":
    xs = [0, 0.5, 1.0, 1.5, 2.0]
    results = [(x, calculate_expression(x)) for x in xs]

    write_text_file("results.txt", results)
    write_binary_file("results.bin", results)

    print("Текстовий файл:", read_text_file("results.txt"))
    print("Двійковий файл:", read_binary_file("results.bin"))
