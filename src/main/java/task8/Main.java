package task8;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Ноутбук", 25000));
        products.add(new Product("Миша", 800));
        products.add(new Product("Монітор", 7500));
        products.add(new Product("Клавіатура", 1500));
        products.add(new Product("Килимок", 300));

        System.out.println("Початковий список:");
        products.forEach(System.out::println);

        // 1. Сортування за назвою (алфавітний порядок)
        products.sort(Comparator.comparing(Product::getName));
        System.out.println("\nСортування за назвою:");
        products.forEach(System.out::println);

        // 2. Сортування за ціною за зростанням
        products.sort(Comparator.comparingInt(Product::getPrice));
        System.out.println("\nСортування за ціною (зростання):");
        products.forEach(System.out::println);

        // 3. Сортування за ціною за спаданням
        products.sort(Comparator.comparingInt(Product::getPrice).reversed());
        System.out.println("\nСортування за ціною (спадання):");
        products.forEach(System.out::println);
    }
}
