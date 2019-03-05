package object_master;

public class Ninja extends Human{

	public Ninja() {
		super();
		this.stealth = 10;
	}
	public void steal(Human target) {
		target.health -= this.stealth;
		this.health += this.stealth;
	}
	public void disappear() {
		this.health -= 10;
	}
	
}
