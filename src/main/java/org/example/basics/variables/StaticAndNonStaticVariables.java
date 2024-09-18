package org.example.basics.variables;
/**
 * <p>Класс <b>StaticAndNonStaticVariables</b> демонстрирует использование статических и нестатических
 * переменных в Java. В классе показаны способы доступа к этим переменным и приведен пример изменения
 * одной глобальной переменной на уровне класса при использовании инкремента в конструкторе.</p>
 *
 * <p>Статическая переменная (static) totalCount представляет собой глобальный счетчик, общий для всех
 * экземпляров класса Counter. Каждое создание экземпляра Counter увеличивает это значение.
 * В отличие от нестатической переменной instanceCount, которая уникальна для каждого объекта и отслеживает
 * счет только для данного экземпляра.</p>
 *
 * <p>Примеры создания экземпляров класса Counter и вызова метода displayCounts иллюстрируют разницу
 * в поведении и использовании статических и нестатических переменных. Это помогает понять концепцию области
 * видимости переменных и как они управляются и хранятся в памяти.</p>
 *
 * <p>Класс является полезным ресурсом для изучения основ работы со статическими и нестатическими переменными
 * в объектно-ориентированном программировании на Java.</p>
 */
public class StaticAndNonStaticVariables {
    // Статическая переменная для глобального счетчика totalCount увеличивается каждый раз,
    // когда создается новый экземпляр класса StaticAndNonStaticVariables.
    // Это значение будет общим для всех экземпляров класса.
    private static int totalCount = 0;

    // Нестатическая переменная для счетчика экземпляра instanceCount
    // увеличивается только для текущего экземпляра класса.
    // Каждый объект имеет свой собственный instanceCount.
    private int instanceCount = 0;

    // Конструктор класса
    public StaticAndNonStaticVariables() {
        // Увеличиваем глобальный счетчик при создании нового экземпляра
        totalCount++;
        // Увеличиваем счетчик для текущего экземпляра
        instanceCount++;
    }

    // Метод для отображения значений счетчиков
    public void displayCounts() {
        System.out.println("Total Count: " + totalCount);
        System.out.println("Instance Count: " + instanceCount);
    }

    public static void main(String[] args) {
        // Создаем несколько экземпляров класса и отображаем счетчики для каждого созданного класса:
        StaticAndNonStaticVariables obj1 = new StaticAndNonStaticVariables();
        obj1.displayCounts();
        StaticAndNonStaticVariables obj2 = new StaticAndNonStaticVariables();
        obj2.displayCounts();
        StaticAndNonStaticVariables obj3 = new StaticAndNonStaticVariables();
        obj3.displayCounts();

    }
}
