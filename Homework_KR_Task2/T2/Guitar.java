public class Guitar extends StringInstrument {
	
	protected int frets;
	protected String guitarType;
	
	public Guitar(String name, String material, int stringCount, String tuning, int frets, String guitarType) {
		super(name, material, stringCount, tuning);
		this.frets = frets;
		this.guitarType = guitarType;
	}
	
	public int getFrets() {
		return frets;
	}
	
	public String getGuitarType() {
		return guitarType;
	}
	
	public void setFrets(int newFrets) {
		this.frets = newFrets;
	}
	
	public void setGuitarType(String newGuitarType) {
		this.guitarType = newGuitarType;
	}
	
	@Override
	public void playSound() {
		System.out.println(name + " издает яркий гитарный звук");
	}
	
	@Override
	public String getInstrumentInfo() {
		return super.getInstrumentInfo() + ", тип: " + getGuitarType() + ", ладов: " + getFrets() + ", струн: " + stringCount;
	}
	
	public void strum() {
		System.out.println("Бренчим на гитаре " + name);
	}
	
	public void playChord(String chord) {
		System.out.println("Играем аккорд " + chord + " на гитаре");
	}
}