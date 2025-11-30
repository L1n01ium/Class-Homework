public class Cat extends Animal {
	
	private int lives;
	
	public Cat(String name, int age, int lives) {
		super(name, age);
		this.lives = lives;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Мяу");
	}
	
	public void climbTree() {
		System.out.println(getName() + " издает звук");
	}
}