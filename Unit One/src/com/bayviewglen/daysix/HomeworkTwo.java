package com.bayviewglen.daysix;

public class HomeworkTwo {

	public static void main(String[] args) {
	double x, y, area, perimeter, round;
	x = 4.5;
	y = 2.3;
	
	area = x*y;
	perimeter = x*2 + y*2;
	
	round = (int)(area*10);
	double aFinal= round/10; 
	
	System.out.println("The area is " + aFinal);
	System.out.println("The perimeter " + perimeter);
	}

}
