public class MobilePhone {
	
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;
	
	public MobilePhone() {
		this("brand", "model", 0, 0, true);
	}
	
	public MobilePhone(String brand, String model, int storageGB) {
		this(brand, model, storageGB, 0, true);
	}
	
	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
	}
	
	public void displayInfo() {
		System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel + " " + isPoweredOn);
	}
	
	public void powerOn() {
		this.isPoweredOn = true;
		System.out.println("Телефон включен");
	}
	
	public void powerOff() {
		this.isPoweredOn = false;
		System.out.println("Телефон выключен");
	}
	
	public void chargeBattery(int percent) {
		batteryLevel += percent;
		if (batteryLevel > 100) {
			batteryLevel = 100;
			System.out.println("Батарея заряжена");
		} else {
			System.out.println("Батарея зарядилась до " + batteryLevel);
		}
	}
	
	public void useBattery(int percent) {
		if (isPoweredOn) {
			batteryLevel -= percent;
			if (batteryLevel <= 0) {
				batteryLevel = 0;
				isPoweredOn = false;
				System.out.println("Батарея разрядилась, поэтому телефон выключился");
			} else {
				System.out.println("Заряда осталось: " + batteryLevel);
			}
		} else {
			System.out.println("Телефон включи");
		}
	}
}