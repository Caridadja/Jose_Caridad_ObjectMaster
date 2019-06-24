package com.object_master;

public class Samurai extends Human {
	private static int counter;
	public Samurai() {
		this.health = 200;
		counter++;
	}
	public Samurai deathBlow(Human target) {
		target.health = 0;
		this.health /= 2;
		return this;
	}
	public Samurai meditate() {
		this.health *= 1.5;
		return this;
	}
	public int howMany() {
		System.out.println(counter);
		return counter;
	}
}
