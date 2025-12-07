public class Tomato extends Vegetable {
	
	protected double acidity;
	protected boolean isCherry;
	
	public Tomato(String name, double weight, double fiberContent, double acidity, boolean isCherry) {
		super(name, weight, "красный", fiberContent);
		this.acidity = acidity;
		this.isCherry = isCherry;
	}
	
	public double getAcidity() {
		return acidity;
	}
	
	public boolean getIsCherry() {
		return isCherry;
	}
	
	public void setAcidity(double newAcidity) {
		this.acidity = newAcidity;
	}
	
	public void setIsCherry(boolean newIsCherry) {
		this.isCherry = newIsCherry;
	}
	
	@Override
	public String getInfo() {
		String type = isCherry ? "черри" : "обычный";
		return super.getInfo() + ", тип: " + type + ", кислотность: " + getAcidity();
	}
	
	public boolean isRipe() {
		return color.equals("красный") && acidity > 0.4;
	}
	
	public void makeSauce() {
		System.out.println("Готовим томатный соус из " + name);
	}
}