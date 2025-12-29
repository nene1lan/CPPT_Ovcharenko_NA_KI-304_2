# ship.py
# Базовий клас "Корабель"

class Ship:
    def __init__(self, name, displacement, speed):
        """
        Конструктор класу Корабель
        :param name: назва корабля
        :param displacement: водотоннажність (тонни)
        :param speed: швидкість (вузли)
        """
        self.name = name
        self.displacement = displacement
        self.speed = speed

    def info(self):
        """Повертає інформацію про корабель"""
        return (f"Корабель: {self.name}, "
                f"Водотоннажність: {self.displacement} т, "
                f"Швидкість: {self.speed} вузлів")
