package homework3.task9;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBookAvailable() {
        return this.isAvailable;
    }

    public void borrowBook() {
        this.isAvailable = false;
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public String getBookInfo() {
        return "Название: " + this.title + ", Автор: " + this.author + ", Год издания: " + this.yearPublished + ", Доступна: " + this.isAvailable;
    }

}
