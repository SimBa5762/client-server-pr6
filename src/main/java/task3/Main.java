package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println(numbers);
        System.out.print(uniqueNumbers);

    }
}
