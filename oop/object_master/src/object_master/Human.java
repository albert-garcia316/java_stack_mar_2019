package object_master;

public class Human {
	int health;
	int strength;
	int intelligence;
	int stealth;
	public Human() {
		this.health = 100;
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
	}
	
	public int getHealth() {
		System.out.println("My current health is: " + this.health);
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human target) {
		target.health -= this.strength;
	}
}
