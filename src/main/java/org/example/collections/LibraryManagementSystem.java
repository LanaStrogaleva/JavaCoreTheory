package org.example.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс <b>LibraryManagementSystem</b> реализует систему управления библиотекой. Он использует Map для организации хранения и управления книгами.
 * В Map ключом является ISBN книги, а значением - объект книги. Класс предлагает функциональность для добавления, обновления, проверки наличия и удаления книг.
 * Также предусмотрен метод для отображения списка всех книг в библиотеке.
 *
 * <p>Примеры использования класса включают добавление новых книг, обновление информации о существующих книгах,
 * проверку наличия книги по её ISBN и удаление книг из системы. Метод printBooks позволяет выводить информацию о всех книгах в библиотеке.</p>
 *
 * <p>Этот класс демонстрирует практическое применение коллекций в Java, особенно использование Map для создания
 * структурированных и эффективных систем управления данными в приложениях.</p>
 */
public class LibraryManagementSystem {
    // Хранение книг в Map, где ключом является ISBN, а значением - объект книги
    private Map<String, Book> books;

    // Конструктор инициализирует пустую коллекцию для книг
    public LibraryManagementSystem() {
        books = new HashMap<>();
    }

    // Метод для добавления новой книги в библиотеку
    public void addBook(Book book) {
        if (book != null && book.getIsbn() != null) {
            books.put(book.getIsbn(), book);
            System.out.println("Book added: " + book);
        } else {
            System.out.println("Invalid book or ISBN.");
        }
    }

    // Метод для обновления информации о книге
    public void updateBook(String isbn, Book updatedBook) {
        if (isbn != null && updatedBook != null && books.containsKey(isbn)) {
            books.put(isbn, updatedBook);
            System.out.println("Book updated: " + updatedBook);
        } else {
            System.out.println("Book with ISBN " + isbn + " does not exist.");
        }
    }

    // Метод для проверки наличия книги по её ISBN
    public boolean hasBook(String isbn) {
        return books.containsKey(isbn);
    }

    // Метод для удаления книги из системы
    public void removeBook(String isbn) {
        if (books.remove(isbn) != null) {
            System.out.println("Book removed with ISBN: " + isbn);
        } else {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    // Метод для отображения всех книг в библиотеке
    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    // Вложенный класс Book для хранения информации о книге
    public static class Book {
        private String isbn;
        private String title;
        private String author;

        public Book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book[ISBN=" + isbn + ", Title=" + title + ", Author=" + author + "]";
        }
    }

    public static void main(String[] args) {
        // Пример использования LibraryManagementSystem
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Создание новых книг
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        Book book2 = new Book("978-1-40-289462-6", "Advanced Java", "Jane Smith");

        // Добавление книг в библиотеку
        library.addBook(book1);
        library.addBook(book2);

        // Проверка наличия книги
        System.out.println("Has '978-3-16-148410-0': " + library.hasBook("978-3-16-148410-0"));

        // Обновление книги
        Book updatedBook = new Book("978-3-16-148410-0", "Java Programming Updated", "John Doe");
        library.updateBook("978-3-16-148410-0", updatedBook);

        // Удаление книги
        library.removeBook("978-1-40-289462-6");

        // Печать всех книг в библиотеке
        library.printBooks();
    }
}
