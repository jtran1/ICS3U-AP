package com.bayviewglen.dayfour;

public class HomeworkFive {

	public static void main(String[] args) {
		double y= 3.0,x = 5.5, z = -2.0;
		int i = 5, j = 4, k = 3;
		
		int a = i - j;
		int b = i - a;
		int c = i - b;
		int d = i - c;
		
		System.out.println("the value of d is " + d);
				
		double e = x + a;
		double f = x - y;
		System.out.println("The value of e * f is " + f*e);
		
		int  g = j/k;
		double h = i + g ;
		System.out.println(h);
		
		double m = x/k;
		int o = (int) (m - m);
		System.out.println(o);
		
		double xxx = a - a;
		System.out.println(xxx);
	}

}
