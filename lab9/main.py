# main.py
# Точка входу в програму

from frigate import Frigate

def main():
    frigate = Frigate(
        name="Гетьман Сагайдачний",
        displacement=3500,
        speed=30,
        missiles=8
    )

    print(frigate.info())
    print(frigate.attack())
    print(frigate.attack())
    print("Залишилось ракет:", frigate.missiles)

if __name__ == "__main__":
    main()
