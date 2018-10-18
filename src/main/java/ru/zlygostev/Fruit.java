package ru.zlygostev;

// Интерфейсный класс фрукты
public class Fruit {
    private double weigth = 0;
    private FruitType type = FruitType.NONE;

    final public void setType(FruitType type) {
        this.type = type;
    };

    final public FruitType getType() {
        return this.type;
    }

    final public void setWeigth(double weigth) {
        this.weigth = weigth;
    };

    final public double getWeigth() {
        return this.weigth;
    }

}
