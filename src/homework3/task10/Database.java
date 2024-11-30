package homework3.task10;

import java.util.HashMap;

public class Database implements DatabaseOperations {
    private HashMap<Integer, Order> ordersDatabase;

    public Database() {
        this.ordersDatabase = new HashMap<Integer, Order>();
    }

    @Override
    public void saveOrder(Order order) {
        this.ordersDatabase.put(order.getOrderId(), order);
    }

    @Override
    public Order getOrder(int orderId) {
        return this.ordersDatabase.get(orderId);
    }
}
