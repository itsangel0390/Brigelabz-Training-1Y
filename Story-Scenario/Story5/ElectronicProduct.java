public class ElectronicProduct extends Product {

    private String brand;
    private String category;

    public ElectronicProduct(int productId, String productName,
                              double price, String brand, String category) {
        super(productId, productName, price);
        this.brand = brand;
        this.category = category;
    }

    @Override
    public boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase())
            || brand.equalsIgnoreCase(keyword)
            || category.equalsIgnoreCase(keyword);
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Brand        : " + brand);
        System.out.println("Category     : " + category);
    }

    public static void main(String[] args) {

        System.out.println("=== E-Commerce Product Search ===\n");

        Product[] products = {
            new Product(401, "Wooden Bookshelf", 3500.00),
            new ElectronicProduct(402, "Galaxy S24 Ultra", 89999.00, "Samsung", "Mobile"),
            new ElectronicProduct(403, "MacBook Air M2", 115000.00, "Apple", "Laptop")
        };

        System.out.println("Search keyword: \"laptop\"\n");
        for (Product p : products) {
            if (p.isMatch("laptop")) {
                System.out.println("--- Match Found ---");
                p.displayProduct();
            }
        }

        System.out.println("\nSearch keyword: \"samsung\"\n");
        for (Product p : products) {
            if (p.isMatch("samsung")) {
                System.out.println("--- Match Found ---");
                p.displayProduct();
            }
        }
    }
}
