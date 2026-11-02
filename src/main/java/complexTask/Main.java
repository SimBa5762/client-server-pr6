package complexTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Ініціалізація колекцій з використанням узагальнених типів (Generics)
        List<Book> booksList = new ArrayList<>();
        Set<String> authorsSet = new HashSet<>();
        Map<Integer, Book> bookMap = new HashMap<>();
        Queue<String> readersQueue = new LinkedList<>();

        // 2. ДОДАВАННЯ елементів
        System.out.println("--- 1. Додавання книг ---");
        Book b1 = new Book(101, "Тіні забутих предків", "М. Коцюбинський", 1911);
        Book b2 = new Book(102, "Тигролови", "І. Багряний", 1944);
        Book b3 = new Book(103, "Місто", "В. Підмогильний", 1928);
        Book b4 = new Book(104, "Сад Гетсиманський", "І. Багряний", 1950);
        Book b5 = new Book(105, "Кайдашева сім'я", "І. Нечуй-Левицький", 1878);

        Book[] initialBooks = {b1, b2, b3, b4, b5};
        for (Book book : initialBooks) {
            booksList.add(book);                 // Додаємо в List
            authorsSet.add(book.getAuthor());    // Додаємо в Set (дублікати ігноруються)
            bookMap.put(book.getId(), book);     // Додаємо в Map за ID
        }
        System.out.println("Книги успішно додані.");

        // 3. ПЕРЕБІР (ітерація) колекції
        System.out.println("\n--- 2. Весь список книг (перебір List) ---");
        for (Book book : booksList) {
            System.out.println(book);
        }

        System.out.println("\n--- 3. Множина унікальних авторів (перебір Set) ---");
        for (String author : authorsSet) {
            System.out.println("- " + author);
        }

        // 4. СОРТУВАННЯ книг за роком (зростання)
        System.out.println("\n--- 4. Сортування книг за роком видання ---");
        booksList.sort(Comparator.comparingInt(Book::getYear));
        booksList.forEach(System.out::println);

        // 5. ПОШУК книги за ID з використанням Map
        System.out.println("\n--- 5. Пошук книги за ID (Map) ---");
        int searchId = 103;
        Book foundBook = bookMap.get(searchId);
        System.out.println("Шукаємо ID " + searchId + ": " + (foundBook != null ? foundBook : "Не знайдено"));

        // 6. ПОШУК книг певного автора
        System.out.println("\n--- 6. Пошук книг автора 'І. Багряний' ---");
        String targetAuthor = "І. Багряний";
        for (Book book : booksList) {
            if (book.getAuthor().equals(targetAuthor)) {
                System.out.println(book);
            }
        }

        // 7. ПЕРЕВІРКА НАЯВНОСТІ автора
        System.out.println("\n--- 7. Перевірка наявності автора ---");
        String checkAuthor = "Л. Українка";
        boolean hasAuthor = authorsSet.contains(checkAuthor);
        System.out.println("Чи є автор '" + checkAuthor + "' в базі? " + (hasAuthor ? "Так" : "Ні"));

        // 8. ВИДАЛЕННЯ книги
        System.out.println("\n--- 8. Видалення книги з ID 101 ---");
        bookMap.remove(101);
        booksList.removeIf(book -> book.getId() == 101);
        System.out.println("Книга видалена. Поточна кількість книг у списку: " + booksList.size());

        // 9. РОБОТА З ЧЕРГОЮ читачів
        System.out.println("\n--- 9. Робота з чергою читачів (Queue) ---");
        readersQueue.offer("Олексій");
        readersQueue.offer("Марія");
        readersQueue.offer("Дмитро");
        System.out.println("Черга читачів: " + readersQueue);

        System.out.println("Обслуговується читач: " + readersQueue.poll()); // Вилучає першого
        System.out.println("Черга після обслуговування: " + readersQueue);
    }
}