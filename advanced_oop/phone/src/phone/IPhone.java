package phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		return "Zing";
	}

	@Override
	public String unlock() {
		return "Unlocks with Facial Recognition";
	}

}
