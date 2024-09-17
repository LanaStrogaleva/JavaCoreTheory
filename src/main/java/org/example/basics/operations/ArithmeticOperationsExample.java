package org.example.basics.operations;
/**
 * <p>Класс <b>ArithmeticOperationsExample</b> демонстрирует основные арифметические операции в Java.
 * В этом классе представлены примеры сложения, вычитания, умножения, деления и нахождения остатка от деления.</p>
 *
 * <p>Каждая операция иллюстрируется на примере простых числовых переменных. Примеры включают как положительные,
 * так и отрицательные числа, чтобы продемонстрировать различные случаи использования арифметических операторов.
 * Кроме того, в примере показано, как операции деления и нахождения остатка от деления работают с отрицательными числами.</p>
 *
 * <p>Этот класс является отличным ресурсом для изучения и понимания основ арифметических операций в программировании
 * на Java и может служить отправной точкой для дальнейшего изучения числовых операций и математических вычислений.</p>
 */
public class ArithmeticOperationsExample {
    public static void main(String[] args) {
        // Пример переменных
        int a = 10;
        int b = 5;
        int c = -3;

        // Сложение
        int sum = a + b;
        System.out.println("Сложение: " + a + " + " + b + " = " + sum);

        // Вычитание
        int difference = a - c;
        System.out.println("Вычитание: " + a + " - " + c + " = " + difference);

        // Умножение
        int product = a * c;
        System.out.println("Умножение: " + a + " * " + c + " = " + product);

        // Деление
        int division = a / b;
        System.out.println("Деление: " + a + " / " + b + " = " + division);

        // Остаток от деления (modulo)
        int remainder = a % c;
        System.out.println("Остаток от деления: " + a + " % " + c + " = " + remainder);
    }
}
