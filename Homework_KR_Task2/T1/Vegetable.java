public class Vegetable extends Ingredient {
	
	protected String color;
	protected double fiberContent;
	
	public Vegetable(String name, double weight, String color, double fiberContent) {
		super(name, weight);
		this.color = color;
		this.fiberContent = fiberContent;
	}
	
	@Override
	public double calculateCalories() {
		return (weight / 100) * 25;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getFiberContent() {
		return fiberContent;
	}
	
	public void chop() {
		System.out.println("Нарезаем " + name + " на кусочки");
	}
}