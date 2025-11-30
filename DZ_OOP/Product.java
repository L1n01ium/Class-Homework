public class Product {
	
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;
	private static int totalProducts = 0;
	private static final String STORE_NAME = "Супермаркет 'У дома'";
	
	public Product() {
		this("name", 0.0, "category", true, 0);
	}
	
	public Product(String name, double price, String category) {
		this(name, price, category, true, 0);
	}
	
	public Product(String name, double price, String category, boolean inStock, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.inStock = inStock;
		this.quantity = quantity;
		totalProducts++;
	}
	
	public static int getTotalProducts() {
		return totalProducts;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public boolean getStock() {
		return inStock;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setPrice(double newPrice) {
		if (newPrice >= 0 && newPrice <= 1000000) {
			this.price = newPrice;
		} else {
			System.out.println("Новая цена не может быть отрицательна и не больше 1 миллиона!");
		}
	}
	
	public void setCategory(String newCategory) {
		this.category = newCategory;
	}
	
	public void setStock(boolean newStock) {
		this.inStock = newStock;
	}
	
	public void setQuantity(int newQuantity) {
		if (newQuantity >= 0) {
			this.quantity = newQuantity;
		} else {
			System.out.println("quantity не может быть отрицательным");
		}
	}
	
	public void displayInfo() {
		System.out.println(getName() + " " + getPrice() + " " + getCategory() + " " + getStock() + " " + getQuantity());
	}
	
	public void applyDiscount(double percent) {
		double discountinrub = (getPrice() / 100) * percent;
		setPrice(getPrice() - discountinrub);
		System.out.println("Товар после применения скидки стоит: " + getPrice());
	}
	
	public void restock(int amount) {
		this.quantity += amount;
		System.out.println("Склад пополнен на " + amount + " штук." + " Всего: " + getQuantity()); 
	}
	
	public void sell(int amount) {
		if (getStock() && getQuantity() >= amount) {
			this.quantity -= amount;
			System.out.println("Было продано " + amount + " товаров." + "Осталось: " + getQuantity()); 
		} else {
			System.out.println("Товара нет на складе");
		}
	}
	
	public static void calculateTotalValue(Product[] products) {
		double totalValue = 0;
		for (Product product : products) {
			totalValue += product.getPrice() * product.getQuantity();
		}
		System.out.println("Общая стоимость товаров: " + totalValue);
	}
	
	public void applyDiscount(double percent, String promoCode) {
		double discountinrub = (getPrice() / 100) * percent;
		this.price -= discountinrub;
		System.out.println("После применения промокода - " + promoCode + " на скидку в " + percent + "%, итоговая стоимость продукта стала: " + getPrice());
	}
	
	public void restock(int amount, String supplier) {
		this.quantity += amount;
		System.out.println("Склад был пополнен товаром в кол-ве " + amount + " поставщиком: " + supplier + ". Текущее кол-во товара на складе: " + getQuantity());
	}
	
	public void sell(int amount, String customer) {
		if (getStock() && getQuantity() >= amount) {
			this.quantity -= amount;
			System.out.println("Покупатель " + customer + " купил " + amount + " товаров. Осталось: " + getQuantity());
		} else {
			System.out.println("Товара нет в наличии");
		}
	}
	
	public void displayInfo(boolean showStockStatus) {
		if (showStockStatus) {
			System.out.println(getName() + " " + getPrice() + " " + getCategory() + " " + getStock() + " " + getQuantity());
		} else {
			System.out.println(getName() + " " + getPrice() + " " + getCategory() + " " + getQuantity());
		}
	}
}