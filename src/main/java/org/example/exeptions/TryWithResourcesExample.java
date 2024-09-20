package org.example.exeptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Класс <b>TryWithResourcesExample</b> демонстрирует использование конструкции try-with-resources в Java.
 * Эта конструкция используется в ситуациях, когда требуется автоматическое закрытие ресурсов, например, при работе с файлами,
 * для предотвращения утечек ресурсов, особенно в случае возникновения исключений.
 *
 * <p>В методе main создается экземпляр BufferedReader внутри блока try-with-resources.
 * Это гарантирует, что BufferedReader будет автоматически закрыт по завершении блока try, независимо от того,
 * произошло исключение или нет. Такой подход обеспечивает более чистый и безопасный код по сравнению с традиционными методами
 * работы с ресурсами, требующими явного закрытия в блоке finally.</p>
 *
 * <p>В блоке try выполняется чтение из файла и вывод содержимого на экран. В случае возникновения IOException,
 * исключение перехватывается и обрабатывается в блоке catch.</p>
 *
 * <p>Этот пример является полезным ресурсом для понимания механизма автоматического управления ресурсами в Java
 * и обеспечения более надежной работы с файлами и другими ресурсами.</p>
 */
public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Путь к файлу, который будет прочитан
        String filePath = "example.txt";

        // Использование try-with-resources для автоматического закрытия BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Чтение файла построчно
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Вывод строки на экран
            }
        } catch (IOException e) {
            // Обработка исключения, если возникла ошибка ввода-вывода
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
