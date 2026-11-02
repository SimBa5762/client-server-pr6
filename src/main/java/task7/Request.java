package task7;

// Клас для представлення заявки
class Request {
    private int id;
    private String title;
    private int priority;

    public Request(int id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | Назва: " + title
                + " | Пріоритет: " + priority;
    }
}