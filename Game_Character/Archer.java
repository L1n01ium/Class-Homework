public class Archer extends GameCharacter {
	
	private double agility;
	private double accuracy;
	private String arrowType;
	
	public Archer(String name, int level, double health, double mana, boolean isAlive, double agility, double accuracy, String arrowType) {
		super(name, level, health, mana, isAlive);
		this.agility = agility;
		this.accuracy = accuracy;
		this.arrowType = arrowType;
	}
	
	public double getAgility() {
		return agility;
	}
	
	public double getAccuracy() {
		return accuracy;
	}
	
	public String getArrowType() {
		return arrowType;
	}
	
	public void setAgility(double newAgility) {
		if (newAgility >= 0) {
			this.agility = newAgility;
			System.out.println("Значение ловкости изменилось. Текущее значение - " + getAgility());
		} else {
			System.out.println("Значение ловкости не может быть отрицательным");
		}
	}
	
	public void setAccuracy(double newAccuracy) {
		if (newAccuracy >= 0) {
			this.accuracy = newAccuracy;
			System.out.println("Значение меткости изменилось. Текущее значение - " + getAccuracy());
		} else {
			System.out.println("Значение меткости не может быть отрицательным");
		}
	}
	
	public void setArrowType(String newArrowType) {
		if (newArrowType != null && newArrowType.length() != 0) {
			this.arrowType = newArrowType;
			System.out.println("Тип стрел изменился. Текущий тип - " + getArrowType());
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Name: " + getName() + " | level: " + getLevel() + " | health: " + getHealth() + " | mana: " + getMana() + " | agility: " + getAgility() + " | accuracy: " + getAccuracy() + " | arrowType: " + getArrowType() + " | isAlive: " + getIsAlive());
	}
	
	@Override
	public void useSpecialAbility() {
		System.out.println("Лучник " + getName() + " использовал Прицельный Выстрел");
	}
	
	@Override
	public void attack() {
		System.out.println("Лучник " + getName() + " совершил атаку на противника");
	}
	
	public void attack(String target, double distance) {
		System.out.println("Лучник " + getName() + " атаковал " + target + " на расстоянии " + distance);
	}
}