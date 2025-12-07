public class Wizard {
	
	private String name;
	private int mana;
	private int age;
	private int spellPower;
	private static int totalWizards = 0;
	private static int totalSpellPower = 0;
	
	public Wizard() {
		this("Unknown", 50, 11, 10);
	}
	
	public Wizard(String name, int mana, int age, int spellPower) {
		this.name = name;
		this.mana = mana;
		this.age = age;
		this.spellPower = spellPower;
		totalWizards++;
		totalSpellPower += spellPower;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMana() {
		return mana;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getSpellPower() {
		return spellPower;
	}
	
	public void setName(String newName) {
		if (newName != null && newName.length() != 0) {
			this.name = newName;
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	public void setMana(int newMana) {
		if (newMana >= 0 && newMana <= 100) {
			this.mana = newMana;
		} else if (newMana < 0) {
			this.mana = 0;
			System.out.println("Ой-ой, что-то пошло не так с магией!");
		} else {
			this.mana = 100;
			System.out.println("Ой-ой, что-то пошло не так с магией");
		}
	}
	
	public void setAge(int newAge) {
		if (newAge >= 0) {
			this.age = newAge;
		} else {
			System.out.println("Возраст не может быть меньше 0");
		}
	}
	
	public void setSpellPower(int newSpellPower) {
		if (newSpellPower >= 0) {
			this.spellPower = newSpellPower;
		} else {
			System.out.println("spellPower не может быть отрицательным");
		}
	}
	
	public void castSpell(String spellName) {
		if (getMana() >= 10) {
			setMana(getMana() - 10);
			setSpellPower(getSpellPower() + 5);
			System.out.println("Вы использовали " + spellName);
		} else {
			System.out.println("Недостаточно маны! Попей мятный чай пж..");
		}
	}
	
	public void castSpell() {
		if (getMana() >= 5) {
			setMana(getMana() - 5);
			setSpellPower(getSpellPower() + 3);
			System.out.println("Вы использовали Lumos");
		} else {
			System.out.println("Недостаточно маны для Lumos");
		}
	}
	
	public void castSpell(String spellName, int power) {
		setMana(getMana() - power);
		setSpellPower(getSpellPower() + power);
	}
	
	public void displayInfo() {
		if (getMana() > 50) {
			System.out.println("Name: " + getName() + " \n" + "Mana: готов шалить" + " \n" + "Age: " + getAge() + "\n" + "SpellPower: " + getSpellPower());
		} else if (getMana() <= 50 && getMana() > 20) {
			System.out.println("Name: " + getName() + " \n" + "Mana: весёлый" + " \n" + "Age: " + getAge() + "\n" + "SpellPower: " + getSpellPower());
		} else if (getMana() <= 20) {
			System.out.println("Name: " + getName() + " \n" + "Mana: уставший" + " \n" + "Age: " + getAge() + "\n" + "SpellPower: " + getSpellPower());
		}
	}
	
	public void rechargeMana(int amount) {
		if (amount <= 100) {
			setMana(getMana() + amount);
			System.out.println("Мана восстановлена! Заклинания почти вызывают фейерверк");
		} else {
			System.out.println("Нельзя восстановить ману более чем на 100 ед");
		}
	}
	
	public static int getTotalWizards() {
		return totalWizards;
	}
	
	public static int getTotalSpellPower() {
		return totalSpellPower;
	}
	
	public static void showAcademyStats() {
		System.out.println("Кол-во волшебников: " + getTotalWizards() + ". Суммарная сила: " + getTotalSpellPower());
	}
}