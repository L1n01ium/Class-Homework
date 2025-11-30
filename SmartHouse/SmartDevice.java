public class SmartDevice {
	
	private String deviceId;
	private String deviceName;
	private String location;
	private boolean isPoweredOn;
	private double powerConsumption;
	private static int totalDevices;
	private static final int MAX_POWER_CONSUMPTION = 5000;
	
	public SmartDevice() {
		this("deviceId", "deviceName", "location", false, 0.0);
		totalDevices++;
	}
	
	public SmartDevice(String deviceId, String deviceName, String location) {
		this(deviceId, deviceName, location, false, 0.0);
		totalDevices++;
	}
	
	public SmartDevice(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.location = location;
		this.isPoweredOn = isPoweredOn;
		this.powerConsumption = powerConsumption;
		totalDevices++;
	}
	
	public static int getTotalDevices() {
		return totalDevices;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	 
	public String getDeviceName() {
		return deviceName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public boolean getIsPoweredOn() {
		return isPoweredOn;
	}
	
	public double getPowerConsumption() {
		return powerConsumption;
	}
	
	public void setDeviceId(String newDeviceId) {
		if (newDeviceId != null && newDeviceId.length() != 0) {
			this.deviceId = newDeviceId;
			System.out.println("Уникальный идентификатор устройства поменялся. Текущий - " + getDeviceId());
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public void setDeviceName(String newDeviceName) {
		if (newDeviceName != null && newDeviceName.length() != 0) {
			this.deviceName = newDeviceName;
			System.out.println("Название устройства поменялось. Текущее - " + getDeviceName());
		} else {
			System.out.println("Неверный формат");
		}
	} 
	
	public void setLocation(String newLocation) {
		if (newLocation != null && newLocation.length() != 0) {
			this.location = newLocation;
			System.out.println("Местоположение в доме изменено. Текущее - " + getLocation());
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public void setIsPoweredOn(boolean newIsPoweredOn) {
		this.isPoweredOn = newIsPoweredOn;
	}
	
	public void setPowerConsumption(double newPowerConsumption) {
		if (newPowerConsumption >= 0 && newPowerConsumption <= MAX_POWER_CONSUMPTION) {
			this.powerConsumption = newPowerConsumption;
			System.out.println("Установлено новое потребленение энергии. Новое значение - " + getPowerConsumption());
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public String getDeviceType() {
		return "Умное устройство " + deviceName;
	}
	
	public void performAction() {
		System.out.println("устройство выполнило действие");
	}
	
	public void turnOn() {
		setIsPoweredOn(true);
	}
	
	public void turnOff() {
		setIsPoweredOn(false);
	}
	
	public void getStatus() {
		System.out.println("Status: " + getIsPoweredOn());
	}
}