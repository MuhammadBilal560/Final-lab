package finallab;

import java.util.HashMap;
import java.util.Map;

public class ScanAndFindCheapestDemo {
    public static void main(String[] args) {
        // Create some products with barcodes available in different stores
        Map<String, Product[]> productCatalog = new HashMap<>();
        
        productCatalog.put("123456", new Product[]{
            new Product("123456", "Apple", 0.99, "Store A"),
            new Product("123456", "Apple", 0.89, "Store B"),
            new Product("123456", "Apple", 1.05, "Store C")
        });

        productCatalog.put("234567", new Product[]{
            new Product("234567", "Bread", 2.49, "Store A"),
            new Product("234567", "Bread", 2.29, "Store B"),
            new Product("234567", "Bread", 2.59, "Store C")
        });

        ShoppingCart cart = new ShoppingCart();

        // Simulate scanning products by barcode
        String scannedBarcode = "123456"; // Example scanned barcode
        if (productCatalog.containsKey(scannedBarcode)) {
            Product[] products = productCatalog.get(scannedBarcode);
            Product cheapestProduct = findCheapestProduct(products);
            System.out.println("Cheapest option for " + cheapestProduct.getName() + ": $" + cheapestProduct.getPrice() + " at " + cheapestProduct.getStoreLocation());
            cart.addProduct(cheapestProduct);
        } else {
            System.out.println("Product not found for barcode: " + scannedBarcode);
        }

        // Simulate another scan
        scannedBarcode = "234567"; // Another example scanned barcode
        if (productCatalog.containsKey(scannedBarcode)) {
            Product[] products = productCatalog.get(scannedBarcode);
            Product cheapestProduct = findCheapestProduct(products);
            System.out.println("Cheapest option for " + cheapestProduct.getName() + ": $" + cheapestProduct.getPrice() + " at " + cheapestProduct.getStoreLocation());
            cart.addProduct(cheapestProduct);
        } else {
            System.out.println("Product not found for barcode: " + scannedBarcode);
        }

        // View the cart and calculate total
        cart.viewCart();
        double total = cart.calculateTotal();
        System.out.printf("Total Price: $%.2f%n", total);
    }

    private static Product findCheapestProduct(Product[] products) {
        Product cheapest = products[0];
        
        for (Product product : products) {
            if (product.getPrice() < cheapest.getPrice()) {
                cheapest = product;
            }
        }
        
        return cheapest;
    }
}
