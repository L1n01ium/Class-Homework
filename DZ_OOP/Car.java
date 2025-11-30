import java.util.Scanner;

public class Car {
	
	private static Scanner mysc = new Scanner(System.in);
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
	
	public void getBrand() {
		return brand;
	}
	
	public void setBrand(String newBrand) {
		brand = newBrand;
		System.out.println("Бренд сменился на " + brand);
	}
	
	public void getModel() {
		return model;
	}
	
	public void setModel(String newModel) {
		model = newModel;
		System.out.println("Модель поменялась на " + model);
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		while (newYear <= 1885 || newYear >= 2025) {
			System.out.println("Введите нормальный год!");
			newYear = mysc.nextInt();
		}
		year = newYear;
	}
	
	public void getColor() {
		return color;
	}
	
	
	public void getRunning() {
		return isRunning;
	
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	
	
	public void displayInfo() {
		System.out.println(brand + " " + model + " " + year + " " + color + " " + price + " " + isRunning + " " + mileage);
	}
	
	public void startEngine() {
		setRunning(true);
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