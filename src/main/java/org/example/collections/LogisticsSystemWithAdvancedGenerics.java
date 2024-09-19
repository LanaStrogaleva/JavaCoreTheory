package org.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс <b>LogisticsSystemWithAdvancedGenerics</b> представляет собой сложный пример использования дженериков в Java.
 * В этом классе моделируется логистическая система, в которой создаются отправления (Shipment), параметризованные различными типами содержимого.
 *
 * <p>Пример включает три вида отправлений: DocumentShipment, PerishableShipment и ElectronicShipment, каждый из которых имеет свои уникальные свойства.
 * Для каждого типа отправления создается свой экземпляр класса Shipment, параметризованный соответствующим типом содержимого.</p>
 *
 * <p>Класс ShipmentProcessor использует дженерики для обработки различных видов отправлений через единый интерфейс.
 * Это демонстрирует гибкость дженериков в создании универсальных методов и классов, способных работать с разнообразными типами данных.</p>
 *
 * <p>Данный пример иллюстрирует применение дженериков для моделирования реальных систем и обработки сложных структур данных,
 * обеспечивая типобезопасность и гибкость в проектировании программного обеспечения.</p>
 */
// Интерфейс для описания общих свойств отправлений
interface Shipment<T> {
    T getContent();
}

// Реализация отправлений для документов
class DocumentShipment implements Shipment<Document> {
    private Document document;

    public DocumentShipment(Document document) {
        this.document = document;
    }

    @Override
    public Document getContent() {
        return document;
    }

    @Override
    public String toString() {
        return "DocumentShipment: " + document;
    }
}

// Реализация отправлений для товаров с ограниченным сроком годности
class PerishableShipment implements Shipment<Perishable> {
    private Perishable perishable;

    public PerishableShipment(Perishable perishable) {
        this.perishable = perishable;
    }

    @Override
    public Perishable getContent() {
        return perishable;
    }

    @Override
    public String toString() {
        return "PerishableShipment: " + perishable;
    }
}

// Реализация отправлений для электроники
class ElectronicShipment implements Shipment<Electronic> {
    private Electronic electronic;

    public ElectronicShipment(Electronic electronic) {
        this.electronic = electronic;
    }

    @Override
    public Electronic getContent() {
        return electronic;
    }

    @Override
    public String toString() {
        return "ElectronicShipment: " + electronic;
    }
}

// Класс для обработки отправлений
class ShipmentProcessor<T> {
    private List<Shipment<T>> shipments = new ArrayList<>();

    public void addShipment(Shipment<T> shipment) {
        shipments.add(shipment);
    }

    public void processAll() {
        for (Shipment<T> shipment : shipments) {
            System.out.println("Processing: " + shipment);
        }
    }
}

// Классы для представления содержимого отправлений
class Document {
    private String title;

    public Document(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document[Title=" + title + "]";
    }
}

class Perishable {
    private String itemName;
    private String expiryDate;

    public Perishable(String itemName, String expiryDate) {
        this.itemName = itemName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Perishable[Item=" + itemName + ", ExpiryDate=" + expiryDate + "]";
    }
}

class Electronic {
    private String model;
    private String serialNumber;

    public Electronic(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Electronic[Model=" + model + ", SerialNumber=" + serialNumber + "]";
    }
}

// Основной класс для запуска примера
public class LogisticsSystemWithAdvancedGenerics {
    public static void main(String[] args) {
        // Создание экземпляров различных типов отправлений
        Document doc = new Document("Confidential Report");
        Perishable perishableItem = new Perishable("Milk", "2024-09-30");
        Electronic electronicItem = new Electronic("Smartphone", "SN123456789");

        // Создание обработчиков для каждого типа отправлений
        ShipmentProcessor<Document> documentProcessor = new ShipmentProcessor<>();
        ShipmentProcessor<Perishable> perishableProcessor = new ShipmentProcessor<>();
        ShipmentProcessor<Electronic> electronicProcessor = new ShipmentProcessor<>();

        // Добавление отправлений в обработчики
        documentProcessor.addShipment(new DocumentShipment(doc));
        perishableProcessor.addShipment(new PerishableShipment(perishableItem));
        electronicProcessor.addShipment(new ElectronicShipment(electronicItem));

        // Обработка всех отправлений
        documentProcessor.processAll();
        perishableProcessor.processAll();
        electronicProcessor.processAll();
    }
}
