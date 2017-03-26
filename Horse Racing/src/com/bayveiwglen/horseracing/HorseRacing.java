package com.bayveiwglen.horseracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HorseRacing {

	static int[] playerBetHorse;
	static int[] playerBetAmount;
	public static void main(String[] args) throws InterruptedException {
		introMessage();
		String[] horses = getHorses();
		String[] playerNames = getPlayerNames();
		int[] playerWallets = getPlayersWallets(playerNames);
		
		boolean gameOver = true;
		while (gameOver) {
			doRace(horses, playerNames, playerWallets);
			gameOver = promptForGameOver();
		
		updatePlayerData(playerNames, playerWallets);
		}
		closingMessage();
	}
//displaying goodbye message
	private static void closingMessage() {
		System.out.println("Thank you for playing Horse Racing!");

	}
//displaying welcoming message
	private static void introMessage() {
		System.out.println("Welcome to Horse Racing!");

	}

	private static void updatePlayerData(String[] playerNames, int[] playerWallets) {
		// TODO Auto-generated method stub
		
		  try{ 
			  PrintWriter writer = new PrintWriter(("input/player.dat"));
			  writer.println(playerNames.length);
		  for(int i=0; i<playerNames.length;i++){
			  writer.println(playerNames[i] + " " + playerWallets[i]);
		  }writer.close();
		  //(String s : words){ fw.write(s); } fw.close(); 
		  } 
		  catch (IOException
		  e){
		  
		  e.printStackTrace(); }
		  
	}
	

	// Checking if the player would like to stop playing.
	private static boolean promptForGameOver() {
		Scanner scanner = new Scanner(System.in);
		boolean gameEndValid = true;
		String keepPlaying = "";
		while (gameEndValid) {
			System.out.println("Do you want to keep playing, type 1 to keep playing, type 2 to exit.");
			keepPlaying = scanner.nextLine();
			if (keepPlaying.equals("1") || keepPlaying.equals("2"))
				gameEndValid = false;
			else {
				System.out.println("Please enter either 1 or 2.");
			}

		}
		if (keepPlaying.equals("1"))
			return true;
		else
			return false;
	}

	private static void doRace(String[] horses, String[] playerNames, int[] playerWallets) throws InterruptedException {
		// horsesInRace contains the index of the horses from the master horse
		// array
		int[] horsesInRace = getHorsesInRace(horses);

		// 2D array with col0 = betAMT and col1 = horseIndex(from horsesInRace)
		int [][] playerBets = getPlayerBets(playerNames, playerWallets, horsesInRace, horses);
		int winningHorse = startRace(horsesInRace);
		System.out.println(horses[horsesInRace[winningHorse-1]] + " is the winner!!!");
		payOutBets(playerBets, playerWallets, playerNames, winningHorse);
	}

	private static void payOutBets(int[][] playerBets, int[] playerWallets, String[] playerNames, int winningHorse) {
		// TODO Auto-generated method stub
		for(int i=0; i<playerNames.length; i++){
			if(playerBets[i][0]==winningHorse){
				System.out.println("Congratulations " + playerNames[i] + ", you have won " + playerBets[i][1]+ " dollars!");
				playerWallets[i]=playerWallets[i] + playerBets[i][1];
			}else {
				System.out.println("Sorry " + playerNames[i] +", you have lost " + playerBets[i][1] + " dollars. Please try again.");
				playerWallets[i]=playerWallets[i]-playerBets[i][1];
			}
		}

	}

	private static int startRace(int[] horsesInRace) throws InterruptedException {
	int winningHorse = 0;
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("1 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("2 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("3 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("4 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("5 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("6 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("7 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("8 |                                                                                                                     |");
	System.out.println("------------------------------------------------------------------------------------------------------------------------|");
		for(int i=0; i<3; i++){
			if (i==0){
				Thread.sleep(1000);
				System.out.println("Ready");
			}
			if (i==1){
				Thread.sleep(1000);
				System.out.println("Get Set");
			}
			if (i==2){
				Thread.sleep(1000);
				System.out.println("GO!");
			}
		}
		boolean raceRunning = true;
		String horseOneDistance = "";
		String horseTwoDistance = "";
		String horseThreeDistance = "";
		String horseFourDistance = "";
		String horseFiveDistance = "";
		String horseSixDistance = "";
		String horseSevenDistance = "";
		String horseEightDistance = "";
		int horseOneStride= 0;
		int horseTwoStride = 0;
		int horseThreeStride = 0;
		int horseFourStride = 0;
		int horseFiveStride = 0;
		int horseSixStride = 0;
		int horseSevenStride = 0;
		int horseEightStride = 0;
		while(raceRunning){
			for (int j = 0; j<30; j++){
				System.out.println("");
			}
			horseOneStride= (int)(Math.random()*5+1);
			horseTwoStride = (int)(Math.random()*5+1);
			horseThreeStride = (int)(Math.random()*5+1);
			horseFourStride = (int)(Math.random()*5+1);
			horseFiveStride = (int)(Math.random()*5+1);
			horseSixStride = (int)(Math.random()*5+1);
			horseSevenStride = (int)(Math.random()*5+1);
			horseEightStride = (int)(Math.random()*5+1);
			for(int i=0; i<horseOneStride; i++){
				horseOneDistance += " ";
			}
			for(int i=0; i<horseTwoStride; i++){
				horseTwoDistance += " ";
			}
			for(int i=0; i<horseThreeStride; i++){
				horseThreeDistance += " ";
			}
			for(int i=0; i<horseFourStride; i++){
				horseFourDistance += " ";
			}
			for(int i=0; i<horseFiveStride; i++){
				horseFiveDistance += " ";
			}
			for(int i=0; i<horseSixStride; i++){
				horseSixDistance += " ";
			}
			for(int i=0; i<horseSevenStride; i++){
				horseSevenDistance += " ";
			}
			for(int i=0; i<horseEightStride; i++){
				horseEightDistance += " ";
			}
			
			//Displaying and checking to see if the race is done
			Thread.sleep(1000);
			System.out.println("------------------------------------------------------------------------------------------------------------------------F|");
			System.out.println(horseOneDistance + "1");
			if(horseOneDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 1;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------I|");
			System.out.println(horseTwoDistance + "2");
			if(horseTwoDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 2;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------N|");
			System.out.println(horseThreeDistance + "3");
			if(horseThreeDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 3;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------I|");
			System.out.println(horseFourDistance + "4");
			if(horseFourDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 4;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------S|");
			System.out.println(horseFiveDistance + "5");
			if(horseFiveDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 5;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------H|");
			System.out.println(horseSixDistance + "6");
			if(horseSixDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 6;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------L|");
			System.out.println(horseSevenDistance + "7");
			if(horseSevenDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 7;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------N|");
			System.out.println(horseEightDistance + "8");
			if(horseEightDistance.length()>=121 ){
				raceRunning = false;
				winningHorse = 8;
			}
			System.out.println("-------------------------------------------------------------------------------------------------------------------------|");
			//System.out.printf("\n%30s", );
		}
		
		return winningHorse;
	}

	private static int[][] getPlayerBets(String[] playerNames, int[] playerWallets, int[] horsesInRace, String[] horses) {
		// Getting player bets
		Scanner scanner = new Scanner(System.in);
		int[][] playerBets = new int[playerNames.length][playerNames.length];
		for(int j = 0; j<8; j++){
			System.out.println(j+1 +":" + horses[horsesInRace[j]]);
		}
		//for (int j=0; j<2; j++){
			for(int i = 0; i<playerNames.length; i++){
				System.out.println(playerNames[i]+ " which horse would you like to bet on?(select a horse by number)");
				String x = scanner.nextLine();
				if(x.length()<1){
					System.out.println("Type in a number!");
				i--;
				}
				else if ((x.charAt(0)!='0'&&x.charAt(0)!='1'&&x.charAt(0)!='2'&&x.charAt(0)!='3'&&x.charAt(0)!='4'&&x.charAt(0)!='5'&&x.charAt(0)!='6'&&x.charAt(0)!='7'&&x.charAt(0)!='8'&&x.charAt(0)!='9')){
					System.out.println("Type in a number!");
					i--;
			}
				else if(Integer.parseInt(x)<9&&Integer.parseInt(x)>0){
					playerBets[i][0] = Integer.parseInt(x);
					System.out.println("And how much would you like to bet " + playerNames[i]);

					boolean Valid = true;
					while (Valid){
						String y = scanner.nextLine();
						if(y.equals(""))//|y.charAt(0)!='0'|y.charAt(0)!='1'|y.charAt(0)!='2'|y.charAt(0)!='3'|y.charAt(0)!='4'|y.charAt(0)!='5'
								//|y.charAt(0)!='6'|y.charAt(0)!='7'|y.charAt(0)!='8'|y.charAt(0)!='9')
								{ 
							System.out.println("Type in a number!") ;
						}
						else if ((y.charAt(0)!='0'&&y.charAt(0)!='1'&&y.charAt(0)!='2'&&y.charAt(0)!='3'&&y.charAt(0)!='4'&&y.charAt(0)!='5'&&y.charAt(0)!='6'&&y.charAt(0)!='7'&&y.charAt(0)!='8'&&y.charAt(0)!='9')){
							System.out.println("Type in a number!");
		
					}
						else if(Integer.parseInt(y)<=playerWallets[i]&&Integer.parseInt(y)>=0){
							playerBets[i][1] = Integer.parseInt(y);
							Valid = false;

						}
						else{
							System.out.println("Pick a valid horse!");
							i--;
						}
					}
				}else {
					System.out.println("Pick a valid horse!");
					i--;
				}
				
				

			}
			return playerBets;
		//}
	}

	private static int[] getHorsesInRace(String[] horses) {
		// putting horses into the race from dat file
		int[] horsesInRace = new int[8];
		int i = 0;
		while (i < 8) {
			horsesInRace[i] = (int) (Math.random() * 86 + 1);
			if (alreadyInRace(horsesInRace[i], horsesInRace)== true)
				;

			else {
				i++;
			}
		}

		return horsesInRace;
	}

	private static int[] getPlayersWallets(String [] playerNames) {
		// TODO Auto-generated method stub
		int[] playerWallet = new int[playerNames.length];
		String[] playerWalletAndName = new String[playerNames.length] ;

		try {
			Scanner scanner = new Scanner(new File("input/player.dat"));
			int numPlayers = Integer.parseInt(scanner.nextLine());
		//	String[] playerWalletAndName = new String[numPlayers] ;
			//int[] playerWallet = new int[numPlayers];
			for (int i = 0; i < numPlayers; i++) {
				playerWalletAndName[i] = scanner.nextLine();
				playerWallet[i] = Integer.parseInt(playerWalletAndName[i].split(" ")[1]);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return playerWallet;
	}
//reads player names from a file - names and wallet amount separated
	private static String[] getPlayerNames() {
		// gets player names from dat file to put into race
		// int runner1minutes2 = Integer.parseInt(runner1time2.split(":")[0]);
		String[] playerNames = new String[0];
		try {
			Scanner scanner = new Scanner(new File("input/player.dat"));
			int numPlayers = Integer.parseInt(scanner.nextLine());
			playerNames = new String[numPlayers];

			for (int i = 0; i < numPlayers; i++) {
				playerNames[i] = scanner.nextLine();
				playerNames[i] = playerNames[i].split(" ")[0];
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return playerNames;

	}

	/*
	 * Reads the horses from a file assume the file exists and is in the format
	 * specified in the assignment.
	 */
	public static String[] getHorses() {
		String[] horses = new String[1];
		try {
			Scanner scanner = new Scanner(new File("input/horses.dat"));
			int numHorses = Integer.parseInt(scanner.nextLine());
			horses = new String[numHorses];

			for (int i = 0; i < numHorses; i++) {
				horses[i] = scanner.nextLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return horses;
	}

	/*
	 * Check if a horse is already in the race - uses a modified search method
	 */
	public static boolean alreadyInRace(int horse, int[] horsesInRace) {
		if (horsesInRace.length<1){
		for (int j=horsesInRace.length-1; j>0; j--)
	//	for (int i = j-1; i>0; i--) {
			if (horsesInRace[j] == horse) {
				return true;
			}
		}

		return false;
	}

}
