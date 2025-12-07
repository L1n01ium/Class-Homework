public abstract class MusicalInstrument {
	
	protected String name;
	protected String material;
	
	public MusicalInstrument(String name, String material) {
		this.name = name;
		this.material = material;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}
	
	public abstract void playSound();
	
	public String getInstrumentInfo() {
		return getName() + " (материал: " + material + ")";
	}
	
	public void tune() {
		System.out.println("Настраиваем " + name);
	}
}