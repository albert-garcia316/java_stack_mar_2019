package zoo_keeper2;

public class Mammal {
	int energy;

	public Mammal() {
		this.energy = 100;
	}

	public int getEnergy() {
		System.out.println("Current energy is: " + this.energy);
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
