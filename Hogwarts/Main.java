public class Main {
	public static void main(String[] args) {
		Wizard[] hogwarts = new Wizard[6];
		hogwarts[0] = new HogwartsStudent("Гарри Поттер", 80, 14, 25, "Гриффиндор", 30);
		hogwarts[1] = new HogwartsStudent("Драко Малфой", 70, 14, 20, "Слизерин", 40);
		hogwarts[2] = new Professor("Северус Снейп", 90, 38, 35, "Зельеварение");
		hogwarts[3] = new Professor("Минерва МакГонагалл", 95, 45, 40, "Трансфигурация");
		hogwarts[4] = new MagicalCreature("Добби", 60, 100, 15, "Домовой эльф");
		hogwarts[5] = new MagicalCreature("Фоукс", 75, 150, 20, "Феникс");
		HogwartsStudent studentWithLowestMana = null;
		HogwartsStudent mostMischievousStudent = null;
		int minMana = 0;
		int maxMischief = -1;
		for (int i = 0; i < hogwarts.length; i++) {
			Wizard wizard = hogwarts[i];
			System.out.println("Обработка: " + wizard.getName());
			wizard.displayInfo();
			wizard.castSpell();
			if (wizard instanceof MagicalCreature) {
				MagicalCreature creature = (MagicalCreature) wizard;
				creature.specialAbility();
			}
			if (wizard instanceof HogwartsStudent) {
				HogwartsStudent student = (HogwartsStudent) wizard;
				if (student.getMana() < minMana) {
					minMana = student.getMana();
					studentWithLowestMana = student;
				}
				if (student.getMischiefLevel() > maxMischief) {
					maxMischief = student.getMischiefLevel();
					mostMischievousStudent = student;
				}
			}
			System.out.println();
		}
		if (studentWithLowestMana != null) {
			System.out.println("Студент с наименьшей маной: " + studentWithLowestMana.getName() + " мана: " + studentWithLowestMana.getMana());
			studentWithLowestMana.rechargeMana(30);
		}
		if (mostMischievousStudent != null) {
			System.out.println("Самый шаловливый студент: " + mostMischievousStudent.getName() + ". Уровень шалостей: " + mostMischievousStudent.getMischiefLevel());
			mostMischievousStudent.prank();
		}
		Wizard.showAcademyStats();
	}
}