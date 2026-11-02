package task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Додавання початкових клієнтів
        queue.offer("Іван Петренко");
        queue.offer("Олена Коваленко");
        queue.offer("Андрій Шевченко");
        queue.offer("Марія Бондаренко");
        queue.offer("Олександр Мельник");

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== СИСТЕМА ОБСЛУГОВУВАННЯ КЛІЄНТІВ =====");
            System.out.println("1. Додати клієнта в чергу");
            System.out.println("2. Переглянути першого клієнта");
            System.out.println("3. Обслужити першого клієнта");
            System.out.println("4. Вивести кількість клієнтів");
            System.out.println("5. Вивести всю чергу");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // Додавання клієнта
                case 1:
                    System.out.print("Введіть ім'я клієнта: ");
                    String name = scanner.nextLine();

                    queue.offer(name);

                    System.out.println("Клієнта додано до черги!");
                    break;

                // Перегляд першого клієнта
                case 2:
                    String firstClient = queue.peek();

                    if (firstClient != null) {
                        System.out.println("Перший клієнт у черзі: "
                                + firstClient);
                    } else {
                        System.out.println("Черга порожня.");
                    }
                    break;

                // Обслуговування першого клієнта
                case 3:
                    String servedClient = queue.poll();

                    if (servedClient != null) {
                        System.out.println("Обслуговано клієнта: "
                                + servedClient);
                    } else {
                        System.out.println("Немає клієнтів для обслуговування.");
                    }
                    break;

                // Кількість клієнтів у черзі
                case 4:
                    System.out.println("Кількість клієнтів у черзі: "
                            + queue.size());
                    break;

                // Виведення всієї черги
                case 5:
                    System.out.println("\nПоточна черга клієнтів:");

                    if (queue.isEmpty()) {
                        System.out.println("Черга порожня.");
                    } else {
                        int number = 1;

                        for (String client : queue) {
                            System.out.println(number + ". " + client);
                            number++;
                        }
                    }
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
