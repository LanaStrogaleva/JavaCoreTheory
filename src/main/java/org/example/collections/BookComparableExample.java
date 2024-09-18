package org.example.collections;
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
public class BookComparableExample implements Comparable<BookComparableExample>{
    @Override
    public int compareTo(BookComparableExample o) {
        return 0;
    }
}
