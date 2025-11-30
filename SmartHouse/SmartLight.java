public class SmartLight extends SmartDevice {
	
	private int brightness;
	private String color;
	private boolean isColorChanging;
	
	public SmartLight(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, int brightness, String color, boolean isColorChanging) {
		super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
		this.brightness = brightness;
		this.color = color;
		this.isColorChanging = isColorChanging;
	}
	
	public int getBrightness() {
		return brightness;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getIsColorChanging() {
		return isColorChanging;
	}
	
	public void setBrightness(int level) {
		if (level >= 0 && level <= 100) {
			this.brightness = level;
		} else {
			System.out.println("Невозможно");
		}
	}
	
	public void setColor(String newColor) {
		if (newColor != null && newColor.length() != 0) {
			if (getIsColorChanging()) {
				this.color = newColor;
			} else {
				System.out.println("Устройство не поддерживает смену цвета");
			}
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public void setIsColorChanging(boolean newIsColorChanging) {
		this.isColorChanging = newIsColorChanging;
	}
	
	public void changeColor(String newColor) {
		setColor(newColor);
	}
	
	public void dimLights() {
		this.brightness -= 25;
		if (getBrightness() < 0) {
			setBrightness(0);
			System.out.println("Яркость была приглушена на 25%. Текущая яркость - " + getBrightness());
		} else {
			System.out.println("Яркость была приглушена на 25%. Текущая яркость - " + getBrightness());
		}
	}

	@Override
	public String getDeviceType() {
		return "Умная лампа";
	}
	
	@Override
	public void performAction() {
		System.out.println("Включить/выключить свел");
	}
	
	public void setBrightness(int level, String color) {
		if (level >= 0 && level <=100) {
			setBrightness(level);
			setColor(color);
		} else {
			System.out.println("Яркость изменить невозможно на такое значение");
			setColor(color);
		}
	}
}