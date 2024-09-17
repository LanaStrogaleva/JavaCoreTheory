package org.example.basics.operations;
/**
 * <p>Класс <b>LogicOperationsExample</b> демонстрирует использование логических операций в Java,
 * также известных как операции алгебры логики. В классе приведены примеры основных логических операторов,
 * включая AND, OR, XOR, NOT, а также короткозамкнутые версии операторов AND и OR.</p>
 *
 * <p>Для каждого оператора в комментариях кода представлена соответствующая таблица истинности,
 * которая помогает понять, как оператор работает на различных комбинациях логических значений.
 * Это важно для понимания логических операций, которые широко используются в условных операторах и циклах.</p>
 *
 * <p>Кроме того, класс включает примеры использования операторов сравнения, которые являются основой
 * для формирования логических выражений в программировании. Эти примеры иллюстрируют, как можно
 * строить сложные условные конструкции, используя различные логические операторы и операторы сравнения.</p>
 *
 * <p>Этот класс является полезным ресурсом для изучения основ логических операций и их применения в Java.</p>
 */
public class LogicOperationsExample {
    public static void main(String[] args) {
        // Логические переменные
        boolean a = true;
        boolean b = false;

        // Логическое И (AND)
        boolean andResult = a && b;
        System.out.println("Логическое И (AND): " + a + " && " + b + " = " + andResult);
        // Таблица истинности для AND:
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Логическое ИЛИ (OR)
        boolean orResult = a || b;
        System.out.println("Логическое ИЛИ (OR): " + a + " || " + b + " = " + orResult);
        // Таблица истинности для OR:
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // Логическое исключающее ИЛИ (XOR)
        boolean xorResult = a ^ b;
        System.out.println("Логическое исключающее ИЛИ (XOR): " + a + " ^ " + b + " = " + xorResult);
        // Таблица истинности для XOR:
        // true ^ true = false
        // true ^ false = true
        // false ^ true = true
        // false ^ false = false

        // Логическое НЕ (NOT)
        boolean notResult = !a;
        System.out.println("Логическое НЕ (NOT): !" + a + " = " + notResult);
        // Таблица истинности для NOT:
        // !true = false
        // !false = true

        // Короткозамкнутое логическое И (short-circuit AND)
        boolean shortCircuitAndResult = a && (b = true);  // b присвоится только если a == true
        System.out.println("Короткозамкнутое И: " + a + " && (b = true) = " + shortCircuitAndResult + ", b = " + b);

        // Короткозамкнутое логическое ИЛИ (short-circuit OR)
        boolean shortCircuitOrResult = b || (a = false);  // a присвоится только если b == false
        System.out.println("Короткозамкнутое ИЛИ: " + b + " || (a = false) = " + shortCircuitOrResult + ", a = " + a);

        // Примеры операторов сравнения
        int x = 10;
        int y = 20;

        // Оператор "равно" (==)
        boolean equalResult = x == y;
        System.out.println(x + " == " + y + " = " + equalResult);

        // Оператор "не равно" (!=)
        boolean notEqualResult = x != y;
        System.out.println(x + " != " + y + " = " + notEqualResult);

        // Оператор "больше" (>)
        boolean greaterResult = x > y;
        System.out.println(x + " > " + y + " = " + greaterResult);

        // Оператор "меньше" (<)
        boolean lessResult = x < y;
        System.out.println(x + " < " + y + " = " + lessResult);

        // Оператор "больше или равно" (>=)
        boolean greaterOrEqualResult = x >= y;
        System.out.println(x + " >= " + y + " = " + greaterOrEqualResult);

        // Оператор "меньше или равно" (<=)
        boolean lessOrEqualResult = x <= y;
        System.out.println(x + " <= " + y + " = " + lessOrEqualResult);
    }
}
