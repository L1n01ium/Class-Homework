public class MobilePhoneMain {
	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone();
		MobilePhone phone1 = new MobilePhone("Samsung", "A51", 128);
		MobilePhone phone3 = new MobilePhone("Samsung", "A51", 128, 56, true);
		phone3.displayInfo();
		phone3.setModel("S25");
		System.out.println("Модель телефона изменилась на " + phone3.getModel());
		phone3.powerOn();
		phone3.powerOff();
		phone3.chargeBattery(20);
		phone3.useBattery(40);
		phone3.powerOn();
		MobilePhone.displayTechSupport();
		phone3.chargeBattery(14,15);
		phone3.useBattery(40,"TikTok");
		phone3.displayInfo(false);
		System.out.println("Всего телефонов: " + MobilePhone.getTotalPhones());
	}
}