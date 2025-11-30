public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		BankAccount bank1 = new BankAccount("1243", "Zaur");
		BankAccount bank2 = new BankAccount("1243", "Zaur", 302000.32, "rub", true);
		bank2.displayInfo();
		bank2.setAccountNumber("412");
		System.out.println("Номер счета поменялся. Текущий номер - " + bank2.getAccountNumber());
		bank2.deposit(132003.3);
		bank2.withdraw(200000.5);
		bank2.activateAccount();
		bank2.deactivateAccount();
		BankAccount.calculateInterest(41209.32, 10, 3);
		bank2.deposit(34000, "Пополнение");
		bank2.withdraw(50000, "на рестик");
		bank2.displayInfo(false);
		System.out.println("Счетов создано: " + BankAccount.getTotalAccounts());
	}
}