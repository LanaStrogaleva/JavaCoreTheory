package org.example.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Класс <b>EmployeeAgeNameComparator</b> представляет собой кастомную реализацию интерфейса Comparator для сравнения объектов типа Employee.
 * Основная цель - сравнивать сотрудников сначала по возрасту, а затем по имени в лексикографическом порядке.
 *
 * <p>В методе compare сначала происходит сравнение по возрасту с использованием Integer.compare. Если возраста сотрудников одинаковы,
 * то сравнение осуществляется по имени с помощью String.compareTo. Это позволяет упорядочивать список сотрудников по возрасту,
 * а затем по имени, если возраст одинаков.</p>
 *
 * <p>В отличие от интерфейса Comparable, который реализуется в классе объектов, подлежащих сравнению и вызывается на одном объекте
 * (при этом другой объект передается как параметр), интерфейс Comparator реализуется отдельно и может быть применен к любым объектам,
 * предоставляя более гибкий подход к сравнению.</p>
 *
 * <p>Пример использования в классе DemoForComparator иллюстрирует сортировку списка объектов Employee с использованием
 * EmployeeAgeNameComparator, демонстрируя практическое применение Comparator.</p>
 *
 * <p>public class EmployeeAgeNameComparator implements Comparator<Employee> {}</p>
 */
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

public class EmployeeAgeNameComparator implements Comparator<Employee> {

    // Метод для сравнения объектов Employee
    @Override
    public int compare(Employee e1, Employee e2) {
        // Сначала сравниваем по возрасту
        int ageComparison = Integer.compare(e1.getAge(), e2.getAge());

        // Если возраст одинаков, сравниваем по имени
        if (ageComparison == 0) {
            return e1.getName().compareTo(e2.getName());
        }

        // Если возраст не одинаков, возвращаем результат сравнения возраста
        return ageComparison;
    }

    public static class DemoForComparator {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Alice", 30));
            employees.add(new Employee("Bob", 25));
            employees.add(new Employee("Charlie", 30));
            employees.add(new Employee("Dave", 25));

            // Сортируем список сотрудников с помощью нашего компаратора
            employees.sort(new EmployeeAgeNameComparator());

            // Выводим отсортированный список
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}
