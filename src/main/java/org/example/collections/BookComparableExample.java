package org.example.collections;
import java.util.*;
/**
 * Класс <b>BookComparableExample</b> демонстрирует реализацию интерфейса Comparable и метода compareTo
 * для сравнения объектов класса BookComparableExample. Этот класс фокусируется на отличиях между интерфейсами
 * Comparable и Comparator в контексте сравнения объектов.
 *
 * <p>В отличие от Comparator, который реализуется и используется вне класса сравниваемых объектов и принимает
 * два объекта для сравнения, интерфейс Comparable реализуется в том классе, экземпляры которого будут сравниваться,
 * а метод compareTo вызывается на одном объекте, принимая в качестве параметра другой объект того же типа.</p>
 *
 * <p>В методе compareTo класса BookComparableExample сначала происходит сравнение по году публикации.
 * Если годы публикации равны, то сравнение выполняется по названию книги. Это позволяет реализовать упорядочивание
 * списка книг сначала по году публикации, а затем по алфавиту.</p>
 *
 * <p>Пример использования в классе DemoForComparable иллюстрирует сортировку списка объектов BookComparableExample
 * с помощью Collections.sort, демонстрируя, как работает Comparable в практическом контексте.</p>
 */
// Класс BookComparableExample реализует интерфейс Comparable для сортировки объектов Book по году публикации и названию
public class BookComparableExample implements Comparable<BookComparableExample> {
    private String title;
    private int publicationYear;

    // Конструктор класса BookComparableExample
    public BookComparableExample(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Метод сравнения объектов класса BookComparableExample
    @Override
    public int compareTo(BookComparableExample other) {
        // Сравнение по году публикации
        if (this.publicationYear != other.publicationYear) {
            return Integer.compare(this.publicationYear, other.publicationYear);
        }
        // Если годы публикации равны, сравниваем по названию
        return this.title.compareTo(other.title);
    }

    // Переопределяем метод toString() для удобного отображения информации о книге
    @Override
    public String toString() {
        return title + " (" + publicationYear + ")";
    }

    // Класс DemoForComparable для демонстрации работы Comparable
    public static void main(String[] args) {
        // Создаем список книг
        List<BookComparableExample> books = new ArrayList<>();
        books.add(new BookComparableExample("The Catcher in the Rye", 1951));
        books.add(new BookComparableExample("To Kill a Mockingbird", 1960));
        books.add(new BookComparableExample("1984", 1949));
        books.add(new BookComparableExample("The Great Gatsby", 1925));
        books.add(new BookComparableExample("Moby Dick", 1851));

        // Сортировка списка книг с использованием метода compareTo
        Collections.sort(books);

        // Вывод отсортированного списка книг
        System.out.println("Sorted Books:");
        for (BookComparableExample book : books) {
            System.out.println(book);
        }
    }
}
