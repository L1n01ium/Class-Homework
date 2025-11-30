public class SmartThermostat extends SmartDevice {
	
	private double currentTemperature;
	private double targetTemperature;
	private String mode;
	
	public SmartThermostat(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, double currentTemperature, double targetTemperature, String mode) {
		super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
		this.currentTemperature = currentTemperature;
		this.targetTemperature = targetTemperature;
		this.mode = mode;
	}
	
	public double getCurrentTemperature() {
		return currentTemperature;
	}
	
	public double getTargetTemperature() {
		return targetTemperature;
	}
	
	public String getMode() {
		return mode;
	}
	
	public void setCurrentTemperature(double newCurrentTemperature) {
		this.currentTemperature = newCurrentTemperature;
	}
	
	public void setTemperature(double temp) {
		this.targetTemperature = temp;
	}
	
	public void setTemperature(double temp, String mode) {
		setTemperature(temp);
		setMode(mode);
	}
	
	public void setMode(String newMode) {
		if (newMode == "охлаждение" || newMode == "обогрев") {
			this.mode = newMode;
			System.out.println("Режим изменен на " + getMode());
		} else {
			System.out.println("Такого режима нет");
		}
	}
	
	@Override
	public String getDeviceType() {
		return "Умный термостат";
	}
	
	@Override
	public void performAction() {
		System.out.println("Регулирует температуру");
	}
	
	public void getEnergyReport() {
		System.out.println("Потребление энергии: " + getPowerConsumption());
	}
	
	public void scheduleTemperature(double temp, int hour) {
		if (hour >= 0) {
			setTemperature(temp);
		} else {
			System.out.println("Невозможно");
		}
	}
}