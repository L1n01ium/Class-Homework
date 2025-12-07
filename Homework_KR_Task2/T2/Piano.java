public class Piano extends MusicalInstrument {

	protected int keysCount;
	protected boolean isGrand;
	
	public Piano(String name, String material, int keysCount, boolean isGrand) {
		super(name, material);
		this.keysCount = keysCount;
		this.isGrand = isGrand;
	}
	
	public int getKeysCount() {
		return keysCount;
	}
	
	public boolean getIsGrand() {
		return isGrand;
	}
	
	public void setKeysCount(int newKeysCount) {
		this.keysCount = newKeysCount;
	}
	
	public void setIsGuard(boolean newIsGrand) {
		this.isGrand = newIsGrand;
	}
	
	@Override
	public void playSound() {
		System.out.println(name + " издает богатый фортепианный звук");
	}
	
	public void pressKey(String note) {
		System.out.println("Нажимаем клавишу " + note + " на фортепиано");
	}
	
	public void usePedal(String pedal) {
		System.out.println("Используем педаль " + pedal + " на фортепиано");
	}
}