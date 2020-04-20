package com.revature.weekachallenge;

public class Beast {
	
	public Beast(String race, int hitPoints, int attack, int defense, int speed) {
		
	}
	
	//Beast attributes
	private String race;
	private int hitPoints = 10;
	private int attack = 8;
	private int defense = 7;
	private int speed = 3;
	
	//getters and setters
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race=race;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints=hitPoints;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack=attack;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public void setDefense(int defense) {
		this.defense=defense;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setWings(int speed) {
		this.speed=speed;
	}
	
}
