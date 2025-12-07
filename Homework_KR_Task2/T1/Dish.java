public class Dish {
	
	protected String name;
	protected int cookingTime;
	protected Ingredient[] ingredients;
	protected int ingredientCount;
	
	public Dish(String name, int cookingTime) {
		this.name = name;
		this.cookingTime = cookingTime;
		this.ingredients = new Ingredient[10];
		this.ingredientCount = 0;
	}
	
	public void addIngredient(Ingredient ingredient) {
		if (ingredientCount < ingredients.length) {
			ingredients[ingredientCount] = ingredient;
			ingredientCount++;
		} else {
			System.out.println("Невозможно добавить больше ингридиентов в блюдо");
		}
	}
	
	public double calculateTotalCalories() {
		double total = 0;
		for (int i = 0; i < ingredientCount; i++) {
			total += ingredients[i].calculateCalories();
		}
		return total;
	}
	
	public void listIngredients() {
		System.out.println("Ингридиенты для блюда '" + getName() + "': ");
		for (int i = 0; i < ingredientCount; i++) {
			System.out.println("- " + ingredients[i].getInfo());
		}
	}
	
	public void startCooking() {
		System.out.println("Начинаем готовить " + getName());
		System.out.println("Время приготовления: " + getCookingTime() + " минут");
	}
	
	public String getName() {
		return name;
	}
	
	public int getCookingTime() {
		return cookingTime;
	}
}