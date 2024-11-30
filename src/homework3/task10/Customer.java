package homework3.task10;

import java.util.ArrayList;

public class Customer extends User {

    private ArrayList<Product> cart;

    public Customer(int id, String name, String email) {
        super(id, name, email);
        this.cart = new ArrayList<Product>();
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void addToCart(Product product) {
        this.cart.add(product);
    }
}
