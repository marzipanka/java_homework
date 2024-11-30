package homework3.task10;

public class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void editPrice(Product product, double newPrice) {
        product.setPrice(newPrice);
    }
}
