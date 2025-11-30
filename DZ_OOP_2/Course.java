public class Course {
	
	private String courseCode;
	private String courseName;
	private int currentStudents;
	private boolean isActive;
	private static int totalCourses = 0;
	private static final int MAX_CREDITS_PER_SEMESTER = 1000;
	private Student[] studentsOnCourse;
	
	public Course() {
		this("courseCode", "courseName", 0, 0, true);
	}
	
	public Course(String courseCode, String courseName, int maxStudents) {
		this(courseCode, courseName, maxStudents, 0, true);
	}
	
	public Course(String courseCode, String courseName, int currentStudents, boolean isActive) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.currentStudents = currentStudents;
		this.isActive = isActive;
		studentsOnCourse = new Student[MAX_CREDITS_PER_SEMESTER];
		totalCourses++;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}
	
	public int getCurrentStudents() {
		return currentStudents;
	}
	
	public boolean getActive() {
		return isActive;
	}
	
	public static int getTotalCourses() {
		return totalCourses;
	}
	
	public void setCourseCode(String newCourseCode) {
		this.courseCode = newCourseCode;
	}
	
	public void setCourseName(String newCourseName) {
		this.courseName = newCourseName;
	}
	
	public void setCurrentStudents(int newCurrentStudents) {
		if (newCurrentStudents <= MAX_CREDITS_PER_SEMESTER && newCurrentStudents >= 0) {
			this.currentStudents = newCurrentStudents;
			System.out.println("Кол-во записанных изменилость на " + getCurrentStudents());
		} else {
			System.out.println("currentStudents не может превышать maxStudents");
		}
	}
	
	public void setActive(boolean newActive) {
		this.isActive = newActive;
	}
	
	public void displayInfo() {
		System.out.println(getCourseCode() + " " + getCourseName() + " " + getMaxStudents() + " " + getCurrentStudents() + " " + getActive());
	}
	
	public void displayInfo(boolean showAvailability) {
		if (showAvailability) {
			System.out.println(getCourseCode() + " " + getCourseName() + " " + getMaxStudents() + " " + getCurrentStudents() + " " + getActive());
		} else {
			System.out.println(getCourseCode() + " " + getCourseName() + " " + getMaxStudents() + " " + getCurrentStudents());
		}
	}
	
	public void enrollStudent(Student student) {
		studentsOnCourse[currentStudents] = student;
		currentStudents++;
	}
	
	public void enrollStudent(String studentId) {
		if (getActive()) {
			System.out.println("Студент №" + studentId+ " зачислен");
		} else {
			System.out.println("Студент№" + studentId + " не может быть зачислен, т.к курс неактивен");
		}
	}
}