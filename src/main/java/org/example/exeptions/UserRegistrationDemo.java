package org.example.exeptions;
/**
 * Класс <b>UserRegistrationDemo</b> демонстрирует различие между проверяемыми (checked) и непроверяемыми (unchecked)
 * исключениями в Java. Этот класс моделирует процесс регистрации пользователя и использует проверяемые исключения
 * для валидации данных пользователя и непроверяемые исключения для обработки ошибок, связанных с базой данных.
 *
 * <p>В классе определены два типа исключений:</p>
 * <ul>
 *     <li><i>InvalidDataException</i> - проверяемое исключение, предназначенное для обработки ошибок валидации данных.</li>
 *     <li><i>DatabaseRuntimeException</i> - непроверяемое исключение, представляющее ошибки, связанные с базой данных.</li>
 * </ul>
 *
 * <p>Метод <i>registerUser</i> в классе <i>UserRegistration</i> использует проверяемое исключение InvalidDataException
 * для индикации невалидных данных. Метод <i>simulateDatabaseError</i> генерирует непроверяемое исключение DatabaseRuntimeException,
 * имитируя ситуацию ошибки в работе с базой данных.</p>
 *
 * <p>Пример в методе main демонстрирует обработку этих исключений. Проверяемое исключение должно быть либо перехвачено в блоке catch,
 * либо объявлено в сигнатуре метода с помощью ключевого слова throws, в то время как непроверяемое исключение может быть перехвачено,
 * но не требует объявления в сигнатуре метода.</p>
 *
 * <p>Этот класс является полезным ресурсом для понимания работы с разными типами исключений в Java и их практического использования
 * для обработки ошибок в приложениях.</p>
 */
// Проверяемое исключение для обработки ошибок валидации данных
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

// Непроверяемое исключение для обработки ошибок, связанных с базой данных
class DatabaseRuntimeException extends RuntimeException {
    public DatabaseRuntimeException(String message) {
        super(message);
    }
}

// Класс для регистрации пользователя
class UserRegistration {
    public void registerUser(String username, String password) throws InvalidDataException {
        // Простейшая валидация данных
        if (username == null || username.isEmpty()) {
            throw new InvalidDataException("Имя пользователя не может быть пустым.");
        }
        if (password == null || password.length() < 6) {
            throw new InvalidDataException("Пароль должен содержать минимум 6 символов.");
        }

        // Имитируем ошибку базы данных
        simulateDatabaseError();
        System.out.println("Пользователь " + username + " успешно зарегистрирован.");
    }

    // Метод, который имитирует ошибку базы данных
    private void simulateDatabaseError() {
        throw new DatabaseRuntimeException("Ошибка подключения к базе данных.");
    }
}

// Главный класс для демонстрации
public class UserRegistrationDemo {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            userRegistration.registerUser("", "password123");
        } catch (InvalidDataException e) {
            System.err.println("Ошибка валидации: " + e.getMessage());
        } catch (DatabaseRuntimeException e) {
            System.err.println("Ошибка базы данных: " + e.getMessage());
        }

        try {
            userRegistration.registerUser("user1", "short");
        } catch (InvalidDataException e) {
            System.err.println("Ошибка валидации: " + e.getMessage());
        } catch (DatabaseRuntimeException e) {
            System.err.println("Ошибка базы данных: " + e.getMessage());
        }

        try {
            userRegistration.registerUser("user2", "password123");
        } catch (InvalidDataException e) {
            System.err.println("Ошибка валидации: " + e.getMessage());
        } catch (DatabaseRuntimeException e) {
            System.err.println("Ошибка базы данных: " + e.getMessage());
        }
    }
}
