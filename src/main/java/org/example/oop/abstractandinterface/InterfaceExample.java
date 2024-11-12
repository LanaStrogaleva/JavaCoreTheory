package org.example.oop.abstractandinterface;
// Example 1: Using an Interface

/**
 * Интерфейс Shape определяет структуру для геометрических фигур.
 * <p>
 * Этот интерфейс включает методы для расчета площади и периметра фигуры.
 * Методы:
 * <ul>
 *     <li><b>calculateArea</b> - Рассчитывает и возвращает площадь фигуры.</li>
 *     <li><b>calculatePerimeter</b> - Рассчитывает и возвращает периметр фигуры.</li>
 * </ul>
 */
 interface Shape {
    double calculateArea();
    double calculatePerimeter();
    class Circle implements Shape{
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
        Shape circle = new Circle(5.0);
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println("Площадь: " + circle.calculateArea());
    }
}
