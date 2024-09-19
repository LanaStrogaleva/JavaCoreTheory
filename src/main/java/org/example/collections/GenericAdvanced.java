package org.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс <b>GenericAdvanced</b> демонстрирует продвинутое использование дженериков в Java,
 * особенно в контексте коллекций и методов с ограниченными параметрами (wildcards).
 *
 * <p>В методе main создаются две коллекции: одна для Integer и другая для Number.
 * Это демонстрирует, как дженерики обеспечивают строгую типизацию коллекций, позволяя хранить
 * элементы конкретного типа данных.</p>
 *
 * <p>Класс CollectionUtils содержит два статических универсальных метода, демонстрирующих использование
 * ограниченных параметров (wildcards) в дженериках. Метод printCollection использует верхнюю границу (upper-bounded wildcard),
 * что позволяет печатать коллекции любого типа, производного от T. Метод mergeCollections использует нижнюю границу (lower-bounded wildcard),
 * что позволяет объединять коллекции, в которых тип данных является супертипом для T.</p>
 *
 * <p>Эти методы демонстрируют гибкость и мощь дженериков в Java, позволяя разрабатывать универсальные методы,
 * способные работать с широким диапазоном типов данных.</p>
 */
public class GenericAdvanced {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<Number> numList = new ArrayList<>();
        numList.add(1.5);
        numList.add(2.5);
        numList.add(3.5);

        // Вызов методов с ограниченными дженериками
        CollectionUtils.printCollection(intList); // работает с Integer и производными от Number
        CollectionUtils.printCollection(numList); // работает с Number

        CollectionUtils.mergeCollections(intList, numList); // объединяем две коллекции
        System.out.println("After merge: " + numList);
    }
}

class CollectionUtils {

    // Метод с верхней границей (upper-bounded wildcard)
    public static void printCollection(List<? extends Number> list) {
        for (Number element : list) {
            System.out.println(element);
        }
    }

    // Метод с нижней границей (lower-bounded wildcard)
    public static <T> void mergeCollections(List<? extends T> source, List<? super T> destination) {
        for (T element : source) {
            destination.add(element);
        }
    }
}
