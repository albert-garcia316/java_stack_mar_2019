package zoo_keeper2;

public class Bat extends Mammal {
	public Bat() {
		this.energy = 300;
	}
	public void fly() {
		System.out.println("Woop! Woop! Woop!");
		this.energy -= 50;
	}
	public void eatHumans() {
		System.out.println("Gulp");
		this.energy += 25;
	}
	public void attackCity() {
		System.out.println("Ahhh! the town is under seige!!!");
		this.energy -= 100;
	}
}
