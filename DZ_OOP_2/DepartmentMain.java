public class DepartmentMain {
	public static void main(String[] args) {
		Department department = new Department();
		Department department2 = new Department("ITIS", "Ivanov", "304");
		Department department3 = new Department("ITIS", "Ivanov", "304", "isit@kpfu.ru", "8431234567", 20000000.3);
		department3.contact();
		department3.setOfficeRoom("306");
		System.out.println("Офис главы департамента был изменен");
		department3.contact();
		department3.contact("Тут были мы");
		department3.allocateBudget(5000000);
		department3.allocateBudget(5000000, "Улучшение среды обучения");
		System.out.println("Всего департаментов: " + Department.getTotalDepartments());
	}
}