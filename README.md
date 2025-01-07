# Final-lab
# Shopping Assistance Application

## Overview
This Java application simulates a shopping assistance system that allows users to scan products using barcodes and find the cheapest options available in nearby stores. It includes functionalities for managing a shopping cart, viewing items, and calculating total prices.

## Features
- **Product Scanning**: Simulate scanning products using barcodes.
- **Cheapest Product Finder**: Automatically finds the cheapest product available in nearby stores.
- **Shopping Cart Management**: Add scanned products to the cart and view the cart contents.
- **Total Price Calculation**: Calculate the total price of items in the shopping cart.

## Requirements
- Java Development Kit (JDK) 8 or higher
- An IDE such as IntelliJ IDEA, Eclipse, or NetBeans

## Installation
1. Clone the repository:
2. Navigate to the project directory:

3. Open the project in your preferred Java IDE.

## Usage
1. Run the `ScanAndFindCheapestDemo` class as a Java application.
2. The program simulates scanning products by barcode and displays:
- The cheapest option for each scanned product.
- The contents of the shopping cart.
- The total price of items in the cart.

### Example Output
Cheapest option for Apple: $0.89 at Store B
Apple has been added to your cart.
Cheapest option for Bread: $2.29 at Store B
Bread has been added to your cart.
Your Shopping Cart:
Apple: $0.89
Bread: $2.29
Total Price: $3.18

## Code Structure
shopping-assistance/
│
├── Product.java # Class representing a product with barcode, name, price, and store location.
├── ShoppingCart.java # Class for managing the shopping cart.
└── ScanAndFindCheapestDemo.java # Main class that simulates scanning products and finding cheapest options.
text

## Contributing
Contributions are welcome! Please fork this repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Inspired by various e-commerce applications and their functionalities.
