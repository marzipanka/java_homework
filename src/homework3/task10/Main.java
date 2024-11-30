package homework3.task10;

//Задача 10: Система управления заказами в интернет-магазине
//        Описание:
//        Создайте объектно-ориентированную модель для системы управления заказами. Включите следующие ключевые аспекты:
//        Абстракция:
//        Реализуйте общую структуру для всех типов товаров и пользователей.
//        Наследование:
//        Разные типы товаров (например, электроника, одежда) и пользователей (например, клиент, администратор).
//        Полиморфизм:
//        Используйте общий интерфейс для обработки платежей и скидок.
//        Инкапсуляция:
//        Скройте детали реализации полей классов, предоставьте доступ через методы.
//        Дополнительно:
//        Реализуйте интерфейс для работы с базой данных заказов, используя HashMap.
//
//        Требования:
//        Класс User:
//        Поля: id, name, email.
//        Методы: геттеры/сеттеры, displayUserInfo().
//        Подклассы Customer и Admin:
//        Customer: добавляет поле cart (корзина), метод для добавления товара в корзину.
//        Admin: добавляет метод для изменения цены товара.
//        Класс Product:
//        Поля: id, name, price.
//        Абстрактный метод applyDiscount().
//        Подклассы Electronics и Clothing:
//        Electronics: скидка 10% при покупке свыше $100.
//        Clothing: скидка 15% при покупке свыше $50.
//        Класс Order:
//        Поля: orderId, customer, productList, totalPrice.
//        Метод для расчета общей стоимости заказа.
//        Интерфейс DatabaseOperations:
//        Методы: saveOrder(Order order) и getOrder(int orderId).
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Andrew", "andrew@test.com");
        Admin admin = new Admin(2, "Admin", "admin@test.com");

        Product product1 = new Electronics(1, "Laptop", 500);
        Product product2 = new Clothing(2, "Dress", 60);
        Product product3 = new Electronics(3, "Phone", 80);

        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        System.out.println("User information: ");
        customer.displayUserInfo();
        System.out.println("Cart items:");
        for (Product product :
                customer.getCart()) {
            System.out.println(product.toString());
        }

        Order order = new Order(1, customer, customer.getCart());

        Database database = new Database();
        database.saveOrder(order);

        Order retrievedOrder = database.getOrder(order.getOrderId());
        System.out.println(retrievedOrder.toString());
    }
}
