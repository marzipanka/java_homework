package homework3.task10;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> productList;
    private double totalPrice;

    public Order(int orderId, Customer customer, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.totalPrice = countTotalPrice(productList);
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", productList=" + productList +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public double countTotalPrice(ArrayList<Product> productList) {
        double totalPrice = 0;
        for (Product product : productList
        ) {
            product.applyDiscount();
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
