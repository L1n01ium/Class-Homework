public class Bird extends Animal {
	
	private boolean canFly;
	
	public Bird(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	
	public void fly() {
		if (getCanFly()) {
			System.out.println("Может летать");
		} else {
			System.out.println("Не может летать");
		}
	}
	
	@Override
	public void makeSound() {
		System.out.println("Чик-чикрик");
	}
}