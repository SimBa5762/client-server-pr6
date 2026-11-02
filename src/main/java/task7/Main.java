package task7;


import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Створення черги з пріоритетом
        PriorityQueue<Request> requests = new PriorityQueue<>(
                Comparator.comparingInt(Request::getPriority)
                        .reversed()
                        .thenComparingInt(Request::getId)
        );

        // Додавання початкових заявок
        requests.offer(new Request(1, "Відновлення доступу", 2));
        requests.offer(new Request(2, "Помилка оплати", 5));
        requests.offer(new Request(3, "Оновлення даних", 1));
        requests.offer(new Request(4, "Технічна несправність", 4));
        requests.offer(new Request(5, "Консультація", 3));

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== СИСТЕМА ОБРОБКИ ЗАЯВОК =====");
            System.out.println("1. Додати заявку");
            System.out.println("2. Переглянути наступну заявку");
            System.out.println("3. Обробити заявку");
            System.out.println("4. Вивести всі заявки");
            System.out.println("5. Вивести кількість заявок");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // Додавання заявки
                case 1:
                    System.out.print("Введіть ID заявки: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    // Перевірка унікальності ID
                    boolean exists = requests.stream()
                            .anyMatch(r -> r.getId() == id);

                    if (exists) {
                        System.out.println("Заявка з таким ID вже існує!");
                        break;
                    }

                    System.out.print("Введіть назву заявки: ");
                    String title = scanner.nextLine();

                    System.out.print("Введіть пріоритет (1-5): ");
                    int priority = scanner.nextInt();
                    scanner.nextLine();

                    if (priority < 1 || priority > 5) {
                        System.out.println("Пріоритет повинен бути від 1 до 5!");
                        break;
                    }

                    requests.offer(new Request(id, title, priority));

                    System.out.println("Заявку додано!");
                    break;

                // Перегляд наступної заявки
                case 2:
                    Request nextRequest = requests.peek();

                    if (nextRequest != null) {
                        System.out.println("Наступна заявка:");
                        System.out.println(nextRequest);
                    } else {
                        System.out.println("Черга заявок порожня.");
                    }
                    break;

                // Обробка заявки
                case 3:
                    Request processedRequest = requests.poll();

                    if (processedRequest != null) {
                        System.out.println("Оброблено заявку:");
                        System.out.println(processedRequest);
                    } else {
                        System.out.println("Немає заявок для обробки.");
                    }
                    break;

                // Виведення всіх заявок за пріоритетом
                case 4:
                    if (requests.isEmpty()) {
                        System.out.println("Черга заявок порожня.");
                    } else {
                        System.out.println("\nСписок заявок за пріоритетом:");

                        // Створюємо копію, щоб не змінювати основну чергу
                        PriorityQueue<Request> temp =
                                new PriorityQueue<>(requests);

                        while (!temp.isEmpty()) {
                            System.out.println(temp.poll());
                        }
                    }
                    break;

                // Кількість заявок
                case 5:
                    System.out.println("Кількість заявок: "
                            + requests.size());
                    break;

                case 0:
                    System.out.println("Завершення роботи програми.");
                    break;

                default:
                    System.out.println("Неправильний вибір!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
