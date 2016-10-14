package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		double WinPercent, wins, losses;
		
		wins = 110;
		losses = 44;
		
		WinPercent = wins / (wins + losses)*100;
				
		System.out.println("The yankees win percentage is " + (int)(WinPercent*1000)/1000.0);

	}

}
