public class StringInstrument extends MusicalInstrument {
	
	protected int stringCount;
	protected String tuning;
	
	public StringInstrument(String name, String material, int stringCount, String tuning) {
		super(name, material);
		this.stringCount = stringCount;
		this.tuning = tuning;
	}
	
	public int getStringCount() {
		return stringCount;
	}
	
	public String getTuning() {
		return tuning;
	}
	
	public void setStringCount(int newStringCount) {
		this.stringCount = newStringCount;
	}
	
	public void setTuning(String newTuning) {
		this.tuning = newTuning;
	}
	
	@Override
	public void playSound() {
		System.out.println(name + " издает мелодичный струнный звук");
	}
	
	public void changeStrings() {
		System.out.println("Меняем струны на " + name);
	}
	
	public void useBow() {
		System.out.println("Используем смычок для игры на " + name);
	}
}