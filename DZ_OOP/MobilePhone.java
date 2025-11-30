public class MobilePhone {
	
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;
	private static int totalPhones = 0;
	private static final int MAX_BATTERY = 100;
	
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
		totalPhones++;
	}
	
	public static int getTotalPhones() {
		return totalPhones;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getStorageGB() {
		return storageGB;
	}
	
	public int getBatteryLevel() {
		return batteryLevel;
	}
	
	public boolean getPoweredOn() {
		return isPoweredOn;
	}
	
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public void setStorageGB(int newStorageGB) {
		if (newStorageGB < 0) {
			System.out.println("storageGB не может быть отрицательным");
		} else {
			this.storageGB = newStorageGB;
		}
	}
	
	public void setBatteryLevel(int newBatteryLevel) {
		if (newBatteryLevel >= 0 && newBatteryLevel <= 100) {
			this.batteryLevel = newBatteryLevel;
		} else {
			System.out.println("Такого не может быть!");
		}
	}
	
	public void setPoweredOn(boolean newPoweredOn) {
		this.isPoweredOn = newPoweredOn;
	}
	
	
	public void displayInfo() {
		System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel + " " + isPoweredOn);
	}
	
	public void powerOn() {
		setPoweredOn(true);
		System.out.println("Телефон включен");
	}
	
	public void powerOff() {
		setPoweredOn(false);
		System.out.println("Телефон выключен");
	}
	
	public void chargeBattery(int percent) {
		this.batteryLevel += percent;
		if (getBatteryLevel() > 100) {
			setBatteryLevel(100);
			System.out.println("Батарея заряжена");
		} else {
			System.out.println("Батарея зарядилась до " + getBatteryLevel());
		}
	}
	
	public void useBattery(int percent) {
		if (getPoweredOn()) {
			batteryLevel -= percent;
			if (getBatteryLevel() <= 0) {
				setBatteryLevel(0);
				setPoweredOn(false);
				System.out.println("Батарея разрядилась, поэтому телефон выключился");
			} else {
				System.out.println("Заряда осталось: " + getBatteryLevel());
			}
		} else {
			System.out.println("Телефон включи");
		}
	}
	
	public static void displayTechSupport() {
		System.out.println("Вы можете обратиться в нашу техподдержку по номеру: *****. Вам ответит помощник ****.");
	}
	
	public void chargeBattery(int percent, int minutes) {
		this.batteryLevel += percent;
		if (getBatteryLevel() > 100) {
			setBatteryLevel(100);
			System.out.println("Телефон заряжен. Время зарядки: " + minutes);
		} else {
			System.out.println("Текущий заряд телефона: " + getBatteryLevel() + ". Время зарядки: " + minutes);
		}
	}
	
	public void useBattery(int percent, String appName) {
		if (getPoweredOn()) {
			this.batteryLevel -= percent;
			if (getBatteryLevel() < 0) {
				setBatteryLevel(0);
				setPoweredOn(false);
				System.out.println("Приложение: " + appName + " использовало: " + percent + " процентов зарядки. Ваш телефон разрядился.");
			} else {
				System.out.println("Приложение: " + appName + " использовало: " + percent + " процентов зарядки. Осталось зарядки: " + getBatteryLevel());
			}
		} else {
			System.out.println("Мы не можем использовать телефон в выключенном состоянии. Включи его!");
		}
	}
	public void displayInfo(boolean showPowerStatus) {
		if (showPowerStatus) {
			System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel + " " + isPoweredOn);
		} else {
			System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel);
		}
	}
}