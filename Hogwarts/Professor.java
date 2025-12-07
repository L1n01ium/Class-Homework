public class Professor extends Wizard {

	protected String subject;
	
	public Professor(String name, int mana, int age, int spellPower, String subject) {
		super(name, mana, age, spellPower);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String newSubject) {
		this.subject = newSubject;
	}
	
	public void teach() {
		if (getMana() >= 5) {
			setMana(getMana() - 5);
			System.out.println("Проффесор" + getName() + " учит " + subject);
		} else {
			System.out.println("Недостаточно маны");
		}
	}
	
	public void castOnStudent(HogwartsStudent student, String spellName) {
		System.out.println(getName() + "кастует заклинание " + spellName + " на " + student.getName());
		student.setMana(student.getMana() - this.getSpellPower());
		student.setSpellPower(student.getSpellPower() + this.getSpellPower() / 2);
	}
}