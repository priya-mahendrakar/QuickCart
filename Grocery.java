public class Grocery extends Product {
    double weight;

    public Grocery(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Grocery: " + name + " | Price: " + price + " | Weight: " + weight + "kg");
    }
}
