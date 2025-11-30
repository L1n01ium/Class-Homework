public class Student {
	
	private String studentId;
	private String firstName;
	private String lastName;
	private int age;
	private double averageGrade;
	private String faculty;
	private static int totalStudents = 0;
	private static final String UNIVERSITY_NAME = "KPFU";
	
	public Student() {
		this("Id", "firstName", "lastName", 0, 0.0, "faculty");
	}
	
	public Student(String studentId, String firstName, String lastName) {
		this(studentId, firstName, lastName, 0, 0.0, "faculty");
	}
	public Student(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.averageGrade = averageGrade;
		this.faculty = faculty;
		totalStudents++;
	}
	
	public static String getUniversityName() {
		return UNIVERSITY_NAME;
	}

	public static int getTotalStudents() {
		return totalStudents;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getAverageGrade() {
		return averageGrade;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setStudentId(String newStudentId) {
		if (newStudentId != null && newStudentId.length() != 0) {
			this.studentId = newStudentId;
		} else {
			System.out.println("studentId не может быть null или пустым");
		}
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public void setAge(int newAge) {
		if (newAge >= 16 && newAge <= 70) {
			this.age = newAge;
		} else {
			System.out.println("age должен быть от 16 до 70. Данный возраст не подходит!");
		}
	}
	
	public void setAverageGrade(double newAverageGrade) {
		if (newAverageGrade >= 0.0 && newAverageGrade <= 5.0) {
			this.averageGrade = newAverageGrade;
		} else {
			System.out.println("averageGrade должен быть от 0.0 до 5.0. Данный средний балл не подходит!");
		}
	}
	
	public void setFaculty(String newFaculty) {
		this.faculty = newFaculty;
	}
	
	public void displayInfo() {
		System.out.println(getStudentId() + " " + getFirstName() + " " + getLastName() + " " + getAge() + " " + getAverageGrade() + " " + getFaculty());
	}
	public void displayInfo(boolean detailed) {
		if (detailed) {
			System.out.println(getStudentId() + " " + getFirstName() + " " + getLastName() + " " + getAge() + " " + getAverageGrade() + " " + getFaculty());
		} else {
			System.out.println(getStudentId() + " " + getFirstName() + " " + getLastName());
		}
	}
	
	public void updateGrade(double newGrade) {
		setAverageGrade(newGrade);
		System.out.println("Средний балл изменился на " + getAverageGrade());
	}
	
	public void updateGrade(double newGrade, String subject) {
		setAverageGrade(newGrade);
		System.out.println("Средний балл по " + subject + " изменился на " + getAverageGrade());
	}
}		