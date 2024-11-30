package homework3.task10;

public class Electronics extends Product {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 100) {
            this.setPrice(this.getPrice() * 0.9);
        }
    }
}
