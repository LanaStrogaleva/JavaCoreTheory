package org.example.basics.datatypes;
/**
 * Пример создания массива (инициализация элементов) и обход элементов циклом с счётчиком.
 */
public class ArrayExample2 {
    public static void main(String[] args) {
        // Создаём массив из 5 элементов
        int[] numbers = new int[5];

        // Инициализируем элементы массива значениями
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 10;  // Присваиваем каждому элементу значение (i+1)*10
        }

        // Обходим элементы массива циклом с счётчиком и выводим их значения
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент массива на позиции " + i + ": " + numbers[i]);
        }
    }
}
