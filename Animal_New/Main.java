public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Шарик", 4);
		Fish fish = new Fish("Дори", 1);
		Duck duck = new Duck("Дональд", 2);
		
		System.out.println("== Dog ==");
		dog.makeSound();
		dog.sleep();
		dog.run();
		dog.eat("Кость");
		System.out.println("Макс. скорость - " + dog.getMaxSpeed());
		
		System.out.println("== Fish ==");
		fish.makeSound();
		fish.sleep();
		fish.swim();
		fish.eat("Корм");
		
		System.out.println("== Duck ==");
		duck.makeSound();
		duck.sleep();
		duck.run();
		duck.swim();
		duck.eat("Хлеб");
		System.out.println("Макс. скорость - " + duck.getMaxSpeed());
	}
}