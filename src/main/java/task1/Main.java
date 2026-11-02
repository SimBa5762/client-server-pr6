package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>();

        // Додавання щонайменше 5 студентів
        students.add("Олександр");
        students.add("Марія");
        students.add("Іван");
        students.add("Олена");
        students.add("Андрій");

        // Виведення всього списку
        System.out.println("Весь список студентів: " + students);

        // Виведення першого студента
        System.out.println("Перший студент: " + students.get(0));

        // Виведення останнього студента
        System.out.println("Останній студент: " + students.get(students.size() - 1));

        // Виведення кількості студентів
        System.out.println("Кількість студентів: " + students.size());

        // Додання нового студента
        students.add("Наталія");
        System.out.println("Додано нового студента 'Наталія'.");

        // Видалення одного студента
        students.remove("Іван");
        System.out.println("Видалено студента 'Іван'.");

        // Перевірка наявність конкретного студента
        String searchName = "Марія";
        boolean isPresent = students.contains(searchName);
        System.out.println("Чи є '" + searchName + "' у списку? " + (isPresent ? "Так" : "Ні"));

        // Вивести список після змін
        System.out.println("Список після змін: " + students);
    }
}
