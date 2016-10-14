package com.bayviewglen.dayone;

import java.util.Scanner;

public class ASCIIhomework {

	public static void main(String[] args) {
		int x, y,z;
		final int HUNDRED = 100;
		final int DICE = 6;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println((int)(Math.random()*HUNDRED+1));
		
		System.out.println((int)(Math.random()*HUNDRED-50));
		System.out.println("Please enter a number");
		x = keyboard.nextInt();
		System.out.println("please eneter another number");
		y = keyboard.nextInt();
		z = x-y;
		System.out.println((int)(Math.random()*z+y));
		System.out.println("Your rolled a six sided dice and got " + (int)(Math.random()*DICE+1));
		System.out.println("Please enter a word");
		String word = keyboard.next();
		System.out.println("A character in that word is " + word.charAt(((int)Math.random()*word.length())));
		System.out.println("Here is a random uppercase letter " + (char)(Math.random()*25+65));
		System.out.println("Here is a random lowwercase letter " + (char)(Math.random()*25+97));

	}

}
