public class ProductMain {
	public static void main(String[] args) {
		Product product = new Product();
		Product product1 = new Product("burn", 129.99, "drinks");
		Product product2 = new Product("burn", 129.99, "drinks", true, 200);
		product2.displayInfo();
		product2.setCategory("Energy drinks");
		product2.applyDiscount(30);
		product2.restock(45);
		product2.sell(20);
		Product[] products = {product, product1, product2};
		Product.calculateTotalValue(products);
		product2.applyDiscount(35, "NewYear");
		product2.restock(500, "TradeBeer");
		product2.sell(5, "Nikitka");
		product2.displayInfo(false);
		System.out.println("Всего товаров создано: " + Product.getTotalProducts());
	}
}