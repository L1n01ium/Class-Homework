public class Product {
	
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;
	
	public Product() {
		this("name", 0.0, "category", false, 0);
	}
	
	public Product(String name, double price, String category) {
		this(name, price, category, false, 0);
	}
	
	public Product(String name, double price, String category, boolean inStock, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.inStock = inStock;
		this.quantity = quantity;
	}
	
	public void displayInfo() {
		System.out.println(name + " " + price + " " + category + " " + inStock + " " + quantity);
	}
	
	public void applyDiscount(double percent) {
		double discountinrub = (price / 100) * percent;
		this.price -= discountinrub;
		System.out.println("Товар после применения скидки стоит: " + price);
	}
	
	public void restock(int amount) {
		this.quantity += amount;
		System.out.println("Склад пополнен на " + amount + " штук." + " Всего: " + quantity); 
	}
	
	public void sell(int amount) {
		if (inStock) {
			if (quantity >= amount) {
				this.quantity -= amount;
				System.out.println("Было продано " + amount + " товаров." + "Осталось: " + quantity); 
			} else {
				System.out.println("Недостаточно товара на складе");
			}
		} else {
			System.out.println("Товара нет на складе");
		}
	}
}
