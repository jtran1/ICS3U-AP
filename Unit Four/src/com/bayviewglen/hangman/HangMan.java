package com.bayviewglen.hangman;

import java.util.Scanner;

public class HangMan {
	static final String ACCEPTED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
	static final String ACCEPTED_CHARACTERS_NOSPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello player 1, please enter your name!");
		String playerOne = scanner.nextLine();
		System.out.println("Player 2, please enter your name!");
		String playerTwo = scanner.nextLine();

		int playerOneScore = 0;
		int playerTwoScore = 0;
		int rounds = 0;
		int maxRounds = 5;

		for (int i = 0; i < maxRounds; i++) {
			for (int j = 1; j < 3; j++) {
				if (j % 2 != 0) {
					System.out.println(playerOne + " enter the phrase you want " + playerTwo
							+ " to guess. Use only alpha-nuemeric characters.");
					String phraseOnePlayerOne = scanner.nextLine().toUpperCase();
					for (int k = 0; k < phraseOnePlayerOne.length(); k++) {
						char check = phraseOnePlayerOne.charAt(k);
						if (ACCEPTED_CHARACTERS.indexOf(check) != -1) {
							for (int l = 0; l < phraseOnePlayerOne.length(); l++) {
								char checkOne = phraseOnePlayerOne.charAt(l);
								if (phraseOnePlayerOne.charAt(l) == ' ') {
									System.out.print("/");
								} else if (ACCEPTED_CHARACTERS_NOSPACE.indexOf(checkOne) != -1) {
									System.out.print("_ ");
								}
							}
							System.out.print("\r\n");
							System.out.println(playerTwo
									+ ", you can either press (1) to guess a character, or (2) to try to solve.");
							String option = scanner.nextLine();
							if (option != "1" && option != "2") {
								System.out.println("That is not a valid option, try again.");
							}else{
								if (option=="1"){
									System.out.println("Enter a character you want to guess!");
									String guessOne = scanner.nextLine().toUpperCase();
										char checkTwo = guessOne.charAt(0);
										if (ACCEPTED_CHARACTERS.indexOf(checkTwo)!= -1);
								}
							}
							break;
						}

					}
				} else {
					System.out.println(playerTwo + " enter the phrase you want " + playerOne
							+ " to guess. Use only alpha-nuemeric characters.");
					String phraseOnePlayerTwo = scanner.nextLine();
					for (int k = 0; k < phraseOnePlayerTwo.length(); k++) {
						char check = phraseOnePlayerTwo.charAt(k);
						if (ACCEPTED_CHARACTERS.indexOf(check) == -1) {
						}
					}
				}
			}

			/*
			 * for (int i = 0; i<str.length(); i++){ char check = str.charAt(i);
			 * if (ACCEPTED_CHARACTERS.indexOf(check)==-1){
			 * 
			 * }
			 * 
			 * }
			 */

		}
	}
}