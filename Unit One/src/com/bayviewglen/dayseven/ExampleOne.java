/*
 * Compute and print the number of minutes in a year - Using Constants.
 */

package com.bayviewglen.dayseven;

public class ExampleOne {
	
	// We will declare all of our constants outside of the main as static final
	// final makes it a constant
	// static we will learn about another day
	
	// both of the words static and final are referred to as modifiers.
	
	// The naming convention for constants is all UPPER_CASE_WITH_UNDERSCORES_TO_SEPERATE_WORDS
	static final int MINUTES_PER_HOUR = 60;
	static final int HOURS_PER_DAY = 24;
	static final int DAYS_PER_YEAR = 365;
	
	public static void main(String[] args) {
		
		int minutesPerYear = DAYS_PER_YEAR * HOURS_PER_DAY * MINUTES_PER_HOUR;
		
		System.out.println("The number of minutes in a year is " + minutesPerYear);
		
	
		final int SECONDS_PER_MINUTES = 60;
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;
		final int DAYS_PER_YEAR = 365;
		
		final int SECONDS_PER_YEAR = SECONDS_PER_MINUTES*MINUTES_PER_HOUR*HOURS_PER_DAY*DAYS_PER_YEAR;
		System.out.println("The number of seconds in a year is (wait for it...):" + SECONDS_PER_YEAR);
	
		double radius = 4.20;

	}

}