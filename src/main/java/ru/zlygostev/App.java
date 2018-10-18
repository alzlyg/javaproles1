package ru.zlygostev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    final static String[] stringArray = {"Element1", "Element2", "Element3", "Element4", "Element5", "Element6"};
    final static List<String> list = new ArrayList<String>();

    // Метод меняет два элемента массива местами в массиве stringArray
    public static void changePlaces(int placeFrom, int placeTo) {
        int length = stringArray.length;
        if ((placeFrom>=0)&&(placeTo>=0)&&(placeFrom<length)&&(placeTo<length)) {
            String stringTemp = stringArray[placeFrom];
            stringArray[placeFrom] = stringArray[placeTo];
            stringArray[placeTo] = stringTemp;
        }
    }

    // Метод отображает в консоли содержимое массива stringArray
    public static void showStringArray() {
        for(int i=0; i<stringArray.length; i++) {
            System.out.print(" " + stringArray[i]);
        }
        System.out.println(".");
    }

    public static void fillList() {
        Collections.addAll(list, stringArray);
    }

    public static void main( String[] args )
    {
        // Задание 1. Меняем два элемента массива местами
        System.out.println("Массив до перестановки:" );
        showStringArray();
        changePlaces(2, 4);
        System.out.println("Массив после перестановки:");
        showStringArray();

        // Задание 2. Написать метод, который преобразует массив в ArrayList
        fillList();
        System.out.println("Содержимое list:");
        System.out.println(list);

        //Задание 3.
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box boxApple = new Box();
        Box boxAppleNew = new Box();
        Box boxOrange = new Box();
        boolean b;
        b = boxApple.add(apple1);
        b = boxApple.add(apple2);
        b = boxApple.add(apple3);
        b = boxAppleNew.add(apple4);
        b = boxOrange.add(orange1);
        b = boxOrange.add(orange2);
        b = boxOrange.add(orange3);
        System.out.println("Ящик boxApple весит: " + boxApple.GetWeigth());
        System.out.println("Ящик boxAppleNew весит: " + boxAppleNew.GetWeigth());
        System.out.println("Ящик boxOrange весит: " + boxOrange.GetWeigth());
        b = boxApple.Compare(boxOrange);
        if (b) {
            System.out.println("Ящик boxApple и boxOrange совпали по весу");
        } else {
            System.out.println("Ящик boxApple и boxOrange не совпали по весу");
        }

        boxApple.moveFrom(boxAppleNew);
        System.out.println("Пересыпали из ящика boxAppleNew в ящик boxApple");
        System.out.println("Ящик boxApple весит: " + boxApple.GetWeigth());
        System.out.println("Ящик boxAppleNew весит: " + boxAppleNew.GetWeigth());
        System.out.println("Ящик boxOrange весит: " + boxOrange.GetWeigth());
    }
}
