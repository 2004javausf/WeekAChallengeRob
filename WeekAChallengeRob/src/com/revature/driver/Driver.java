package com.revature.driver;

import java.util.Scanner;

import com.revature.weekachallenge.Beast;

import com.revature.weekachallenge.Humanoid;

public class Driver {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String answer;
		System.out.println("Beast or Humanoid?");
		answer = sc.nextLine();
		
		if (answer.equals("Beast")) {
		
		Beast b = new Beast("Golem", 10, 5, 8, 2);
		System.out.println(b.getRace());
		System.out.println(b.getHitPoints());
		System.out.println(b.getAttack());
		System.out.println(b.getDefense());
		System.out.println(b.getSpeed());
		}
		
		else if	(answer.equals("Humanoid")) {
		
		Humanoid h = new Humanoid("Elf", 6, 7, 4, 7);
		System.out.println(h.getRace());
		System.out.println(h.getHitPoints());
		System.out.println(h.getAttack());
		System.out.println(h.getDefense());
		System.out.println(h.getSpeed());
		}
		
		else {
			System.out.println("Please don't");
		}
		
	}
		
		

}
