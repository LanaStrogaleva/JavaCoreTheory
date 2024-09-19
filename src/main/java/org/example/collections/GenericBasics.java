package org.example.collections;
/**
 * Класс <b>GenericBasics</b> демонстрирует базовые принципы использования дженериков в Java.
 * В примере представлен класс Box, реализующий концепцию универсальной коробки (container), способной хранить объекты любого типа.
 *
 * <p>В методе main создаются и используются экземпляры Box для различных типов данных, включая Integer, String и пользовательский тип User.
 * Это демонстрирует, как класс Box может быть универсально применен для хранения разнообразных типов данных.</p>
 *
 * <p>Класс Box определяет обобщенный тип <T>, который позволяет использовать его для хранения любого объекта.
 * Методы put и get используются для помещения и получения содержимого Box соответственно. Метод toString переопределен
 * для представления содержимого коробки в удобочитаемом формате.</p>
 *
 * <p>Данный пример является полезным ресурсом для понимания основ работы с дженериками в Java и создания гибких, типобезопасных классов.</p>
 */
// Класс GenericBasics демонстрирует использование дженериков на примере класса Box<T>

public class GenericBasics {

    // Вложенный обобщенный класс Box, который может хранить объект любого типа T
    public static class Box<T> {
        // Поле для хранения объекта типа T
        private T content;

        // Конструктор, принимающий объект типа T
        public Box(T content) {
            this.content = content;
        }

        // Метод для помещения объекта в коробку
        public void put(T content) {
            this.content = content;
        }

        // Метод для извлечения объекта из коробки
        public T get() {
            return content;
        }

        // Переопределение метода toString для удобного вывода содержимого коробки
        @Override
        public String toString() {
            return "Box contains: " + content;
        }
    }

    // Основной метод, демонстрирующий использование дженериков
    public static void main(String[] args) {
        // Пример 1: Создание Box для хранения целого числа (Integer)
        Box<Integer> integerBox = new Box<>(10);
        System.out.println(integerBox);  // Вывод: Box contains: 10
        integerBox.put(20);  // Помещаем новое значение в коробку
        System.out.println("Updated: " + integerBox.get());  // Вывод: Updated: 20

        // Пример 2: Создание Box для хранения строки (String)
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox);  // Вывод: Box contains: Hello
        stringBox.put("World");  // Обновляем содержимое коробки
        System.out.println("Updated: " + stringBox.get());  // Вывод: Updated: World

        // Пример 3: Создание Box для пользовательского класса User
        User user = new User("John", 30);
        Box<User> userBox = new Box<>(user);
        System.out.println(userBox);  // Вывод: Box contains: User{name='John', age=30}

        // Обновляем содержимое коробки другим объектом User
        userBox.put(new User("Alice", 25));
        System.out.println("Updated: " + userBox.get());  // Вывод: Updated: User{name='Alice', age=25}
    }

    // Пример пользовательского класса User
    static class User {
        private String name;
        private int age;

        // Конструктор
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Переопределение метода toString для удобного вывода объекта
        @Override
        public String toString() {
            return "User{name='" + name + "', age=" + age + "}";
        }
    }
}
