package org.example.basics.datatypes;

import java.util.Arrays;

/**
 * Пример создания массива и обход элементов циклом с счётчиком.
 */
public class ArrayExample1 {
    public static void main(String[] args) {
        // Создаём массив целых чисел
        int[] numbers = {10, 20, 30, 40, 50};

        // Цикл с счётчиком для обхода элементов массива
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент массива на позиции " + i + ": " + numbers[i]);
        }
        System.out.println(numbers);
        System.out.println(numbers.toString());
        System.out.println(Arrays.toString(numbers));
    }

}
