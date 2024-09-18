package org.example.basics.variables;
/**
 * Класс <b>VariablesPrimitive</b> демонстрирует использование примитивных типов данных в Java.
 * В классе представлены основные примитивные типы, такие как byte, short, int, long, float, double, char и boolean,
 * а также их основные характеристики и диапазоны значений.
 *
 * <p>Каждая переменная инициализируется с примером значения, соответствующим её типу. Примеры включают целые числа,
 * числа с плавающей точкой, символы и логические значения. Класс также иллюстрирует особенности литералов для типов long и float.</p>
 *
 * <p>Метод displayValues выводит значения всех примитивных переменных, демонстрируя, как они хранятся и используются в программе.
 * Этот класс является полезным ресурсом для понимания базовых типов данных в Java и их использования в различных контекстах программирования.</p>
 */
public class VariablesPrimitive {
    public static void main(String[] args) {
        // Примитивные типы данных

        // Целые числа
        byte byteValue = 10;             // 8 бит (от -128 до 127)
        short shortValue = 1000;          // 16 бит (от -32,768 до 32,767)
        int intValue = 50000;            // 32 бит (от -2,147,483,648 до 2,147,483,647)
        long longValue = 100000L;        // 64 бит (от -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807)

        // Числа с плавающей точкой
        float floatValue = 3.14F;        // 32 бит (примерно ±1.4E-45 до ±3.4E38)
        double doubleValue = 3.14159;    // 64 бит (примерно ±4.9E-324 до ±1.8E308)

        // Символы
        char charValue = 'A';            // 16 бит (от '\u0000' до '\uffff')

        // Логические значения
        boolean booleanValue = true;     // true или false

        // Метод для отображения значений всех переменных
        displayValues(byteValue, shortValue, intValue, longValue, floatValue, doubleValue, charValue, booleanValue);
    }

    // Метод для отображения значений всех примитивных переменных
    public static void displayValues(byte byteValue, short shortValue, int intValue, long longValue,
                                     float floatValue, double doubleValue, char charValue, boolean booleanValue) {
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}
