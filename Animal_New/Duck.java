public class Duck extends Animal_New implements Runnable, Swimmable {
	
	public Duck(String name, int age) {
		super(name, age, "Утка");
	}
	
	@Override
	public void run() {
		System.out.println("Уточка бежит");
	}
	
	@Override
	public void swim() {
		System.out.println("Уточка плывет");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Кря!");
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " перемещается");
	}
}