package org.example.collections;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс <b>IterationExample</b> демонстрирует различные способы итерации по коллекциям в Java.
 * В примере показаны основные коллекции, такие как List, Set и Map, и различные методы их обхода.
 *
 * <p>Используя класс Iterator, демонстрируется традиционный способ итерации по элементам списка.
 * Этот метод является универсальным для всех типов коллекций и предоставляет возможность удаления элементов во время итерации.</p>
 *
 * <p>Расширенный for-цикл (Enhanced For Loop) показывает более современный и удобный способ обхода коллекций,
 * таких как Set, без необходимости явного использования итератора.</p>
 *
 * <p>Использование Stream API для итерации по Set и Map демонстрирует функциональный подход к обработке коллекций,
 * позволяя выполнять операции над элементами коллекции в декларативном стиле.</p>
 *
 * <p>При итерации по Map показаны способы обхода набора записей (Map.Entry), что позволяет работать как с ключами, так и со значениями.</p>
 *
 * <p>Пример является полезным ресурсом для понимания различных методов итерации по коллекциям в Java и их применения в зависимости от задачи.</p>
 */
public class IterationExample {

    public static void main(String[] args) {
        // Пример 1: Итерация по списку (List) с использованием Iterator
        List<String> stringList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        System.out.println("Iteration using Iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // Пример 2: Итерация по множеству (Set) с использованием расширенного for-цикла
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nIteration using Enhanced For Loop:");
        for (Integer number : numberSet) {
            System.out.println(number);
        }

        // Пример 3: Итерация по множеству (Set) с использованием Stream API
        System.out.println("\nIteration using Stream API:");
        numberSet.stream().forEach(System.out::println);

        // Пример 4: Итерация по карте (Map) с использованием цикла for и Map.Entry
        Map<Integer, String> idToNameMap = new HashMap<>();
        idToNameMap.put(1, "John");
        idToNameMap.put(2, "Alice");
        idToNameMap.put(3, "Bob");

        System.out.println("\nIteration over Map using Entry Set:");
        for (Map.Entry<Integer, String> entry : idToNameMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Пример 5: Итерация по карте (Map) с использованием Stream API
        System.out.println("\nIteration over Map using Stream API:");
        idToNameMap.entrySet()
                .stream()
                .forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue()));

        // Пример 6: Пример использования Stream API для фильтрации и сбора данных
        System.out.println("\nFilter and Collect using Stream API:");
        List<String> filteredList = stringList.stream()
                .filter(item -> item.startsWith("B"))  // Фильтрация элементов, начинающихся с 'B'
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);  // Вывод: Banana
    }
}
