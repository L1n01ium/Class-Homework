public class ProductMain {
	public static void main(String[] args) {
		Product product = new Product();
		Product product1 = new Product("burn", 129.99, "drinks");
		Product product2 = new Product("burn", 129.99, "drinks", true, 200);
		product2.displayInfo();
		product2.applyDiscount(30);
		product2.restock(45);
		product2.sell(20);
	}
}