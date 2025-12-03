import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User("Priya");
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Show Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Choose Product Type:");
                    System.out.println("1. Electronics");
                    System.out.println("2. Clothing");
                    System.out.println("3. Grocery");
                    int type;
                    try {
                        type = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                        continue;
                    }

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price;
                    try {
                        price = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price.");
                        continue;
                    }

                    if (type == 1) {
                        System.out.print("Warranty (years): ");
                        int w;
                        try {
                            w = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid warranty.");
                            continue;
                        }
                        cart.addProduct(new Electronics(name, price, w));

                    } else if (type == 2) {
                        System.out.print("Size: ");
                        String size = sc.nextLine();
                        cart.addProduct(new Clothing(name, price, size));

                    } else if (type == 3) {
                        System.out.print("Weight (kg): ");
                        double wt;
                        try {
                            wt = Double.parseDouble(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid weight.");
                            continue;
                        }
                        cart.addProduct(new Grocery(name, price, wt));
                    } else {
                        System.out.println("Invalid product type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String remove = sc.nextLine();
                    cart.removeProduct(remove);
                    break;

                case 3:
                    cart.showBill();
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
