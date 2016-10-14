package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		
		double m, v, KE;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the mass");
		m = keyboard.nextDouble();
		System.out.println("What is the velocity");
		v = keyboard.nextDouble();
		KE = 0.5*m*(v*v);
		System.out.println("The kinetic energy is " + KE + " Joules");

	}

}
