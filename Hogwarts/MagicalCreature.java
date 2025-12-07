public class MagicalCreature extends Wizard {
	
	protected String creatureType;
	
	public MagicalCreature(String name, int mana, int age, int spellPower, String creatureType) {
		super(name, mana, age, spellPower);
		this.creatureType = creatureType;
	}
	
	public String getCreatureType() {
		return creatureType;
	}
	
	public void setCreatureType(String newCreatureType) {
		this.creatureType = newCreatureType;
	}
	
	public void specialAbility(Wizard target) {
		target.setMana(target.getMana() - this.getSpellPower());
		target.setSpellPower(target.getSpellPower() - this.getSpellPower()/2);
	}
	
	public void specialAbility() {
		System.out.println(getName() + " демонстриет способность");
	}
}