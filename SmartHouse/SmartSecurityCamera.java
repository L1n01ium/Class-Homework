public class SmartSecurityCamera extends SmartDevice {
	
	private boolean isRecording;
	private boolean motionDetection;
	private String videoQuality;
	
	public SmartSecurityCamera(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, boolean isRecording, boolean motionDetection, String videoQuality) {
		super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
		this.isRecording = isRecording;
		this.motionDetection = motionDetection;
		this.videoQuality = videoQuality;
	}
	
	public boolean getIsRecording() {
		return isRecording;
	}
	
	public boolean getMotionDetection() {
		return motionDetection;
	}
	
	public String getVideoQuality() {
		return videoQuality;
	}
	
	public void setIsRecording(boolean newIsRecording) {
		this.isRecording = newIsRecording;
	}
	
	public void setMotionDetection(boolean newMotionDetection) {
		this.motionDetection = newMotionDetection;
	}
	
	public void setVideoQuality(String newVideoQuality) {
		if (newVideoQuality != null && newVideoQuality.length() != 0) {
			this.videoQuality = newVideoQuality;
			System.out.println("Качество видео изменено на " + getVideoQuality());
		} else {
			System.out.println("Неверный формат");
		}
	}
	
	@Override
	public String getDeviceType() {
		return "Умная камера";
	}
	
	@Override
	public void performAction() {
		System.out.println("начинает/останавливает запись");
	}
	
	public void startRecording() {
		if (getIsRecording()) {
			System.out.println("Запись уже запущена");
		} else {
			setIsRecording(true);
			System.out.println("Запись начата");
		}
	}
	
	public void startRecording(boolean motionDetection) {
		if (getIsRecording() && getMotionDetection()) {
			System.out.println("Запись с настройкой обнаружения движения уже запущена");
		} else if (getIsRecording() && getMotionDetection() == false) {
			setMotionDetection(true);
			System.out.println("Запись с настройкой обнаружения движения запущена");
		} else {
			setIsRecording(true);
			setMotionDetection(true);
			System.out.println("Запись запущена, настройка обнаружения движения запущена");
		}
	}
	
	public void detectMotion() {
		System.out.println("Обнаружено движение");
	}
	
	public void getLiveFeed() {
		if (getIsRecording()) {
			System.out.println("Получена прямая трансляция");
		} else {
			System.out.println("Невозможно получить прямую трансляцию, т.к запись не запущена");
		}
	}
}