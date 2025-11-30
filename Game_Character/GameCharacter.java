public class GameCharacter {
	
	private String name;
	private int level;
	private double health;
	private double mana;
	private boolean isAlive;
	private static int totalCharacters;
	private static final int MAX_LEVEL = 100;
	
	public GameCharacter() {
		this("name", 0, 0.0, 0.0, true);
	}
	
	public GameCharacter(String name, int level, double health, double mana, boolean isAlive) {
		this.name = name;
		this.level = level;
		this.health = health;
		this.mana = mana;
		this.isAlive = isAlive;
		totalCharacters++;
	}
	
	public static int getTotalCharacters() {
		return totalCharacters;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public double getHealth() {
		return health;
	}
	
	public double getMana() {
		return mana;
	}
	
	public boolean getIsAlive() {
		return isAlive;
	}
	
	public void setName(String newName) {
		if (newName.length() != 0 && newName != null) {
			this.name = newName;
			System.out.println("Имя изменилось. Вы теперь " + getName());
		} else {
			System.out.println("Некоректное имя");
		}
	}
	
	public void setLevel(int newLevel) {
		if (newLevel >=0 && newLevel <= MAX_LEVEL) {
			this.level = newLevel;
			System.out.println("Уровень изменился. Новый уровень: " + getLevel());
		} else {
			System.out.println("Уровень вышел за рамки, такого быть не может");
		}
	}
	
	public void setHealth(double newHealth) {
		if (newHealth >= 0.0 && newHealth < 100.0) {
			this.health = newHealth;
			System.out.println("Здоровье изменилось. Новое значение здоровья: " + getHealth());
		} else {
			System.out.println("Здоровье вышло за рамки, такого быть не может");
		}
	}
	
	public void setMana(double newMana) {
		if (newMana >= 0.0 && newMana <= 100.0) {
			this.mana = newMana;
			System.out.println("Мана изменилась. Новое значение маны: " + getMana());
		} else {
			System.out.println("Мана вышла за рамки, такого быть не может");
		}
	}
	
	public void setIsAlive(boolean newIsAlive) {
		this.isAlive = isAlive;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + getName() + " | level: " + getLevel() + " | health: " + getHealth() + " | mana: " + getMana() + " | isAlive: " + getIsAlive());
	}
	
	public void useSpecialAbility() {
		System.out.println(getName() + " использовал специальную способность");
	}
	
	public void attack() {
		System.out.println(getName() + " совершил атаку на противника");
	}
	
	public void takeDamage(double damage) {
		if (getIsAlive()) {
			this.health -= damage;
			if (getHealth() <= 0.0) {
				setHealth(0.0);
				setIsAlive(false);
				System.out.println("Вы погибли!");
			} else {
				System.out.println(getName() + " получил урон: " + damage + ". Текущий запас здоровья: " + getHealth());
			}
		} else {
			System.out.println("Ваш персонаж уже мертв, он не может получить урон");
		}
	}
	
	public void heal(double amount) {
		if (getIsAlive()) {
			this.health += amount;
			if (getHealth() >= 100.0) {
				setHealth(100.0);
				System.out.println("Здоровье полное");
			} else {
				System.out.println("Вас вылечили, текущее здоровье: " + getHealth());
			}
		} else {
			System.out.println("Ваш персонаж мертв, его нельзя подлечить");
		}
	}
}