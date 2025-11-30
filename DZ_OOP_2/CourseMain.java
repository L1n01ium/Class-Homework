public class CourseMain {
	public static void main(String[] args) {
		Course course = new Course();
		Course course1 = new Course("09.03.04", "SRPO", 164);
		Course course2 = new Course("09.03.04", "SRPO", 164, 160, true);
		course2.displayInfo();
		course2.setCurrentStudents(150);
		course2.displayInfo(false);
		course2.enrollStudent();
		course2.enrollStudent("120");
		course2.displayInfo();
		System.out.println("Всего курсов: " + Course.getTotalCourses());
	}
}