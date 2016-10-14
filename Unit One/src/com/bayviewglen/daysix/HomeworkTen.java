package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		
		double length, width;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length of the rectange");
		length = keyboard.nextDouble();
		System.out.println("What is the width");
		width = keyboard.nextDouble();
		System.out.println("The area of the rectangle is " + width*length);
		System.out.println("The perimeter of the recttangle is " + ((width*2)+(length*2)));
	}

}
