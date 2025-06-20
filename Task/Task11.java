package Task;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor to initialize attributes
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "Author: " + author + 
               "\nYear Published: " + yearPublished + 
               "\nPrice: $" + price;
    }
}

public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:\n" + book1.toString() + "\n");

        System.out.println("Book 2:\n" + book2.toString() + "\n");

        System.out.println("Book 3:\n" + book3.toString() + "\n");

    }
}
