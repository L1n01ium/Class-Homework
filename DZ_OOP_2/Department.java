public class Department {
	
	private String departmentName;
	private String headOfDepartment;
	private String officeRoom;
	private String email;
	private String phoneNumber;
	private double budget;
	private static int totalDepartments = 0;
	private static final double UNIVERSITY_BUDGET = 120000000.5;
	
	public Department() {
		this("departmentName", "headOfDepartment", "officeRoom", "email", "phoneNumber", 0.0);
	}
	
	public Department(String departmentName, String headOfDepartment, String officeRoom) {
		this(departmentName, headOfDepartment, officeRoom, "email", "phoneNumber", 0.0);
	}
	
	public Department(String departmentName, String headOfDepartment, String officeRoom, String email, String phoneNumber, double budget) {
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
		this.officeRoom = officeRoom;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.budget = budget;
		totalDepartments++;
	}
	
	public static double getUniversityBudget() {
		return UNIVERSITY_BUDGET;
	}
	
	public static int getTotalDepartments() {
		return totalDepartments;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getHeadOfDepartment() {
		return headOfDepartment;
	}
	
	public String getOfficeRoom() {
		return officeRoom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public double getBudget() {
		return budget;
	}
	
	public void setDepartmentName(String newDepartmentName) {
		this.departmentName = newDepartmentName;
	}
	
	public void setHeadOfDepartment(String newHeadOfDepartment) {
		this.headOfDepartment = newHeadOfDepartment;
	}
	
	public void setOfficeRoom(String newOfficeRoom) {
		this.officeRoom = newOfficeRoom;
	}
	
	public void setEmail(String newEmail) {
		if (validateEmail(newEmail)) {
			this.email = newEmail;
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public void setPhoneNumber(String newPhoneNumber) {
		if (newPhoneNumber.matches("\\d+")) {
			this.phoneNumber = newPhoneNumber;
		} else {
			System.out.println("Номер телефона должен содержать только цифры");
		}
	}
	
	public void setBudget(double newBudget) {
		if (newBudget >= 0) {
			this.budget = newBudget;
		} else {
			System.out.println("Бюджет не должен быть отрицательным");
		}
	}
		
	public static boolean validateEmail(String email) {
		if (email == null || email.length() == 0) {
			return false;
		}
		return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
	}
	
	public void contact() {
		System.out.println(getDepartmentName() + " " + getHeadOfDepartment() + " " + getOfficeRoom() + " " + getEmail() + " " + getPhoneNumber());
	}
	
	public void contact(String message) {
		System.out.println("Сообщения для кафедры " + getDepartmentName() + ": " + message);
		System.out.println(getPhoneNumber() + " " + getEmail());
	}
	
	public void allocateBudget(double amount) {
		if (amount > 0 && amount <= UNIVERSITY_BUDGET) {
			this.budget += amount;
			System.out.println("Распределено " + amount + " средств из бюджета университета: " + UNIVERSITY_BUDGET + ". Стало: " + getBudget());
		} else {
			System.out.println("Средств недостаточно");
		}
	}
	
	public void allocateBudget(double amount, String purpose) {
		if (amount > 0 && amount <= UNIVERSITY_BUDGET) {
			this.budget += amount;
			System.out.println("Распределено " + amount + " средств на " + purpose + ". Стало: " + getBudget());
		} else {
			System.out.println("Недостаточно средств для " + purpose);
		}
	}
}