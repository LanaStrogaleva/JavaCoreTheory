package org.example.collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
/**
 * Класс <b>CircularArray&lt;T&gt;</b> представляет собой пример реализации кастомной коллекции с использованием дженериков.
 * Эта коллекция имеет особенность в том, что итерация по ней происходит бесконечно, при условии, что внутренний массив не пустой.
 * Таким образом, метод hasNext всегда возвращает true, если коллекция содержит элементы. Для ограничения итерации
 * по такой коллекции необходимо использовать внешний счётчик.
 *
 * <p>Класс параметризован типом &lt;T&gt, что позволяет использовать его с любыми типами данных.
 * Это демонстрирует применение дженериков на уровне классов и методов, обеспечивая гибкость и повторное использование кода.</p>
 *
 * <p>Во время написания кода тип данных, с которым будет создаваться коллекция, неизвестен.
 * Тип определяется в клиентском коде при создании экземпляра коллекции, и Java корректно обрабатывает его во время выполнения.</p>
 *
 * <p>Класс включает внутренний класс CircularArrayIterator, который реализует интерфейс Iterator&lt;T&gt;
 * для обеспечения функциональности итерации. Это делает CircularArray совместимым с циклами for-each и
 * другими стандартными механизмами итерации в Java.</p>
 *
 * <p>Пример использования в классе DemoForCustomIterable иллюстрирует создание и итерацию по CircularArray
 * с использованием внешнего счётчика для ограничения количества итераций.</p>
 *
 * @param <T> Тип элементов, хранящихся в коллекции.
 */
public class CircularArray<T> implements Iterable<T> {
    private T[] array;
    private int size;

    // Конструктор класса CircularArray
    public CircularArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    // Метод для добавления элемента в массив -Этот метод позволяет добавить новый элемент в массив.
    // Если массив заполнен, он не позволит добавить больше элементов.
    public void add(T element) {
        if (size == array.length) {
            throw new IllegalStateException("Array is full");
        }
        array[size++] = element;
    }

    // Метод для получения элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }

    // Возвращаем итератор для циклического обхода массива
    @Override
    public Iterator<T> iterator() {
        return new CircularArrayIterator();
    }

    // Внутренний класс для итерации по CircularArray
    private class CircularArrayIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return size > 0;  // hasNext всегда возвращает true, если массив не пуст
        }

        @Override
        public T next() {
            if (size == 0) {
                throw new NoSuchElementException();
            }
            T element = array[currentIndex];
            currentIndex = (currentIndex + 1) % size;  // Циклическое перемещение по массиву
            return element;
        }
    }

    // Реализация метода forEach из интерфейса Iterable
    @Override
    public void forEach(Consumer<? super T> action) {
        for (T element : this) {
            action.accept(element);
        }
    }

    // Реализация метода spliterator из интерфейса Iterable
    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    // Демонстрационный класс для использования CircularArray
    public static class DemoForCustomIterable {
        public static void main(String[] args) {
            // Создаем экземпляр CircularArray для строк
            CircularArray<String> circularArray = new CircularArray<>(5);
            circularArray.add("apple");
            circularArray.add("banana");
            circularArray.add("cherry");

            // Внешний счётчик для ограничения итераций
            int iterationLimit = 10;
            int counter = 0;

            // Итерируем по circularArray с ограничением на количество итераций
            for (String fruit : circularArray) {
                if (counter >= iterationLimit) break;
                System.out.println(fruit);
                counter++;
            }
        }
    }
}
