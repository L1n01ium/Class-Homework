public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Dog("Локи", 3, "Той-Пудель");
		Animal animal2 = new Bird("Попугай", 2, true);
		Animal[] zoo = {
			animal1,
			animal2,
			new Cat("Маркиза", 15, 0)
		};
		for (int i = 0; i < zoo.length; i++) {
			if (zoo[i] instanceof Cat) {
				Cat cat1 = (Cat) zoo[i];
				cat1.climbTree();
				System.out.println("-----------------------");
			} else if (zoo[i] instanceof Dog) {
				Dog dog1 = (Dog) zoo[i];
				System.out.println(dog1.getBreed());
				System.out.println("-----------------------");
			} else if (zoo[i] instanceof Bird) {
				Bird bird1 = (Bird) zoo[i];
				bird1.fly();
				System.out.println("-----------------------");
			}
		}
	}
}