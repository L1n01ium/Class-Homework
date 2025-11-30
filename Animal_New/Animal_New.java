public abstract class Animal_New {
	
	protected String name;
	protected int age;
	protected final String species;
	
	public Animal_New() {
		this("name", 0, "species");
	}
	
	public Animal_New(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	public abstract void makeSound();
	
	public abstract void move();
	
	public void eat(String food) {
		System.out.println(getName() + " ест " + food);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void sleep() {
		System.out.println(getName() + " спит");
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		if (newAge >= 0) {
			this.age = newAge;
		} else {
			System.out.println("Не");
		}
	}
}