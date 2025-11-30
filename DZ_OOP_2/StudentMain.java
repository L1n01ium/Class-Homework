public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("3", "Zaur", "Nadjafov");
		Student student3 = new Student("3", "Zaur", "Nadjafov", 18, 4.5, "ITIS");
		student3.displayInfo();
		student3.setStudentId("4");
		student3.displayInfo(false);
		student3.updateGrade(4.6);
		student3.updateGrade(4.3, "Math");
		student3.displayInfo();
		System.out.println("Всего студентов: " + Student.getTotalStudents());
	}
}