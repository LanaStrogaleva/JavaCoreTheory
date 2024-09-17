package org.example.basics.operations;
/**
 * <p>Класс <b>RoundingExampleWithMathClass</b> демонстрирует примеры корректного округления чисел с плавающей точкой
 * с использованием специальных методов класса Math в Java. Этот класс делает акцент на различных способах округления,
 * предоставляемых классом Math, включая округление вниз, округление вверх, округление до ближайшего целого числа и
 * пользовательское округление до определенного количества десятичных знаков.</p>
 *
 * <p>В классе показано, как использовать методы Math.floor, Math.ceil и Math.round для округления чисел с плавающей точкой.
 * Также представлен пример пользовательского округления, который демонстрирует более гибкий подход к округлению до
 * указанного количества десятичных знаков.</p>
 *
 * <p>Этот класс служит хорошим ресурсом для изучения различных методов округления в Java и может быть полезен при работе
 * с математическими вычислениями, где требуется точность и контроль над процессом округления.</p>
 */
public class RoundingExampleWithMathClass {
    public static void main(String[] args) {
        // Пример числа с плавающей точкой
        double num = 7.5567;

        // Округление вниз (Math.floor)
        double floorResult = Math.floor(num);
        System.out.println("Округление вниз (Math.floor): " + num + " -> " + floorResult);

        // Округление вверх (Math.ceil)
        double ceilResult = Math.ceil(num);
        System.out.println("Округление вверх (Math.ceil): " + num + " -> " + ceilResult);

        // Округление до ближайшего целого числа (Math.round)
        long roundResult = Math.round(num);
        System.out.println("Округление до ближайшего целого (Math.round): " + num + " -> " + roundResult);

        // Пользовательское округление до 2-х десятичных знаков
        double customRounded = roundToDecimalPlaces(num, 2);
        System.out.println("Пользовательское округление до 2 десятичных знаков: " + num + " -> " + customRounded);
    }

    /**
     * Метод для пользовательского округления числа с плавающей точкой до указанного количества десятичных знаков.
     *
     * @param value исходное число с плавающей точкой
     * @param decimalPlaces количество десятичных знаков для округления
     * @return округленное значение
     */
    public static double roundToDecimalPlaces(double value, int decimalPlaces) {
        double scale = Math.pow(10, decimalPlaces);
        return Math.round(value * scale) / scale;
    }
}
