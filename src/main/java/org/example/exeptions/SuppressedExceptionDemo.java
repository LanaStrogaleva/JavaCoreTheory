package org.example.exeptions;
/**
 * Класс <b>SuppressedExceptionDemo</b> демонстрирует работу с подавленными исключениями в Java,
 * используя механизм try-with-resources для автоматического управления ресурсами и обработки исключений.
 *
 * <p>В классе реализован вложенный статический класс CustomResource, который имплементирует интерфейс AutoCloseable.
 * При закрытии экземпляра CustomResource автоматически генерируется исключение, которое является подавленным (suppressed).</p>
 *
 * <p>В методе main() создается экземпляр CustomResource, который автоматически закрывается по завершении выполнения блока try.
 * В этом блоке генерируется "основное" исключение. В последующем блоке catch отлавливается основное исключение,
 * и для него выводятся все связанные подавленные исключения с помощью метода getSuppressed.</p>
 *
 * <p>Этот пример иллюстрирует важность управления ресурсами и обработки исключений в современном программировании на Java,
 * а также демонстрирует механизм подавления исключений, который может быть полезен в сложных сценариях обработки ошибок.</p>
 */
public class SuppressedExceptionDemo {
    // Вложенный статический класс, который реализует интерфейс AutoCloseable
    static class CustomResource implements AutoCloseable {
        @Override
        public void close() {
            // Генерация исключения при закрытии ресурса
            throw new RuntimeException("Ошибка при закрытии ресурса.");
        }
    }

    public static void main(String[] args) {
        try (CustomResource resource = new CustomResource()) {
            // Генерация основного исключения
            throw new IllegalArgumentException("Основная ошибка.");
        } catch (IllegalArgumentException e) {
            // Обработка основного исключения
            System.out.println("Обработано исключение: " + e.getMessage());

            // Получение и вывод подавленных исключений
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Подавленное исключение: " + suppressed.getMessage());
            }
        }
    }
}
