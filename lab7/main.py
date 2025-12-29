"""
Модуль формування квадратної матриці з внутрішнім
заштрихованим квадратом.

Зовнішня область заповнюється плейсхолдером '*'.
Якщо користувач обирає '*' як символ заповнення,
внутрішній символ автоматично замінюється на '#'.
"""

def generate_matrix(n, user_symbol, outer_symbol='*'):
    """
    Формує квадратну матрицю з внутрішнім квадратом.

    :param n: розмір матриці
    :param user_symbol: символ, введений користувачем
    :param outer_symbol: символ зовнішньої області
    :return: 2D список символів
    """

    if n <= 0:
        raise ValueError("Розмір матриці має бути додатним")

    # Якщо символ користувача збігається з плейсхолдером
    if user_symbol == outer_symbol:
        outer_symbol = '#'

    # Межі внутрішнього квадрата (як у Java-версії)
    inner_start = n // 4
    inner_end = n - inner_start - 1

    matrix = []

    for i in range(n):
        row = []
        for j in range(n):
            if inner_start <= i <= inner_end and inner_start <= j <= inner_end:
                row.append(user_symbol)
            else:
                row.append(outer_symbol)
        matrix.append(row)

    return matrix


def main():
    try:
        n = int(input("Введіть розмір квадратної матриці: "))
        symbol = input("Введіть символ заповнення внутрішньої області: ")

        # Перевірка введеного символу
        if len(symbol) != 1:
            print("Помилка: потрібно ввести рівно один символ.")
            return

        matrix = generate_matrix(n, symbol)

        print("\nСформована матриця:")
        for row in matrix:
            print(" ".join(row))

    except ValueError as e:
        print("Помилка:", e)


if __name__ == "__main__":
    main()
