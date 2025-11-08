public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private String group;
	private double averageGrade;
	private boolean isActive;
	
	public Student() {
		this("Name", "LastName", "11-000", 18, 0.0, true);
	}
	
	public Student(String firstName, String lastName, String group) {
		this(firstName, lastName, group, 18, 0.0, true);
	}
	
	public Student(String firstName, String lastName, String group, int age, double averageGrade, boolean isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.group = group;
		this.averageGrade = averageGrade;
		this.isActive = isActive;
	}
	
	public String displayInfo() {
		String result = firstName + " " + lastName + " " + group + " " + age + " " + averageGrade + " " + isActive;
		return result;
	}
	
	public void updateGrade(double newGrade) {
		this.averageGrade = newGrade;
		System.out.println("New Grade: " + averageGrade);
	}
	public void activateStudent() {
		this.isActive = true;
		System.out.println("Status Student: " + isActive);
	}
	public void deactivateStudent() {
		this.isActive = false;
		System.out.println("Status Student: " + isActive);
	}
	public void transferToNewGroup(String newgroup) {
		this.group = newgroup;
		System.out.println("Студент перевелся в группу " + group);
	}
}