public class Main {
	public static void main(String[] args) {
		GameCharacter warrior = new Warrior("Alex", 34, 367.5, 100.0, true, 133.7, 35.5, "cutting");
		GameCharacter[] squad = {
			warrior
		};
		for (int i = 0; i < squad.length; i++) {
			if (squad[i] instanceof Warrior) {
				Warrior warrior1 = (Warrior) squad[i];
				warrior1.displayInfo();
				warrior1.useSpecialAbility();
				warrior1.attack("sword");
			}
		}
	}
}