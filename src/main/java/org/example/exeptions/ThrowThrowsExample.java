package org.example.exeptions;
/**
 * Класс <b>ThrowThrowsExample</b> демонстрирует создание и использование пользовательского исключения
 * в Java, а также использование ключевых слов throw и throws.
 *
 * <p>Вложенный класс CustomException является пользовательским исключением, расширяющим стандартный класс Exception.
 * Он обеспечивает возможность генерировать исключения с конкретными сообщениями об ошибках.</p>
 *
 * <p>Метод main содержит блок try-catch для демонстрации выбрасывания и обработки исключения CustomException.
 * Ключевое слово throw используется для генерации исключения, а ключевое слово throws указывает,
 * что метод может выбросить исключение.</p>
 *
 * <p>Метод validateNumber использует throw для генерации CustomException, если проверяемое условие не выполняется.
 * Аннотация @SuppressWarnings("ALL") подавляет предупреждения компилятора для всего кода класса,
 * что может быть полезно в некоторых сценариях, но следует использовать с осторожностью.</p>
 *
 * <p>Этот пример является полезным ресурсом для понимания, как создавать и использовать собственные классы исключений,
 * а также управлять исключениями в Java.</p>
 */
@SuppressWarnings("ALL") // подавляет предупреждения компилятора, например, использование устаревших методов, неиспользуемых переменных и т. д.)
public class ThrowThrowsExample {

    // Вложенный класс CustomException, расширяющий стандартный класс Exception
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            validateNumber(-1); // Вызов метода с недопустимым значением
        } catch (CustomException e) {
            // Обработка пользовательского исключения
            System.out.println("Обработано исключение: " + e.getMessage());
        }
    }

    // Метод для проверки числа, выбрасывающий CustomException
    public static void validateNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Число не может быть отрицательным: " + number);
        }
        System.out.println("Число допустимо: " + number);
    }
}
