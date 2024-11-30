package homework3.task9;

//Задача 9: Библиотека
//        Описание задачи:
//        Создайте класс Book, который будет представлять книгу в библиотеке. Класс должен иметь следующие свойства:
//        Название книги (title) — строка.
//        Автор книги (author) — строка.
//        Год издания (yearPublished) — целое число.
//        Статус книги (isAvailable) — логическое значение (доступна или нет).
//        Класс должен содержать следующие методы:
//        Конструктор, который инициализирует все поля.
//        Метод borrowBook(), который помечает книгу как недоступную.
//        Метод returnBook(), который помечает книгу как доступную.
//        Метод getBookInfo(), который возвращает строку с информацией о книге (например: "Название: Название книги, Автор: Автор книги, Год издания: 2020, Доступна: true").
//        Дополнительное задание:
//        Создайте класс Library, который будет управлять несколькими книгами. Реализуйте методы:
//        Добавление книги в библиотеку.
//        Поиск книги по названию.
//        Вывод всех доступных книг.

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book richDadPoorDad = new Book("Rich dad poor dad", "Robert Kiyosaki", 2010);
        library.addBook(richDadPoorDad);
        library.addBook(new Book("How to become rich", "Tom Smith", 1995));
        library.addBook(new Book("War and peace", "Tolstoy", 1950));
        library.addBook(new Book("Mathematics", "Ivan Ivanov", 2008));

        library.findBooksByName("rich");
        library.borrowBook(richDadPoorDad);
        library.getAllBooks();
        library.returnBook(richDadPoorDad);
        library.getAllBooks();
    }
}
