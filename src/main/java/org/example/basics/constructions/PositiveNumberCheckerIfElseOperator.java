package org.example.basics.constructions;

import java.util.Scanner;

/**
 * <p>Класс <b>PositiveNumberCheckerIfElseOperator</b> демонстрирует использование оператора IF-ELSE
 * в Java для проверки числа на знак относительно нуля. Этот класс иллюстрирует, как можно использовать
 * условные операторы для ветвления логики в программе.</p>
 *
 * <p>Особенностью оператора IF-ELSE, в отличие от тернарного оператора, является его способность
 * выполнять блоки кода без возврата значения. Это делает IF-ELSE идеальным выбором для ситуаций,
 * где требуется выполнение различных действий в зависимости от условий.</p>
 *
 * <p>Пример в классе считывает число с консоли и выводит сообщение о том, является ли число
 * положительным, отрицательным или равным нулю.</p>
 */
public class PositiveNumberCheckerIfElseOperator {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрос числа у пользователя
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        // Проверка числа с использованием оператора IF-ELSE
        if (number > 0) {
            System.out.println("Число " + number + " положительное.");
        } else if (number < 0) {
            System.out.println("Число " + number + " отрицательное.");
        } else {
            System.out.println("Число равно нулю.");
        }

        // Закрытие объекта Scanner
        scanner.close();
    }
}
