public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Lada", "Niva Legend", 2025);
		Car car3 = new Car("Lada", "Niva Legend", 2025, "white", 1100000, true, 19150);
		car3.displayInfo();
		car3.startEngine();
		car3.stopEngine();
		car3.drive(20000);
		car3.repaint("black");
		car3.updatePrice(1050000);
	}
}