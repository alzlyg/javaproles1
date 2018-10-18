package ru.zlygostev;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

// Коробка, содержит наследников класса Fruit
public class Box<T extends Fruit> {
    final List<T> fruitBox = new ArrayList<T>();

    // Добавляем фрукты в ящик
    final public boolean add(T fruit) {
        if (fruitBox.size() > 0) {
            if (fruitBox.get(0).getType() != fruit.getType()) {
                return FALSE;
            }
        }
        fruitBox.add(fruit);
        return TRUE;
    }

    // Забираем фрукт из ящика
    final public T take() {
        if (fruitBox.size() > 0) {
            T fruit = fruitBox.get(fruitBox.size()-1);
            fruitBox.remove(fruitBox.size()-1);
            return fruit;
        }
        // Предполагается что такого произойти не должно
        // проверку выполнят прежде чем дадут команду взять
        return null;
    }

    // Подчитываем вес ящика
    final public double GetWeigth() {
        double weigth = 0;
        for(int i=0; i<fruitBox.size(); i++) {
            weigth += fruitBox.get(i).getWeigth();
        }
        return weigth;
    }

    // Сравниваем вес ящиков
    final public boolean Compare(Box box) {
        double weigthThis = this.GetWeigth();
        double weigthAnother = box.GetWeigth();
        if (weigthThis == weigthAnother) {
            return TRUE;
        }
        return FALSE;
    }

    // Получаем тип фруктов находящихся в ящике
    final public FruitType getBoxType() {
        if (fruitBox.size() == 0) {
            return FruitType.NONE;
        }
        return fruitBox.get(0).getType();
    }

    // Перекладываем фрукты в наш ящик из другого ящика
    final public boolean moveFrom(Box box) {
        FruitType type = getBoxType();
        if ((type == FruitType.NONE)||(type == box.getBoxType())) {
            // Пересыпаем
            int size = box.fruitBox.size();
            for(int i=0; i<size; i++) {
                T fruit = (T) box.take();
                boolean b = add(fruit);
            }
            return TRUE;
        }
        return FALSE;
    }
}