public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Zaur", "Nadjafov", "11-504");
		Student student2 = new Student("Zaur", "Nadjafov", "11-504", 18,  60.2, true);
		String result = student2.displayInfo();
		System.out.println(result);
		student2.updateGrade(63.5);
		student2.activateStudent();
		student2.deactivateStudent();
		student2.transferToNewGroup("11-503");
	}
}