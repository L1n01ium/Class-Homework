public class Mage extends GameCharacter {
	
	private double intelligence;
	private double spellPower;
	private String element;
	
	public Mage(String name, int level, double health, double mana, boolean isAlive, double intelligence, double spellPower, String element) {
		super(name, level, health, mana, isAlive);
		this.intelligence = intelligence;
		this.spellPower = spellPower;
		this.element = element;
	}
	
	public double getIntelligence() {
		return intelligence;
	}
	
	public double getSpellPower() {
		return spellPower;
	}
	
	public String getElement() {
		return element;
	}
	
	public void setIntelligence(double newIntelligence) {
		if (newIntelligence >= 0) {
			this.intelligence = newIntelligence;
			System.out.println("Интеллект изменился. Текущее значение - " + getIntelligence());
		} else {
			System.out.println("Интеллект не может быть отрицательным");
		}
	}
	
	public void setSpellPower(double newSpellPower) {
		if (newSpellPower >= 0) {
			this.spellPower = newSpellPower;
			System.out.println("Сила заклинания изменилась. Текущее значение - " + getSpellPower());
		} else {
			System.out.println("Сила заклинания не может быть отрицательна");
		}
	}
	
	public void setElement(String newElement) {
		if (newElement != null && newElement.length() != 0) {
			this.element = newElement;
		} else {
			System.out.println("Неверный формат ввода нового элемента");
		}
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Name: " + getName() + " | level: " + getLevel() + " | health: " + getHealth() + " | mana: " + getMana() + " | intelligence: " + getIntelligence() + " | spellPower: " + getSpellPower() + " | element: " + getElement() + " | isAlive: " + getIsAlive());
	}
	
	@Override
	public void useSpecialAbility() {
		System.out.println( getName() + " использовал специальную способность Магический щит");
	}
	
	public void castSpell(String spellName) {
		if (spellName != null && spellName.length() != 0) {
			System.out.println(getName() + " произнес специальное заклинание " + spellName);
		} else {
			System.out.println("Неверный формат названия");
		}
	}
	
	public void meditate() {
		System.out.println("Началась медитация для восстановления маны");
		setMana(getMana() + 20.0);
		System.out.println("Текущая мана: " + getMana());
	}
}