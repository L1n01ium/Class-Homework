public class Warrior extends GameCharacter {
	
	private double strength;
	private double armor;
	private String weaponType;
	
	public Warrior(String name, int level, double health, double mana, boolean isAlive, double strength, double armor, String weaponType) {
		super(name, level, health, mana, isAlive);
		this.strength = strength;
		this.armor = armor;
		this.weaponType = weaponType;
	}
	
	public double getStrength() {
		return strength;
	}
	
	public double getArmor() {
		return armor;
	}
	
	public String getWeaponType() {
		return weaponType;
	}
	
	public void setStrength(double newStrength) {
		if (newStrength >= 0.0) {
			this.strength = newStrength;
			System.out.println("Значение силы изменилось. Новое значение силы: " + getStrength());
		} else {
			System.out.println("Сила не может быть отрицательна");
		}
	}
	
	public void setArmor(double newArmor) {
		if (newArmor >= 0.0) {
			this.armor = newArmor;
			System.out.println("Значение брони изменилось. Новое значение брони: " + getArmor());
		} else {
			System.out.println("Броня не может быть отрицательна");
		}
	}
	
	public void setWeaponType(String newWeaponType) {
		if (newWeaponType != null && newWeaponType.length() != 0) {
			this.weaponType = newWeaponType;
			System.out.println("Вы поменяли тип вашего оружия, текущий тип: " + getWeaponType());
		} else {
			System.out.println("Некоректный тип");
		}
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Name: " + getName() + " | level: " + getLevel() + " | health: " + getHealth() + " | mana: " + getMana() + " | strength: " + getStrength() + " | armor: " + getArmor() + " | weaponType: " + getWeaponType() + " | isAlive: " + getIsAlive());
	}
	
	@Override
	public void useSpecialAbility() {
		System.out.println(getName() + " использовал специальную способность Берсерк");
	}
	
	@Override
	public void attack() {
		System.out.println("Воин " + getName() + " совершил атаку на противника");
	}
	
	public void attack(String weapon) {
		System.out.println("Воин " + getName() + " совершил атаку на противника оружием: " + weapon);
	}
}