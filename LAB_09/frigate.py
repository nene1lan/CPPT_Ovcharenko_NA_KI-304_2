# frigate.py
# Похідний клас "Фрегат"

from ship import Ship

class Frigate(Ship):
    def __init__(self, name, displacement, speed, missiles):
        """
        Конструктор класу Фрегат
        :param missiles: кількість ракет
        """
        super().__init__(name, displacement, speed)
        self.missiles = missiles

    def info(self):
        """Перевизначений метод інформації"""
        base_info = super().info()
        return f"{base_info}, Ракети: {self.missiles}"

    def attack(self):
        """Метод атаки"""
        if self.missiles > 0:
            self.missiles -= 1
            return "Фрегат здійснив ракетний пуск!"
        else:
            return "Ракети закінчились!"
