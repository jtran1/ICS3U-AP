package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Please enter a five digit number! ");
		x = keyboard.nextInt();
		
		y = x/1000%10;
		z = x/10%10;
		
		System.out.println("The product of the second and fifth digits is " + y*z);
	}

}
