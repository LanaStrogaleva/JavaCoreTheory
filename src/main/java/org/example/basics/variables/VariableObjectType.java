package org.example.basics.variables;
/**
 * <p>Класс <b>VariableObjectType</b> служит примером создания ссылочных типов данных в Java.
 * Демонстрация осуществляется в контексте классов Student и Group, где Student является пользовательским
 * классом, а Group содержит массив объектов Student.</p>
 *
 * <p>В этом примере основное внимание уделяется тому, как создаются и используются объекты пользовательских классов.
 * Показано, как инициализируются и присваиваются значения полям объектов. Это демонстрирует базовые принципы
 * работы с ссылочными типами данных, в отличие от примитивных типов.</p>
 *
 * <p>Класс также иллюстрирует концепцию агрегации, где один класс (Group) содержит массив объектов другого класса (Student).
 * Это подчеркивает различия между примитивными и ссылочными типами данных и основы их использования,
 * даже вне контекста полноценного объектно-ориентированного программирования.</p>
 *
 * <p>Пример полезен для понимания основ создания и работы со ссылочными типами данных, их инициализации и управления
 * в рамках программ на Java.</p>
 */
public class VariableObjectType {
    // Класс Student представляет собой пользовательский класс с полями для имени и возраста
    static class Student {
        private String name;
        private int age;

        // Конструктор класса Student
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Метод для отображения информации о студенте
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Класс Group содержит массив объектов Student и методы для работы с ними
    class Group {
        private Student[] students;
        private int count;

        // Конструктор класса Group
        public Group(int size) {
            students = new Student[size];
            count = 0;
        }

        // Метод для добавления студента в группу
        public void addStudent(Student student) {
            if (count < students.length) {
                students[count] = student;
                count++;
            } else {
                System.out.println("Group is full, cannot add more students.");
            }
        }

        // Метод для отображения информации обо всех студентах в группе
        public void displayAllStudents() {
            for (int i = 0; i < count; i++) {
                students[i].displayInfo();
                System.out.println(); // Добавляем пустую строку для разделения информации о студентах
            }
        }
    }
    public static void main(String[] args) {
        // здесь еще показан пример создания объекта нестатического класса Group - сначала нужно создать объект класса VariableObjectType
        VariableObjectType variableObjectType = new VariableObjectType();
        // Создаем группу студентов с размером 3
        Group group = variableObjectType.new Group(3);

        // Создаем несколько студентов - здесь еще показан пример создания объекта статического класса Student - не нужно создавать объект класса VariableObjectType
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Student student3 = new Student("Charlie", 21);

        // Добавляем студентов в группу
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        // Отображаем информацию обо всех студентах в группе
        group.displayAllStudents();
    }
}
