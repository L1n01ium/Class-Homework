public class BankAccount {
	
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	private static int totalAccounts = 0;
	private static final String BANK_NAME = "Национальный Банк";
	
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
		totalAccounts++;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String newAccountNumber) {
		this.accountNumber = newAccountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String newOwnerName) {
		this.ownerName = newOwnerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		if (newBalance >= 0 && newBalance <= 1000000000) {
			this.balance = newBalance;
		} else {
			System.out.println("баланс не может быть отрицательным и не больше 1 миллиарда");
		}
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String newCurrency) {
		this.currency = newCurrency;
	}
	
	public boolean getActive() {
		return isActive;
	}
	
	public void setActive(boolean newActive) {
		this.isActive = newActive;
	}
	
	
	public void displayInfo() {
		System.out.println(accountNumber + " " + ownerName + " " + balance + " " + currency + " " + isActive);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Новый баланс после пополнения: " + getBalance());
	}
	
	public void withdraw(double amount) {
		if (getBalance() >= amount) {
			this.balance -= amount;
			System.out.println("Баланс после снятия: " + getBalance());
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
	
	public static void calculateInterest(double amount, double rate, int years) {
		double a = amount * pow((1 + rate/100), years);
		System.out.println("Прибавка на: " + a);
	}
	
	public static double pow(double value, int powValue) {
		if (powValue == 1) {
			return value;
		} else {
			return value * pow(value, powValue - 1);
		}
	}
	
	public void deposit(double amount, String description) {
		this.balance += amount;
		System.out.println(description + ": " + amount + ". Текущий баланс: " + getBalance());
	}
	
	public void withdraw(double amount, String purpose) {
		if (getBalance() >= amount) {
			this.balance -= amount;
			System.out.println("Вы сняли с счета " + amount + " " + getCurrency() + " с целью: " + purpose);
		} else {
			System.out.println("Недостаточно средств на баланс для снятия" + amount);
		}
	}
	
	public void displayInfo(boolean showStatus) {
		if (showStatus) {
			System.out.println(accountNumber + " " + ownerName + " " + balance + " " + currency + " " + isActive);
		} else {
			System.out.println(accountNumber + " " + ownerName + " " + balance + " " + currency);
		}
	}
}

}
