public class SmartHome {
	
	private String homeName;
	SmartDevice device1 = new SmartThermostat("1", "Thermostat", "Bedroom", true, 150, 20.3, 23.0, "обогрев");
	SmartDevice device2 = new SmartLight("2", "Light", "Bedroom", true, 50, 70, "red", true);
	SmartDevice device3 = new SmartSecurityCamera("3", "Camera", "Kitchen", true, 100, true, true, "HD");
	SmartDevice[] devices = {
		device1,
		device2,
		device3
	};
	
	public void addDevice(SmartDevice device) {
		SmartDevice[] device_new = new SmartDevice[devices.length + 1];
		for (int i = 0; i < devices.length; i++) {
			device_new[i] = devices[i];
		}
		device_new[devices.length] = device;
		devices = device_new;
		System.out.println("Добавлено новое устройство: " + device.getDeviceName() + " (тип: " + device.getDeviceType() + ")");
	}
	
	public void turnOnAllDevices() {
		for (int i = 0; i < devices.length; i++) {
			devices[i].turnOn();
		}
	}
	
	public void turnOffAllDevices() {
		for (int i = 0; i < devices.length; i++) {
			devices[i].turnOff();
		}
	}
	
	public void getDevicesByType(String type) {
		for (int i = 0; i < devices.length; i++) {
			if (devices[i].getDeviceType().equals(type)) {
				System.out.println(devices[i].getDeviceName() + " - " + devices[i].getDeviceType());
			}
		}
	}
	
	public void calculateTotalPowerConsumption() {
		double sum = 0.0;
		for (int i = 0; i < devices.length; i++) {
			sum += devices[i].getPowerConsumption();
		}
		System.out.println("TotalPowerConcumption: " + sum);
	}
	
	public void getDeviceStatus(String deviceId) {
		for (int i = 0; i < devices.length; i++) {
			if (devices[i].getDeviceId() == deviceId) {
				devices[i].getStatus();
			}
		}
	}
	
	public static void main(String[] args) {
		
		SmartHome myHome = new SmartHome();
		
		System.out.println("Всего устройств: " + SmartDevice.getTotalDevices());
		
		System.out.println("Включим все устройства");
		myHome.turnOnAllDevices();
		
		System.out.println("Статусы устройств");
		for (SmartDevice device: myHome.devices) {
			System.out.println("\nУстройство " + device.getDeviceName() + " (" + device.getDeviceType() + ")");
			device.getStatus();
		}
		
		System.out.println("\nПотребление энергии");
		myHome.calculateTotalPowerConsumption();
		
		SmartThermostat thermostat = (SmartThermostat) myHome.devices[0];
		System.out.println("\nТекущая температура термостата - " + thermostat.getCurrentTemperature() + "*C");
		thermostat.setTemperature(22.5, "обогрев");
		thermostat.performAction();
		thermostat.getEnergyReport();
		
		SmartLight light = (SmartLight) myHome.devices[1];
		System.out.println("\nЯркость лампы - " + light.getBrightness() + ", цвет - " + light.getColor());
		light.setBrightness(85, "синий");
		light.dimLights();
		light.performAction();
		
		SmartSecurityCamera camera = (SmartSecurityCamera) myHome.devices[2];
		System.out.println("\nКамера - запись: " + camera.getIsRecording() + ", качество: " + camera.getVideoQuality());
		camera.startRecording(true);
		camera.detectMotion();
		camera.getLiveFeed();
		camera.performAction();
		
		System.out.println("\n=== Добавление нового устройства ===");
		SmartLight newLight = new SmartLight("4", "Новая лампа", "Гостиная", false, 45, 50, "Белый", true);
		myHome.addDevice(newLight);
		
		System.out.println("Всего устройств: " + SmartDevice.getTotalDevices());
		myHome.getDevicesByType("Умная лампа");
		
		System.out.println("Выключаем все устройства");
		myHome.turnOffAllDevices();
		
		System.out.println("Финальное потребление энергии:");
		myHome.calculateTotalPowerConsumption();
		System.out.println("\n=== ВСЁ ===");
	}
}