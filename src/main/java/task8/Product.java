package task8;

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Гетери необхідні для доступу до полів з Comparator
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Перевизначаємо метод для зручного виведення
    @Override
    public String toString() {
        return name + " - " + price + " грн";
    }
}
