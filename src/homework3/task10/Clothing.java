package homework3.task10;

public class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 50) {
            this.setPrice(this.getPrice() * 0.85);
        }
    }
}
