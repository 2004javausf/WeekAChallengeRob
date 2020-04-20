package com.revature.weekachallenge;

public class Humanoid {
	
	public Humanoid(String race, int hitPoints, int attack, int defense, int speed) {
		
		this.race=race;
		this.hitPoints=hitPoints;
		this.attack=attack;
		this.defense=defense;
		this.speed=speed;
		
	}
	
	//Humanoid attributes
	private String race;
	private int hitPoints;
	private int attack;
	private int defense;
	private int speed;
	
	//getters and setters
	
	public String getRace() {
		return "Race = " + race;
	}
	
	public void setRace(String race) {
		this.race=race;
	}
	
	public String getHitPoints() {
		return "HP = " + String.valueOf(hitPoints);
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints=hitPoints;
	}
	
	public String getAttack() {
		return "Attack = " + String.valueOf(attack);
	}
	
	public void setAttack(int attack) {
		this.attack=attack;
	}
	
	public String getDefense() {
		return "Defense = " + String.valueOf(defense);
	}
	
	public void setDefense(int defense) {
		this.defense=defense;
	}
	
	public String getSpeed() {
		return "Speed = " + String.valueOf(speed);
	}
	
	public void setWings(int speed) {
		this.speed=speed;
	}
	
}
