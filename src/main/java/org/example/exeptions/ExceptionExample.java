package org.example.exeptions;

import java.util.Arrays;

/**
 * Класс <b>ExceptionExample</b> демонстрирует основы синтаксиса обработки исключений в Java, включая использование блоков try, catch и finally.
 *
 * <p>В методе main показан пример блока try, в котором может возникнуть исключение (деление на ноль), и блока catch,
 * предназначенного для перехвата и обработки исключения ArithmeticException. Также присутствует блок finally, который выполняется
 * после блоков try и catch, независимо от того, возникло исключение или нет.</p>
 *
 * <p>Метод severalCatchBlocks демонстрирует использование нескольких блоков catch для обработки различных типов исключений.
 * Это позволяет более гранулированно управлять обработкой исключений, обеспечивая специфическую реакцию на различные виды ошибок.</p>
 *
 * <p>Данный класс является полезным ресурсом для понимания базовых принципов обработки исключений в Java,
 * что необходимо для написания надежных и устойчивых к ошибкам приложений.</p>
 */
public class ExceptionExample {
    public static void main(String[] args) {
        // Пример обработки исключений
        try {
            // Код, который может вызвать исключение
            int result = 10 / 0; // Деление на ноль
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            // Обработка исключения ArithmeticException
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            // Блок finally выполняется всегда
            System.out.println("Блок finally выполнен.");
        }

        // Пример с несколькими блоками catch
        severalCatchBlocks();
    }

    public static void severalCatchBlocks() {
        try {
            String text = null;
            // Попытка вызвать NullPointerException
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Обработка исключения NullPointerException
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            // Обработка любого другого исключения
            System.out.println("Общая ошибка: " + e.getMessage());
        } finally {
            // Блок finally выполняется всегда
            System.out.println("Блок finally в severalCatchBlocks выполнен.");
        }
    }

}
