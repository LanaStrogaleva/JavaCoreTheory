package org.example.oop.abstractandinterface;
// Example 2: Using an Abstract Class

/**
 * Абстрактный класс ShapeForAbstract представляет основу для геометрических фигур.
 * <p>
 * Этот класс определяет абстрактные методы для расчета площади и периметра фигуры,
 * а также включает метод для вывода имени класса конкретного объекта.
 * <p>
 * Абстрактные методы:
 * <ul>
 *     <li><b>calculateArea</b> - Для расчета площади фигуры.</li>
 *     <li><b>calculatePerimeter</b> - Для расчета периметра фигуры.</li>
 * </ul>
 * <p>
 * Обычный метод:
 * <ul>
 *     <li><b>printObjectClass</b> - Выводит каноническое имя класса объекта.</li>
 * </ul>
 */
abstract class ShapeForAbstract {
    /**
     * Абстрактный метод для расчета площади фигуры.
     */
    public abstract double calculateArea();

    /**
     * Абстрактный метод для расчета периметра фигуры.
     */
    public abstract double calculatePerimeter();

    /**
     * Метод для вывода канонического имени класса объекта.
     */
    public void printObjectClass() {
        System.out.println("Класс объекта: " + this.getClass().getCanonicalName());
    }

    /**
     *  класс Circle, который наследует ShapeForAbstract и реализует методы calculateArea и calculatePerimeter.
     */
    public static class Circle extends ShapeForAbstract{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double calculateArea() {
            return Math.round(Math.PI*radius*radius);
        }
        @Override
        public double calculatePerimeter() {
            return Math.round(2 * Math.PI * radius);
        }
    }

    public static void main(String[] args) {
        ShapeForAbstract circle = new Circle(5.0);
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println("Площадь: " + circle.calculateArea());
        circle.printObjectClass();
    }
}