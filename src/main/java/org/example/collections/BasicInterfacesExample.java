package org.example.collections;

import java.util.*;

/**
 * Класс <b>BasicInterfacesExample</b> демонстрирует создание и использование базовых коллекций в Java,
 * включая List, Set, Map и Queue. Каждая коллекция инициализируется и в ней осуществляется базовое действие,
 * такое как добавление элемента.
 *
 * <p>В примере также представлена реализация кастомного компаратора (MyComparator), который используется
 * для сортировки элементов списка. Компаратор демонстрирует принцип работы интерфейса Comparator в Java,
 * позволяя задать пользовательский порядок сортировки для объектов.</p>
 *
 * <p>Этот класс иллюстрирует основные концепции и методы работы с различными типами коллекций в Java.
 * Он служит введением в более сложные темы, связанные с обработкой и управлением наборами данных в
 * объектно-ориентированном программировании.</p>
 *
 * <p>Примеры коллекций и использование кастомного компаратора являются полезными для понимания основ работы с
 * коллекциями и их применения в различных сценариях программирования.</p>
 */
public class BasicInterfacesExample {
    // Кастомный компаратор для сортировки строк по их длине
    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }

    public static void main(String[] args) {
        // Пример работы с List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("kiwi");
        list.add("orange");
        list.add("banana"); // Добавляем дубликат

        // Использование кастомного компаратора для сортировки списка по длине строки
        Collections.sort(list, new MyComparator());
        System.out.println("Sorted List by length: " + list);

        // Пример работы с Set
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("kiwi");
        set.add("orange");
        set.add("banana"); // Попытка добавить дубликат, который не будет добавлен

        System.out.println("Set (no duplicates): " + set);

        // Пример работы с Map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("kiwi", 3);
        map.put("orange", 4);

        System.out.println("Map (key-value pairs): " + map);

        // Пример работы с Queue Элементы добавляются в конец и извлекаются из начала (FIFO — First In, First Out).
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("kiwi");
        queue.add("orange");

        System.out.println("Queue (FIFO): " + queue);

        // Удаляем первый элемент из очереди
        String firstElement = queue.poll();
        System.out.println("Polled element from Queue: " + firstElement);
        System.out.println("Queue after poll: " + queue);
    }
}
