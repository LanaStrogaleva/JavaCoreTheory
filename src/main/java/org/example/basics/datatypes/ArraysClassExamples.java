package org.example.basics.datatypes;

import java.util.Arrays;

/**
 * <p>Класс <b>ArraysClassExamples</b> демонстрирует использование класса Arrays и его утилитных методов в Java.
 * Этот класс представляет собой компиляцию примеров работы с массивами, включая сортировку, поиск, заполнение,
 * сравнение и копирование массивов. Хотя массивы могут быть не так широко применяемы в реальной работе, как некоторые
 * другие структуры данных, знание их базового функционала в Java остаётся важным.</p>
 *
 * <p>В примерах класса показаны такие действия, как сортировка массива, выполнение бинарного поиска, заполнение массива
 * одинаковыми значениями, проверка массивов на равенство, копирование массива и создание подмассива из существующего массива.
 * Эти примеры иллюстрируют полезные методы класса Arrays, которые могут упростить и ускорить работу с массивами в Java.</p>
 *
 * <p>Примеры в этом классе являются отличным ресурсом для изучения базовых операций с массивами и понимания их применения
 * в различных сценариях программирования.</p>
 */
public class ArraysClassExamples {
    public static void main(String[] args) {
        // Пример сортировки массива
        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Сортировка массива
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        // Пример бинарного поиска (элемент должен находиться в отсортированном массиве)
        int searchValue = 8;
        int searchIndex = Arrays.binarySearch(numbers, searchValue);
        System.out.println("Индекс элемента " + searchValue + ": " + searchIndex);

        // Пример заполнения массива одинаковыми значениями
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Массив, заполненный значениями 7: " + Arrays.toString(filledArray));

        // Пример проверки массивов на равенство
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        boolean arraysEqual = Arrays.equals(numbers, numbersCopy);
        System.out.println("Массивы равны? " + arraysEqual);

        // Пример копирования части массива (подмассив)
        int[] subArray = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("Подмассив с индексами от 2 до 4: " + Arrays.toString(subArray));
    }
}
