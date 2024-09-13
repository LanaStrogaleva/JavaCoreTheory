package org.example.basics.datatypes;
/**
 * <p>Класс <b>StringExamples</b> представляет собой пример работы с классом String в Java.
 * Основной акцент в данном классе сделан на разнообразии методов, доступных для объектов String.</p>
 *
 * <p>Примеры включают создание и инициализацию строковых объектов, конкатенацию строк, использование
 * различных методов класса String для преобразования регистра, измерения длины и сравнения строк. Эти операции
 * являются основными для работы со строками в Java и показывают, как можно манипулировать и анализировать
 * текстовые данные.</p>
 *
 * <p>В классе также демонстрируется важность правильного сравнения строк с использованием методов 'equals()'
 * и 'equalsIgnoreCase()' вместо оператора '==', который сравнивает ссылки на объекты, а не их содержимое.</p>
 *
 * <p>Этот класс служит хорошим ресурсом для понимания базовых и важных аспектов работы со строками в Java,
 * включая манипуляции с текстом и сравнение строк.</p>
 */
public class StringExamples {
    public static void main(String[] args) {
        // Создание и инициализация строк
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";

        // Конкатенация строк
        String concatenated = str1 + " " + str2;
        System.out.println("Конкатенация строк: " + concatenated);

        // Преобразование строки в верхний и нижний регистр
        System.out.println("Верхний регистр: " + str1.toUpperCase());
        System.out.println("Нижний регистр: " + str2.toLowerCase());

        // Измерение длины строки
        System.out.println("Длина строки '" + str1 + "': " + str1.length());

        // Сравнение строк (с учётом регистра)
        boolean areEqual = str1.equals(str3);
        System.out.println("Строки '" + str1 + "' и '" + str3 + "' равны? " + areEqual);

        // Сравнение строк (без учёта регистра)
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("Строки '" + str1 + "' и '" + str3 + "' равны (игнорируя регистр)? " + areEqualIgnoreCase);

        // Извлечение подстроки
        String substring = concatenated.substring(0, 5);
        System.out.println("Подстрока: " + substring);

        // Проверка, содержит ли строка другой текст
        boolean containsWorld = concatenated.contains("World");
        System.out.println("Строка содержит 'World'? " + containsWorld);

        // Разбиение строки на части
        String[] words = concatenated.split(" ");
        System.out.println("Разбиение строки на слова:");
        for (String word : words) {
            System.out.println(word);
        }

        // Замена символов в строке
        String replacedStr = concatenated.replace('o', '0');
        System.out.println("Строка после замены символов: " + replacedStr);

        // Тримминг (удаление пробелов в начале и конце строки)
        String spacedStr = "   Java   ";
        System.out.println("Оригинальная строка с пробелами: '" + spacedStr + "'");
        System.out.println("Строка без пробелов: '" + spacedStr.trim() + "'");
    }
}
