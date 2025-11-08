public class Car {
	
	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;
	
	public Car() {
		this("brand", "model", 0, "color", 0.0, true, 0.0);
	}
	
	public Car(String brand, String model, int year) {
		this(brand, model, year, "color", 0.0, true, 0.0);
	}
	
	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
	}
	
	public void displayInfo() {
		System.out.println(brand + " " + model + " " + year + " " + color + " " + price + " " + isRunning + " " + mileage);
	}
	
	public void startEngine() {
		this.isRunning = true;
		System.out.println("Двигатель запущен");
	}
	
	public void stopEngine() {
		this.isRunning = false;
		System.out.println("Двигатель заглушен");
	}
	
	public void drive(double distance) {
		if (isRunning) {
			this.mileage += distance;
			System.out.println("Вы проехали: " + distance + ". Текущий пробег: " + mileage);
		} else {
			System.out.println("Двигатель загулшен. Движение невозможно");
		}
	}
	
	public void repaint(String newColor) {
		this.color = newColor;
		System.out.println("Машина была перекрашена в " + newColor);
	}
	
	public void updatePrice(double newPrice) {
		this.price = newPrice;
		System.out.println("Цена машины изменилась. Текущая цена: " + price);
	}
}