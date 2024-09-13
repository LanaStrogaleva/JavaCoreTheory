package org.example.basics.datatypes;
/**
 * Пример использования классов-обёрток над примитивными типами.
 * <p>
 * Отдельный метод как пример для всех остальных типов классов-обёрток.
 * <p>
 * Небольшой акцент на создании Java docs.
 */
public class WrapperExample {
    /**
     * Пример использования класса-обёртки Integer.
     * Создание объекта Integer и преобразование строки в число.
     */
    public static void integerWrapperExample() {
        // Создание объекта класса-обёртки Integer
        Integer integerValue = Integer.valueOf(10);

        // Преобразование строки в Integer
        String numberStr = "100";
        Integer parsedValue = Integer.parseInt(numberStr);

        // Использование методов класса-обёртки
        System.out.println("Значение integerValue: " + integerValue);
        System.out.println("Преобразованное значение из строки: " + parsedValue);
    }

    /**
     * Пример использования класса-обёртки Double.
     * Создание объекта Double и преобразование строки в число с плавающей точкой.
     */
    public static void doubleWrapperExample() {
        // Создание объекта класса-обёртки Double
        Double doubleValue = Double.valueOf(5.55);

        // Преобразование строки в Double
        String doubleStr = "12.34";
        Double parsedDouble = Double.parseDouble(doubleStr);

        // Использование методов класса-обёртки
        System.out.println("Значение doubleValue: " + doubleValue);
        System.out.println("Преобразованное значение из строки: " + parsedDouble);
    }

    /**
     * Пример использования класса-обёртки Boolean.
     * Создание объекта Boolean и преобразование строки в логическое значение.
     */
    public static void booleanWrapperExample() {
        // Создание объекта класса-обёртки Boolean
        Boolean boolValue = Boolean.valueOf(true);

        // Преобразование строки в Boolean
        String booleanStr = "false";
        Boolean parsedBoolean = Boolean.parseBoolean(booleanStr);

        // Использование методов класса-обёртки
        System.out.println("Значение boolValue: " + boolValue);
        System.out.println("Преобразованное значение из строки: " + parsedBoolean);
    }

    /**
     * Пример использования класса-обёртки Character.
     * Создание объекта Character и работа с символами.
     */
    public static void characterWrapperExample() {
        // Создание объекта класса-обёртки Character
        Character charValue = Character.valueOf('A');

        // Проверка, является ли символ буквой
        boolean isLetter = Character.isLetter(charValue);

        // Использование методов класса-обёртки
        System.out.println("Значение charValue: " + charValue);
        System.out.println("Это буква? " + isLetter);
    }

    /**
     * Пример использования класса-обёртки Long.
     * Создание объекта Long и преобразование строки в длинное целое число.
     */
    public static void longWrapperExample() {
        // Создание объекта класса-обёртки Long
        Long longValue = Long.valueOf(100000L);

        // Преобразование строки в Long
        String longStr = "123456789";
        Long parsedLong = Long.parseLong(longStr);

        // Использование методов класса-обёртки
        System.out.println("Значение longValue: " + longValue);
        System.out.println("Преобразованное значение из строки: " + parsedLong);
    }

    public static void main(String[] args) {
        // Вызов примеров для каждого класса-обёртки
        integerWrapperExample();
        doubleWrapperExample();
        booleanWrapperExample();
        characterWrapperExample();
        longWrapperExample();
    }
}
