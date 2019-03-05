package object_master;

public class Samurai extends Human{
	private static int army = 0;
	public Samurai() {
		super();
		// TODO Auto-generated constructor stub
		this.health = 200;
		army += 1;
		Samurai.howMany();
	}
	public void deathBlow(Human target) {
		target.health = 0;
		this.health -= (this.health/2);
	}
	public void meditate() {
		this.health = 200;
	}
	public static void howMany() {
		System.out.println(army);
	}
//	public int howMany() {
//		return this.army;
//	}
}
