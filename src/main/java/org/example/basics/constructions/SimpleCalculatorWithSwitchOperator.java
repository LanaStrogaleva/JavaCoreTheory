package org.example.basics.constructions;

import java.util.Scanner;

/**
 * <p>Класс <b>SimpleCalculatorWithSwitchOperator</b> демонстрирует работу оператора Switch в Java, используя переменную типа Char.
 * Этот класс представляет собой простой консольный калькулятор, способный выполнять основные арифметические операции
 * такие как сложение, вычитание, умножение и деление.</p>
 *
 * <p>Класс использует класс Scanner для считывания входных данных от пользователя, включая два числа и выбор операции.
 * Оператор Switch используется для выбора арифметической операции на основе введённого символа операции.
 * Реализация включает в себя обработку исключительных ситуаций, таких как деление на ноль и ввод недопустимой операции.</p>
 *
 * <p>Данный пример иллюстрирует использование оператора Switch для упрощения кода при работе с множественными условиями,
 * а также подчеркивает важность обработки исключений в пользовательских вводах.</p>
 */
public class SimpleCalculatorWithSwitchOperator {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрос первого числа у пользователя
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Запрос второго числа у пользователя
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Запрос операции у пользователя
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Переменная для хранения результата вычислений
        double result;

        // Выбор арифметической операции с использованием оператора Switch
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат сложения: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат вычитания: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат умножения: " + result);
                break;
            case '/':
                // Проверка деления на ноль
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат деления: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Ошибка: недопустимая операция.");
                break;
        }

        // Закрытие объекта Scanner
        scanner.close();
    }
}
