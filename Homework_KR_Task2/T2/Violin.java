class Violin extends StringInstrument {
    private String size; 
    private boolean hasChinRest; 
    
    public Violin(String name, String material, int stringCount, String tuning, String size, boolean hasChinRest) {
        super(name, material, stringCount, tuning);
        this.size = size;
        this.hasChinRest = hasChinRest;
    }
    
    @Override
    public void playSound() {
        System.out.println(name + " издает нежный скрипичный звук");
    }
    
    @Override
    public void useBow() {
        System.out.println("Плавно ведем смычком по струнам скрипки " + name);
    }
    
    public void changeFingerPosition(String position) {
        System.out.println("Меняем позицию пальцев на " + position + " на скрипке");
    }
    
    public String getSize() {
        return size;
    }
    
    public boolean getHasChinRest() {
        return hasChinRest;
    }
}