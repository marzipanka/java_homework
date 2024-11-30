package homework3.task8;

//Задача 8: Банковский счет и принципы ООП
//        Описание:
//        Создайте приложение для управления банковскими счетами, которое включает следующие классы:
//        Абстрактный класс BankAccount:
//        Поля: accountNumber (номер счета), balance (баланс).
//        Методы:
//        Абстрактный метод calculateInterest().
//        Реализация метода deposit(double amount) для пополнения счета.
//        Реализация метода withdraw(double amount) с проверкой на достаточность средств.
//        Класс SavingsAccount:
//        Наследуется от BankAccount.
//        Реализует метод calculateInterest(), добавляя 5% годовых к балансу.
//        Класс CheckingAccount:
//        Наследуется от BankAccount.
//        Реализует метод calculateInterest() без начисления процентов.
//        Инкапсуляция:
//        Поля accountNumber и balance должны быть приватными, с геттерами и сеттерами.
//        Полиморфизм:
//        Используйте массив объектов BankAccount, чтобы показать работу методов для разных типов счетов.
public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = {new CheckingAccount(1), new SavingsAccount(2)};
        for (BankAccount account : accounts
        ) {
            System.out.println(account.getAccountNumber());
            account.deposit(1000);
            System.out.println(account.calculateInterest());
            account.withdraw(1200);
            System.out.println(account.getBalance());
            account.withdraw(500);
            System.out.println(account.getBalance());
        }
    }
}
