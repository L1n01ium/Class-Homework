public class Meat extends Ingredient {
	
	protected String type;
	protected double fatContent;
	
	public Meat(String name, double weight, String type, double fatContent) {
		super(name, weight);
		this.type = type;
		this.fatContent = fatContent;
	}
	
	public String getType() {
		return type;
	}
	
	public double getFatContent() {
		return fatContent;
	}
	
	public void setType(String newType) {
		this.type = newType;
	}
	
	public void setFatContent(double newFatContent) {
		this.fatContent = newFatContent;
	}
	
	@Override
	public double calculateCalories() {
		return (weight / 100) * (getFatContent() * 9 + (100 - getFatContent()) * 4);
	}
	
	public void marinate() {
		System.out.println("Маринуем " + name + " на 2 часа");
	}
}