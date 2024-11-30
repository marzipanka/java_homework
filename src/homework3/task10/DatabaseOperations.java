package homework3.task10;

public interface DatabaseOperations {
    void saveOrder(Order order);

    Order getOrder(int orderId);
}
