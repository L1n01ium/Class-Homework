public class HogwartsStudent extends Wizard {
	
	private String house;
	private int mischiefLevel;
	
	public HogwartsStudent(String name, int mana, int age, int spellPower, String house, int mischiefLevel) {
		super(name, mana, age, spellPower);
		this.house = house;
		this.mischiefLevel = mischiefLevel;
	}
	
	public String getHouse() {
		return house;
	}
	
	public int getMischiefLevel() {
		return mischiefLevel;
	}
	
	public void setHouse(String newHouse) {
		if (newHouse != null && newHouse.length() != 0) {
			this.house = newHouse;
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public int setMischiefLevel(int newMischiefLevel) {
		if (newMischiefLevel < 0) {
			this.mischiefLevel = newMischiefLevel;
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public void prank() {
		if (getMana() >= 10) {
			setMana(getMana() - 10);
			setMischiefLevel(getMischiefLevel() + 5);
			System.out.println("Гарри подложил слизеринскому студенту лягушку в учебник!");
		} else {
			System.out.println("Маны не хватает");
		}
	}
}