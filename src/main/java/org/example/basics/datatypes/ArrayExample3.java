package org.example.basics.datatypes;
/**
 * Пример создания массива (инициализация элементов) и обход элементов циклом for-each.
 */
public class ArrayExample3 {
    public static void main(String[] args) {
        // Создаём и инициализируем массив целых чисел
        int[] numbers = {10, 20, 30, 40, 50};

        // Обход элементов массива циклом for-each
        for (int number : numbers) {
            System.out.println("Элемент массива: " + number);
        }
    }
}
