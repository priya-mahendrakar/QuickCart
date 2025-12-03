QuickCart 🛒
QuickCart is a simple console-based online shopping cart simulation built in Java.
It demonstrates Object-Oriented Programming (OOP) concepts such as classes, inheritance, polymorphism, and encapsulation in a small interactive project.

Features ✨
Add products to the shopping cart

Remove products from the cart

View a detailed bill with all items and total amount

Supports multiple product types:
Electronics (with warranty)
Clothing (with size)
Grocery (with weight)
Polymorphism: product display is customized for each product type

Technologies Used 🛠️
Java 11+

OOP Concepts: Classes, Objects, Inheritance, Polymorphism, Encapsulation

Collections: ArrayList to store products in the cart

Console-based User Interface

Project Structure 📁
QuickCart/
├─ Main.java        # Entry point of the program
├─ Product.java     # Base class for all products
├─ Electronics.java # Electronics product type
├─ Clothing.java    # Clothing product type
├─ Grocery.java     # Grocery product type
├─ Cart.java        # Handles adding/removing products and billing
└─ User.java        # Simple user class

====== How to Run ? =====
Navigate to the project folder:
cd path/to/QuickCart
Compile all Java files:
javac *.java
Run the program:
java Main


Follow the menu to add/remove products or view the bill.

Sample Output 🖥️
--- Shopping Cart Menu ---
1. Add Product
2. Remove Product
3. Show Bill
4. Exit

Enter choice: 1
Choose Product Type:
1. Electronics
2. Clothing
3. Grocery
Enter name: Laptop
Enter price: 50000
Warranty (years): 2
Laptop added to cart.

OOP Concepts Demonstrated 🏷️

Encapsulation: Product attributes are kept inside classes

Inheritance: Electronics, Clothing, and Grocery inherit from Product

Polymorphism: displayInfo() behaves differently for each product type

Composition: Cart contains multiple Product objects