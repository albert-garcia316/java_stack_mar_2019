package phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Ring Ring Ring!";
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocks with Firgerprint scan";
	}

}
