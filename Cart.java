import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product p) {
        items.add(p);
        System.out.println(p.name + " added to cart.");
    }

    public void removeProduct(String name) {
        Iterator<Product> it = items.iterator();
        while (it.hasNext()) {
            Product p = it.next();
            if (p.name.equalsIgnoreCase(name)) {
                it.remove();
                System.out.println(p.name + " removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    public void showBill() {
        double total = 0;

        System.out.println("\n------ CART BILL ------");
        for (Product p : items) {
            p.displayInfo();   // Polymorphism in action
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}
