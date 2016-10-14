package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x;
		System.out.println("How many items were sold");
		
		x = keyboard.nextInt();
		
		System.out.println("The salespeople will get $" + x*0.27 );

	}

}
