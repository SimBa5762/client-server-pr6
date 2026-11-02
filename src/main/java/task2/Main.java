package task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Додавання однакових початкових даних
        arrayList.add("Java");
        arrayList.add("Python");

        linkedList.add("Java");
        linkedList.add("Python");

        // add() - додавання елемента за індексом
        arrayList.add(1, "C++");
        linkedList.add(1, "C++");

        // addFirst() та addLast()
        linkedList.addFirst("C#");
        linkedList.addLast("Ruby");

        // Для ArrayList використовуються еквіваленти через індекси
        arrayList.add(0, "C#");
        arrayList.add("Ruby");

        // get() - отримання елемента
        System.out.println("ArrayList елемент [2]: " + arrayList.get(2));
        System.out.println("LinkedList елемент [2]: " + linkedList.get(2));

        // remove() - видалення елемента
        arrayList.remove("Python");
        linkedList.remove("Python");

        // Виведення списків після змін
        System.out.println("Фінальний ArrayList: " + arrayList);
        System.out.println("Фінальний LinkedList: " + linkedList);

    }
}
