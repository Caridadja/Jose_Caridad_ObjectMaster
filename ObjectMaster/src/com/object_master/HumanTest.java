package com.object_master;

public class HumanTest {
	public static void main(String[] args) {
		Samurai s = new Samurai();
		Ninja n = new Ninja();
		Wizard w = new Wizard();
		Samurai s2 = new Samurai();
		Samurai s3 = new Samurai();
		n.attack(s);
		s.displayHealth();
		w.fireball(n);
		w.heal(w);
		n.displayHealth();
		s3.deathBlow(w);
		n.runAway();
		n.steal(s);
		s.meditate();
		s2.meditate();
		s3.howMany();
		s.displayHealth();
		n.displayHealth();
		w.displayHealth();
		s2.displayHealth();
		s3.displayHealth();
		
		
	}
}
