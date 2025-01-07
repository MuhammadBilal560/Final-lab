package finallab;

class Product {
    private String barcode;
    private String name;
    private double price;
    private String storeLocation;

    public Product(String barcode, String name, double price, String storeLocation) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.storeLocation = storeLocation;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getStoreLocation() {
        return storeLocation;
    }
}
