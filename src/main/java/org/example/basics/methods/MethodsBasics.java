package org.example.basics.methods;
/**
 * Самые базовые примеры использования методов.
 * <p>
 * Методы могут принимать параметры, могут быть без параметров,
 * могут возвращать значения, могут не возвращать.
 */
public class MethodsBasics {
    // Метод без параметров и возвращаемого значения (void)
    public void sayHello() {
        System.out.println("Hello, world!");
    }

    // Метод с параметрами и без возвращаемого значения
    public void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Метод без параметров, но с возвращаемым значением
    public int getRandomNumber() {
        return (int) (Math.random() * 100); // Возвращает случайное число от 0 до 99
    }

    // Метод с параметрами и с возвращаемым значением
    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2; // Возвращает сумму двух чисел
    }

    // Метод с несколькими параметрами разного типа
    public double calculateArea(double width, double height) {
        return width * height; // Возвращает площадь прямоугольника
    }

    public static void main(String[] args) {
        MethodsBasics examples = new MethodsBasics();

        // Вызов метода без параметров
        examples.sayHello();

        // Вызов метода с параметром
        examples.greetPerson("Alice");

        // Вызов метода с возвращаемым значением
        int randomNumber = examples.getRandomNumber();
        System.out.println("Random number: " + randomNumber);

        // Вызов метода с параметрами и возвращаемым значением
        int sum = examples.addTwoNumbers(10, 20);
        System.out.println("Sum: " + sum);

        // Вызов метода с несколькими параметрами
        double area = examples.calculateArea(5.0, 3.0);
        System.out.println("Area: " + area);
    }
}
