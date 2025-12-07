public class Spice extends Ingredient {
	
	protected String origin;
	protected int spicinessLevel;
	
	public Spice(String name, double weight, String origin, int spicinessLevel) {
		super(name, weight);
		this.origin = origin;
		this.spicinessLevel = spicinessLevel;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public int getSpicinessLevel() {
		return spicinessLevel;
	}
	
	public void setOrigin(String newOrigin) {
		this.origin = newOrigin;
	}
	
	public void setSpicinessLevel(int newSpicinessLevel) {
		this.spicinessLevel = newSpicinessLevel;
	}
	
	@Override
	public double calculateCalories() {
		return (weight / 100) * 5;
	}
	
	public void grind() {
		System.out.println("Измельчаем " + name);
	}
	
	public boolean isVerySpicy() {
		return spicinessLevel > 7;
	}
}