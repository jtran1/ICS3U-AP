package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		double x;
		
		System.out.println("Please enter a double: ");
		
		x = keyboard.nextDouble();
		
		System.out.println("The value of x is " + x + " and the square of that is " + x*x);
	}

}
