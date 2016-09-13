package com.bayviewglen.daythree;

public class Homework6 {

	public static void main(String[] args) {
		double root1,root2,a,b,c;
		a = 3;
		b = 30;
		c = 1;
		
		root1 = (-b + Math.sqrt(b*b-4*a*c)/2*a);
		root2 = (-b - Math.sqrt(b*b-4*a*c)/2*a);

		System.out.println("the roots are " + root1 + " and " + root2);
		
	}

}
