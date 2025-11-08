public class MobilePhoneMain {
	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone();
		MobilePhone phone1 = new MobilePhone("Samsung", "A51", 128);
		MobilePhone phone3 = new MobilePhone("Samsung", "A51", 128, 56, true);
		phone3.displayInfo();
		phone3.powerOn();
		phone3.powerOff();
		phone3.chargeBattery(20);
		phone3.useBattery(40);
	}
}