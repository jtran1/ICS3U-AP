package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int vf, a, t, vi;
		
		System.out.println("Please enter the Velocity inital. ");
		vi = keyboard.nextInt();
		
		System.out.println("Now eneter the acceleration");
		a = keyboard.nextInt();
		
		System.out.println("Now enter the time");
		t = keyboard.nextInt();
		
		System.out.println("The final velocity is " + (vi+a*t)+ "m/s");
		
	}

}
