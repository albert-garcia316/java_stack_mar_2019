package zoo_keeper1;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	public void throwThings() {
		System.out.println("Gorilla threw a coconut");
		this.energy -= 5;
	}
	public void eatBanana() {
		System.out.println("Gorilla enjoys a delicious banana");
		this.energy += 10;
	}
	public void climb() {
		System.out.println("Gorilla climbed the tree");
		this.energy -= 10;
	}
}
