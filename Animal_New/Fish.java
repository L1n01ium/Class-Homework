public class Fish extends Animal_New implements Swimmable {

	public Fish(String name, int age) {
		super(name, age, "Аквариумная рыба");
	}
	
	@Override
	public void swim() {
		System.out.println("Рыбка плывет");
	}
	
	@Override
	public void makeSound() {
		System.out.println("...");
	}
	
	@Override
	public void move() {
		swim();
	}
}