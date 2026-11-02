package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {50, 10, 40, 20, 30, 10, 20};

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : numbers) {
            hashSet.add(num);
            linkedHashSet.add(num);
            treeSet.add(num);
        }

        System.out.println("HashSet:       " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet:       " + treeSet);
    }
}
