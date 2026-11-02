package task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        contacts.put("380501112233", "Іван Петренко");
        contacts.put("380671234567", "Олена Коваленко");
        contacts.put("380931234567", "Андрій Шевченко");
        contacts.put("380991234567", "Марія Бондаренко");
        contacts.put("380631234567", "Олександр Мельник");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ТЕЛЕФОННИЙ ДОВІДНИК =====");
            System.out.println("1. Додати контакт");
            System.out.println("2. Пошук контакту за ім'ям");
            System.out.println("3. Видалити контакт");
            System.out.println("4. Перевірити наявність контакту");
            System.out.println("5. Вивести всі контакти");
            System.out.println("6. Пошук за ключем (номером)");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // Додавання контакту
                case 1:
                    System.out.print("Введіть номер телефону: ");
                    String phone = scanner.nextLine();

                    System.out.print("Введіть ім'я контакту: ");
                    String name = scanner.nextLine();

                    contacts.put(phone, name);
                    System.out.println("Контакт додано!");
                    break;

                // Пошук контакту за ім'ям
                case 2:
                    System.out.print("Введіть ім'я для пошуку: ");
                    String searchName = scanner.nextLine();

                    boolean found = false;

                    for (Map.Entry<String, String> entry : contacts.entrySet()) {
                        if (entry.getValue().equalsIgnoreCase(searchName)) {
                            System.out.println("Знайдено: "
                                    + entry.getValue()
                                    + " | Номер: "
                                    + entry.getKey());
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Контакт не знайдено.");
                    }
                    break;

                // Видалення контакту
                case 3:
                    System.out.print("Введіть номер телефону для видалення: ");
                    String deletePhone = scanner.nextLine();

                    if (contacts.remove(deletePhone) != null) {
                        System.out.println("Контакт видалено!");
                    } else {
                        System.out.println("Контакт не знайдено.");
                    }
                    break;

                // Перевірка наявності контакту
                case 4:
                    System.out.print("Введіть номер телефону: ");
                    String checkPhone = scanner.nextLine();

                    if (contacts.containsKey(checkPhone)) {
                        System.out.println("Контакт існує: "
                                + contacts.get(checkPhone));
                    } else {
                        System.out.println("Контакт відсутній.");
                    }
                    break;

                // Виведення всіх контактів
                case 5:
                    System.out.println("\nСписок контактів:");

                    if (contacts.isEmpty()) {
                        System.out.println("Довідник порожній.");
                    } else {
                        for (Map.Entry<String, String> entry : contacts.entrySet()) {
                            System.out.println("Номер: " + entry.getKey()
                                    + " | Ім'я: " + entry.getValue());
                        }
                    }
                    break;

                // Пошук за ключем
                case 6:
                    System.out.print("Введіть номер телефону: ");
                    String key = scanner.nextLine();

                    String result = contacts.get(key);

                    if (result != null) {
                        System.out.println("Знайдено контакт: " + result);
                    } else {
                        System.out.println("Контакт за таким номером не знайдено.");
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
