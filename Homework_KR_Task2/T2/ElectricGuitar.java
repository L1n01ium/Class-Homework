public class ElectricGuitar extends Guitar {
	
	protected int volumeLevel;
	protected boolean hasDistortion;
	
	public ElectricGuitar(String name, String material, int stringCount, String tuning, int frets, int volumeLevel, boolean hasDistortion) {
		super(name, material, stringCount, tuning, frets, "Электрогитара");
		this.volumeLevel = volumeLevel;
		this.hasDistortion = hasDistortion;
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	
	public boolean getHasDistortion() {
		return hasDistortion;
	}
	
	public void setVolumeLevel(int newVolumeLevel) {
		this.volumeLevel = newVolumeLevel;
	}
	
	public void setHasDistortion(boolean newHasDistortion) {
		this.hasDistortion = newHasDistortion;
	}
	
	@Override
	public void playSound() {
		if (getHasDistortion()) {
			System.out.println(name + " издает мощный искаженный звук");
		} else {
			System.out.println(name + " издает чистый электронный звук");
		}
	}
	
	@Override
	public String getInstrumentInfo() {
		return super.getInstrumentInfo() + ", уровень громкости: " + getVolumeLevel() + ", дисторшен: " + (getHasDistortion() ? "есть" : "нет");
	}

	public void connerctToAmp() {
		System.out.println("Подключаем электрогитару " + name + " к усилителям");
	}
	
	public void adjustVolume(int newLevel) {
		volumeLevel = newLevel;
		System.out.println("Устанавливаем громкость на уровень " + volumeLevel);
	}
}