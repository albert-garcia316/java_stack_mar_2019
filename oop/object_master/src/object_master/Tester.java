package object_master;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a = new Human();
		Human b = new Human();
		a.attack(b);
		b.getHealth();
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai.howMany();
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		w.heal(w);
		w.getHealth();
		w.fireBall(n);
		n.getHealth();
		n.steal(w);
		w.getHealth();
		n.getHealth();
		s1.deathBlow(n);
		n.getHealth();
		s1.getHealth();
		s1.meditate();
		s1.getHealth();
	}

}
