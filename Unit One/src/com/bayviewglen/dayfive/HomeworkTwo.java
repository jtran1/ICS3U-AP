package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int y;
		double x;
		
		System.out.print("What is your test out of? ");
		y = keyboard.nextInt();
		System.out.print("Great, what did you get? ");
		x = keyboard.nextInt();
		
		System.out.print("Ok, your percentage is " + x/y*100 +"%");

	}

}