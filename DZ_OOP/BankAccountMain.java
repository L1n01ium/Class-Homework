public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		BankAccount bank1 = new BankAccount("Sberbank", "1243");
		BankAccount bank2 = new BankAccount("Sberbank", "1243", 302000.32, "rub", true);
		bank2.displayInfo();
		bank2.deposit(132003.3);
		bank2.withdraw(200000.5);
		bank2.activateAccount();
		bank2.deactivateAccount();
	}
}