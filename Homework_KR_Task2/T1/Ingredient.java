public abstract class Ingredient {

	protected String name;
	protected double weight;
	
	public Ingredient(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public abstract double calculateCalories();
	
	public String getInfo() {
		return name + " (" + weight + "g)";
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
}