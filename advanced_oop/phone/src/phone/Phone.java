package phone;

public abstract class Phone {
	private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public void displayInfo() {
    	System.out.println(
    			"Version number: " + this.versionNumber + "\n" +
				"Battery Percentage: " + this.batteryPercentage + "\n" +
				"Carrier: " + this.carrier + "\n" +
				"Ringtone: " + this.ringTone
    			);
    }
}
