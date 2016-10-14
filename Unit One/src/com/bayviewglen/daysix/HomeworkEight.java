package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		
		double x;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("put in a postive number");
		
		x = keyboard.nextDouble();
		
		System.out.println("ok, here is the square root of your number " + Math.sqrt(x));
		System.out.println("And here is your square of your number " + x*x);
	}

}
