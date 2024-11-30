package homework3.task9;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void findBooksByName(String name) {
        System.out.println("\nПоиск книг по названию " + name);
        for (Book book :
                books) {
            if (book.getTitle().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(book.getBookInfo());
            }
        }
    }

    public void borrowBook(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }

    public void getAllBooks() {
        System.out.println("\nВсе доступные книги:");
        for (Book book :
                books) {
            if (book.isBookAvailable()) {
                System.out.println(book.getBookInfo());
            }
        }
    }
}
