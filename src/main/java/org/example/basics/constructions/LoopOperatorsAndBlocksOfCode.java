package org.example.basics.constructions;
/**
 * <p>Класс <b>LoopOperatorsAndBlocksOfCode</b> демонстрирует использование основных циклических операторов
 * в языке программирования Java, включая <i>for</i>, <i>while</i> и <i>do-while</i>. Этот класс предназначен
 * для обучения основам работы с циклами в Java.</p>
 *
 * <p>В методе <code>main</code> данного класса представлены примеры каждого из циклов. Каждый пример
 * иллюстрирует базовый синтаксис и принципы работы соответствующего циклического оператора. Это помогает
 * начинающим разработчикам понять, как контролировать поток выполнения программы с помощью циклов.</p>
 *
 * <p>Кроме того, в классе показано использование блочных операторов для организации области видимости переменных.
 * Это важный аспект в понимании того, как переменные и блоки кода взаимодействуют в Java.</p>
 */
public class LoopOperatorsAndBlocksOfCode {
    public static void main(String[] args) {
        // Пример цикла for
        System.out.println("Пример цикла for:");
        forLoopExample();

        // Пример цикла while
        System.out.println("\nПример цикла while:");
        whileLoopExample();

        // Пример цикла do-while
        System.out.println("\nПример цикла do-while:");
        doWhileLoopExample();
        // Пример использование блочных операторов для организации области видимости переменных.
        System.out.println("\nПример области видимости переменных внутри блока кода.");
        blocksOfCodeExample();

    }

    /**
     * Пример использования цикла for.
     * Цикл for используется для повторения блока кода заданное количество раз.
     */
    public static void forLoopExample() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Цикл for, итерация: " + i);
        }
    }

    /**
     * Пример использования цикла while.
     * Цикл while продолжает выполнение блока кода, пока условие истинно.
     */
    public static void whileLoopExample() {
        int i = 0;
        while (i < 5) {
            System.out.println("Цикл while, итерация: " + i);
            i++;
        }
    }

    /**
     * Пример использования цикла do-while.
     * Цикл do-while выполняет блок кода как минимум один раз, прежде чем проверить условие.
     */
    public static void doWhileLoopExample() {
        int i = 0;
        do {
            System.out.println("Цикл do-while, итерация: " + i);
            i++;
        } while (i < 5);
    }
    /**
     * Пример использование блочных операторов для организации области видимости переменных..
     */
    public static void blocksOfCodeExample() {
        {
            int b = 10; // - первый раз объявили переменную b
            System.out.println("Переменная b -объявили первый раз: " + b);
        }

         {
            int b = 20; // - второй раз объявили переменную b
            System.out.println("Переменная b -объявили второй раз: " + b);
        }
    }

}
