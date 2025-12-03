public class Electronics extends Product {
    int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + name + " | Price: " + price + " | Warranty: " + warrantyYears + " years");
    }
}
