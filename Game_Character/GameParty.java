public class GameParty {
	
	private String partyName;
	private byte cntPartyMembers = 0;
	private GameCharacter[] partyMembers = new GameCharacter[10];
	private static final int MAX_PARTY_SIZE = 10;
	
	public GameParty(String partyName) {
		this.partyName = partyName;
	}
	
	public static void main(String[] args) {
		 GameParty party = new GameParty("Худшие из худших");
        Archer DrowRanger = new Archer("Дровка",25,100,100,false,150,50,"frozen");
        Warrior WraithKing = new Warrior("Король",25,500,100,true, 50,120, "Меч");
        Mage Invoker = new Mage("Маг_целитель",25,100,1000,true,100,120,"Хилящее заклинание");

        party.addCharacter(DrowRanger);
        party.addCharacter(WraithKing);
        party.addCharacter(Invoker);

        party.calculatePartyPower();
        party.useAllSpecialAbilities();

	}
	
	public void addCharacter(GameCharacter character) {
		partyMembers[cntPartyMembers] = character;
		cntPartyMembers++;
		System.out.println("Добавлен персонаж " +  character.getName() + " в пати");
	}
	
	public void removeCharacter(String name) {
		for (int i = 0; i < cntPartyMembers; i++) {
			if (partyMembers[i].getName().equals(name)) {
				System.out.println("Персонаж " + partyMembers[i].getName() + " выгнан из пати");
				for (int j = i; j < cntPartyMembers; j++) {
					partyMembers[j] = partyMembers[j+1];
				}
			}
			cntPartyMembers -= 1;
			return;
		}
		System.out.println("Нет такого персонажа");
	}
	
	public void useAllSpecialAbilities() {
		for (int i = 0; i < cntPartyMembers; i++) {
			partyMembers[i].useSpecialAbility();
		}
	}
	
	public void findCharactersByClass(String className) {
		for (int i = 0; i < cntPartyMembers; i++) {
			if (partyMembers[i].getClass().equals(className)) {
				System.out.println(partyMembers[i].getName());
			}
		}
	}
	
	public void calculatePartyPower() {
		double partyPower = 0.0;
		for (int i = 0; i < cntPartyMembers; i++) {
			if (partyMembers[i] instanceof Warrior) {
				partyPower += ((Warrior) partyMembers[i]).getStrength();
			} else if (partyMembers[i] instanceof Mage) {
				partyPower += ((Mage) partyMembers[i]).getIntelligence();
			} else if (partyMembers[i] instanceof Archer) {
				partyPower += ((Archer) partyMembers[i]).getAgility();
			}
		}
		System.out.println("Общая мощность пати: " + partyPower);
	}
}