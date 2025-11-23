public class BankAccount {
	
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	
	public BankAccount() {
		this("accountNumber", "ownerName", 0.0, "currency", true);
	}
	
	public BankAccount(String accountNumber, String ownerName) {
		this(accountNumber, ownerName, 0.0, "currency", true);
	}
	
	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
	}
	
	public void displayInfo() {
		System.out.println(accountNumber + " " + ownerName + " " + balance + " " + currency + " " + isActive);
	}
	
	public void deposit(double amount) {
		if (isActive = true) {
			this.balance += amount;
			System.out.println("Новый баланс после пополнения: " + balance);
		} else {
			System.out.println("Счет неактивен");
		}
	}
	
	public void withdraw(double amount) {
		if (isActive = true) {
			if (balance >= amount) {
				this.balance -= amount;
				System.out.println("Баланс после снятия: " + balance);
			} else {
				System.out.println("Недостаточно средств на балансе для снятия " + amount);
			}
		} else {
			System.out.println("Счет неактивен");
		}
	}
	
	public void activateAccount() {
		this.isActive = true;
		System.out.println("Счет активирован");
	}
	
	public void deactivateAccount() {
		this.isActive = false;
		System.out.println("Счет заблокирован");
	}
}
