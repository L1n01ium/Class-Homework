public class DrumKit {
	
	protected String name;
	protected int drumCount;
	protected int cymbalCount;
	
	public DrumKit(String name, int drumCount, int cymbalCount) {
		this.name = name;
		this.drumCount = drumCount;
		this.cymbalCount = cymbalCount;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDrumCount() {
		return drumCount;
	}
	
	public int getCymbalCount() {
		return cymbalCount;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setDrumCount(int newDrumCount) {
		this.drumCount = newDrumCount;
	}
	
	public void setCymbalCount(int newCymbalCount) {
		this.cymbalCount = newCymbalCount;
	}
	
	public void hitDrum(String drumType) {
		System.out.println("Бьем по " + drumType + " на установке " + getName());
	}
	
	public void crashCymbal() {
		System.out.println("Играем на тарелках установки " + getName());
	}
	
	public void tuneDrums() {
		System.out.println("Настраиваем барабаны на установке " + getName());
	}
}