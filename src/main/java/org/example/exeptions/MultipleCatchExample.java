package org.example.exeptions;
/**
 * Класс <b>MultipleCatchExample</b> демонстрирует использование нескольких блоков catch для обработки различных классов исключений в Java.
 * В этом примере показано, как перехватывать и обрабатывать конкретные исключения, такие как NullPointerException,
 * а также более общие исключения, покрываемые классом Exception.
 *
 * <p>В методе main представлен блок try, в котором происходит попытка доступа к длине строки, значение которой равно null.
 * Это приводит к возникновению NullPointerException. Блок catch для NullPointerException перехватывает это исключение и обрабатывает его,
 * выводя соответствующее сообщение. Если бы возникло иное исключение, оно было бы обработано вторым блоком catch, который перехватывает
 * любой тип Exception.</p>
 *
 * <p>Этот пример является полезным ресурсом для понимания, как управлять различными типами исключений в Java,
 * обеспечивая корректную обработку ошибок в приложении.</p>
 */
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Попытка доступа к длине строки, значение которой равно null
            String text = null;
            System.out.println("Длина строки: " + text.length());
        } catch (NullPointerException e) {
            // Обработка исключения NullPointerException
            System.out.println("Ошибка: Попытка доступа к длине строки, значение которой равно null.");
        } catch (Exception e) {
            // Обработка любого другого исключения
            System.out.println("Общая ошибка: " + e.getMessage());
        }

        // Дополнительный пример с другой ошибкой
        anotherExample();
    }

    public static void anotherExample() {
        try {
            // Попытка деления на ноль
            int result = 10 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            // Обработка исключения ArithmeticException
            System.out.println("Ошибка: Деление на ноль.");
        } catch (Exception e) {
            // Обработка любого другого исключения
            System.out.println("Общая ошибка: " + e.getMessage());
        }
    }
}
