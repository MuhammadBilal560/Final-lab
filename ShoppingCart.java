package finallab;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " has been added to your cart.");
    }

    public void viewCart() {
        System.out.println("Your Shopping Cart:");
        for (Product item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
