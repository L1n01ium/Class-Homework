public class Dog extends Animal_New implements Runnable {

	public Dog(String name, int age) {
		super(name, age, "Собака");
	}
	
	@Override
	public void run() {
		System.out.println("Собака бежит");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Гав!");
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " перемещается");
	}	
}