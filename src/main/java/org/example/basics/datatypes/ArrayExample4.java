package org.example.basics.datatypes;
/**
 * Пример создания двумерного массива (инициализация элементов)
 * и обход элементов циклом с счётчиком и циклом for-each.
 */
public class ArrayExample4 {
    public static void main(String[] args) {
        // Создание и инициализация двумерного массива
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Обход элементов массива циклом с счётчиком
        System.out.println("Обход элементов циклом с счётчиком:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Перенос строки для корректного отображения
        }

        // Обход элементов массива циклом for-each
        System.out.println("\nОбход элементов циклом for-each:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Перенос строки для корректного отображения
        }
    }
}
