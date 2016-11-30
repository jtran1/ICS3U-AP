package com.bayviewglen.hangman;

import java.util.Scanner;

public class HangManTwo {
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
		String hiddenPhrase = "";
	
		int j = 0;
		
		int i = 0;
		while (i < maxRounds) {
			j = 1;
			while (j < 3) {
				hiddenPhrase = "";
				if (j == 1) {
					String usedChars = "";
					String unused = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
					boolean invalid = true;
					while (invalid) {
						System.out.println(playerOne + " enter the phrase you want " + playerTwo
								+ " to guess. Use only alpha-nuemeric characters.");
						String phraseOnePlayerOne = scanner.nextLine().toUpperCase();						
						while (phraseOnePlayerOne.equals("")) {
							System.out.println("You can not enter nothing, try again.");
							phraseOnePlayerOne = scanner.nextLine().toUpperCase();
						}
						for (int k = 0; k < phraseOnePlayerOne.length(); k++) {
							char check = phraseOnePlayerOne.charAt(k);
							if (ACCEPTED_CHARACTERS.indexOf(check) == -1) {
								System.out.println("your phrase is bad");
								phraseOnePlayerOne = scanner.nextLine().toUpperCase();
								while (phraseOnePlayerOne.equals("")) {
									System.out.println("You can not eneter nothing, try again.");
									phraseOnePlayerOne = scanner.nextLine().toUpperCase();
								}
								k = -1;
							}
						}
						for(int n = 0; n<41; n++){
							System.out.println();
						}
						invalid = false;
						for (int l = 0; l < phraseOnePlayerOne.length(); l++) {
							if (phraseOnePlayerOne.charAt(l) == ' ') {
								hiddenPhrase += "/ ";
							} else {
								hiddenPhrase += "_ ";
							}
						}
						int endOne = 0;
						int guesses = 7;
						while (guesses > 0) {
							boolean invalidOne = true;
							while (invalidOne) {
								System.out.println(hiddenPhrase);
								System.out.println("Press (1) to guess, press (2) to try to solve the phrase. You have "
										+ guesses + " left.");
								String guessOnePlayerOne = scanner.nextLine().toUpperCase();
								
								while (guessOnePlayerOne.equals("")) {
									System.out.println("You can not enter nothing, try again.");
									guessOnePlayerOne = scanner.nextLine().toUpperCase();
								}
								
								for (int m = 0; m < 1; m++) {
									char Num = guessOnePlayerOne.charAt(m);
									if (!guessOnePlayerOne.equals("1") && !guessOnePlayerOne.equals("2")){
										System.out.println("enter (1) or (2)!");
										guessOnePlayerOne = scanner.nextLine().toUpperCase();
										while (guessOnePlayerOne.equals("")) {
											System.out.println("You can not enter nothing, try again.");
											guessOnePlayerOne = scanner.nextLine().toUpperCase();
										}
										m = -1;
									}
								}
								invalidOne = false;
								boolean invalidTwo = true;
								if (guessOnePlayerOne.charAt(0) == '1') {
									while (invalidTwo) {	// teacher - remember to take marks off for this
										System.out.println(unused);
										System.out.println("Which of these characters would you like to guess.");
										String characterOnePlayerOne = scanner.nextLine().toUpperCase();
										for (int w = -1; w<characterOnePlayerOne.length();w++){
										if (characterOnePlayerOne.equals("")){
											System.out.println("You cannot enter nothing, try again.");
											characterOnePlayerOne = scanner.nextLine().toUpperCase();
											w--;
											} 
										}
										for (int l = 0; l < characterOnePlayerOne.length(); l++) {
											char checkOne = characterOnePlayerOne.charAt(l);
											if (characterOnePlayerOne.length()>1){
												System.out.println("Guess only one character.");
												characterOnePlayerOne = scanner.nextLine().toUpperCase();
												l = -1;
											}
											if (ACCEPTED_CHARACTERS_NOSPACE.indexOf(checkOne) == -1){
												System.out.println("your character is invalid, try again.");
												characterOnePlayerOne = scanner.nextLine().toUpperCase();
												l = -1;
											}if (usedChars.indexOf(checkOne) != -1){
												System.out.println("you already guessed this character.");
												characterOnePlayerOne = scanner.nextLine().toUpperCase();
												l = -1;
											}
										}	usedChars += characterOnePlayerOne.charAt(0);
										invalidTwo = false;	
										int indexGuess = unused.indexOf(characterOnePlayerOne);
										unused = unused.substring(0,indexGuess) + "_" + unused.substring(indexGuess+1);
										for (int m = 0;m < phraseOnePlayerOne.length();m++) {
											if (characterOnePlayerOne.charAt(0) == phraseOnePlayerOne.charAt(m)) {
												hiddenPhrase = hiddenPhrase.substring(0,m*2) + characterOnePlayerOne.charAt(0) + hiddenPhrase.substring(2*m+1);
											} 
											
											
										}
										guesses--;
										System.out.println(hiddenPhrase);
										System.out.println("you now have " + guesses + " guesses left.");

									}
								} else if (guessOnePlayerOne.charAt(0) == '2') {
									System.out.println("What phrase would you like to guess?");
									String guessPhraseOnePlayerOne = scanner.nextLine().toUpperCase();
									if (guessPhraseOnePlayerOne.equals(phraseOnePlayerOne)) {
										playerTwoScore += (guesses + 1);
										System.out.println("You've gained " + (guesses+ 1)+ " points.");
										guesses = 0;
									} else {
										guesses--;
										System.out.println("incorrect, you now have " + (guesses) + " guesses left.");
									}
								}

							}
						}

						
						
					}


				}  else if(j == 2){
					String usedChars = "";
					String unused = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
					boolean invalid = true;
					System.out.println(playerTwo + " enter the phrase you want " + playerOne
							+ " to guess. Use only alpha-nuemeric characters.");
					String phraseOnePlayerTwo = scanner.nextLine().toUpperCase();						
					while (phraseOnePlayerTwo.equals("")) {
						System.out.println("You can not enter nothing, try again.");
						phraseOnePlayerTwo = scanner.nextLine().toUpperCase();
					}for (int k = 0; k < phraseOnePlayerTwo.length(); k++) {
						char check = phraseOnePlayerTwo.charAt(k);
						if (ACCEPTED_CHARACTERS.indexOf(check) == -1) {
							System.out.println("your phrase is bad");
							phraseOnePlayerTwo = scanner.nextLine().toUpperCase();
							while (phraseOnePlayerTwo.equals("")) {
								System.out.println("You can not eneter nothing, try again.");
								phraseOnePlayerTwo = scanner.nextLine().toUpperCase();
							}
							k = -1;
						}
					}
						
					invalid = false;
					for (int l = 0; l < phraseOnePlayerTwo.length(); l++) {
						if (phraseOnePlayerTwo.charAt(l) == ' ') {
							hiddenPhrase += "/ ";
						} else {
							hiddenPhrase += "_ ";
						}
					}
					int endOne = 0;
					int guesses = 7;
					while (guesses > 0) {
						boolean invalidOne = true;
						while (invalidOne) {
							System.out.println(hiddenPhrase);
							System.out.println("Press (1) to guess, press (2) to try to solve the phrase. You have "
									+ guesses + " left.");
							String guessOnePlayerTwo = scanner.nextLine().toUpperCase();
							
							while (guessOnePlayerTwo.equals("")) {
								System.out.println("You can not enter nothing, try again.");
								guessOnePlayerTwo = scanner.nextLine().toUpperCase();
							}
							
							for (int m = 0; m < 1; m++) {
								char Num = guessOnePlayerTwo.charAt(m);
								if (!guessOnePlayerTwo.equals("1") && !guessOnePlayerTwo.equals("2")){
									System.out.println("enter (1) or (2)!");
									guessOnePlayerTwo = scanner.nextLine().toUpperCase();
									while (guessOnePlayerTwo.equals("")) {
										System.out.println("You can not enter nothing, try again.");
										guessOnePlayerTwo = scanner.nextLine().toUpperCase();
									}
									m = -1;
								}
							}
							invalidOne = false;
							boolean invalidTwo = true;
							if (guessOnePlayerTwo.charAt(0) == '1') {
								while (invalidTwo) {	// teacher - remember to take marks off for this
									System.out.println(unused);
									System.out.println("Which of these characters would you like to guess.");
									String characterOnePlayerTwo = scanner.nextLine().toUpperCase();
									for (int w = -1; w<characterOnePlayerTwo.length();w++){
										if (characterOnePlayerTwo.equals("")){
											System.out.println("You cannot enter nothing, try again.");
											characterOnePlayerTwo = scanner.nextLine().toUpperCase();
											w--;
											} 
										}
									for (int l = 0; l < characterOnePlayerTwo.length(); l++) {
										char checkOne = characterOnePlayerTwo.charAt(l);
										if (characterOnePlayerTwo.length()>1){
											System.out.println("Guess only one character.");
											characterOnePlayerTwo = scanner.nextLine().toUpperCase();
											l = -1;
										}
										if (ACCEPTED_CHARACTERS_NOSPACE.indexOf(checkOne) == -1){
											System.out.println("your character is invalid, try again.");
											characterOnePlayerTwo = scanner.nextLine().toUpperCase();
											l = -1;
										}if (usedChars.indexOf(checkOne) != -1){
											System.out.println("you already guessed this character.");
											characterOnePlayerTwo = scanner.nextLine().toUpperCase();
											l = -1;
										}
									}	usedChars += characterOnePlayerTwo.charAt(0);
									invalidTwo = false;	
									int indexGuess = unused.indexOf(characterOnePlayerTwo);
									unused = unused.substring(0,indexGuess) + "_" + unused.substring(indexGuess+1);
									for (int m = 0;m < phraseOnePlayerTwo.length();m++) {
										if (characterOnePlayerTwo.charAt(0) == phraseOnePlayerTwo.charAt(m)) {
											hiddenPhrase = hiddenPhrase.substring(0,m*2) + characterOnePlayerTwo.charAt(0) + hiddenPhrase.substring(2*m+1);
										} 
										
										
									}
									guesses--;
									System.out.println(hiddenPhrase);
									System.out.println("you now have " + guesses + " guesses left.");

								}
							} else if (guessOnePlayerTwo.charAt(0) == '2') {
								System.out.println("What phrase would you like to guess?");
								String guessPhraseOnePlayerTwo = scanner.nextLine().toUpperCase();
								if (guessPhraseOnePlayerTwo.equals(phraseOnePlayerTwo)) {
									playerOneScore += (guesses + 1);
									System.out.println("You've gained " + (guesses+ 1)+ " points.");
									guesses = 0;
								} else {
									guesses--;
									System.out.println("incorrect, you now have " + (guesses) + " guesses left.");
								}
							}

						}
					}

					
					
				}
				
				
				
				
				
				
				
				
				
				j++;
					
							
				System.out.println(playerTwo + " you have " + playerTwoScore + "points.");
					System.out.println(playerOne + " you have " + playerOneScore + "points.");
					System.out.println();
					
				}
			
			

			
			i++;
		}boolean invalidThree = true;
		while (invalidThree){
		if (playerOneScore == playerTwoScore){ 
		boolean invalidFour = true;
		while (invalidFour){
			System.out.println("Bonus round!!!");
			
			int q = 1;
			while (q<3){
				hiddenPhrase = "";
			if (q == 1){
				String usedChars = "";
				String unused = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
				boolean invalid = true;
				while (invalid) {
					System.out.println(playerOne + " enter the phrase you want " + playerTwo
							+ " to guess. Use only alpha-nuemeric characters.");
					String phraseOnePlayerOne = scanner.nextLine().toUpperCase();						
					while (phraseOnePlayerOne.equals("")) {
						System.out.println("You can not enter nothing, try again.");
						phraseOnePlayerOne = scanner.nextLine().toUpperCase();
					}
					for (int k = 0; k < phraseOnePlayerOne.length(); k++) {
						char check = phraseOnePlayerOne.charAt(k);
						if (ACCEPTED_CHARACTERS.indexOf(check) == -1) {
							System.out.println("your phrase is bad");
							phraseOnePlayerOne = scanner.nextLine().toUpperCase();
							while (phraseOnePlayerOne.equals("")) {
								System.out.println("You can not eneter nothing, try again.");
								phraseOnePlayerOne = scanner.nextLine().toUpperCase();
							}
							k = -1;
						}
					}
					for(int n = 0; n<41; n++){
						System.out.println();
					}
					
					invalid = false;
					for (int l = 0; l < phraseOnePlayerOne.length(); l++) {
						if (phraseOnePlayerOne.charAt(l) == ' ') {
							hiddenPhrase += "/ ";
						} else {
							hiddenPhrase += "_ ";
						}
					}
					int endOne = 0;
					int guesses = 7;
					while (guesses > 0) {
						boolean invalidOne = true;
						while (invalidOne) {
							System.out.println(hiddenPhrase);
							System.out.println("Press (1) to guess, press (2) to try to solve the phrase. You have "
									+ guesses + " left.");
							String guessOnePlayerOne = scanner.nextLine().toUpperCase();
							
							while (guessOnePlayerOne.equals("")) {
								System.out.println("You can not enter nothing, try again.");
								guessOnePlayerOne = scanner.nextLine().toUpperCase();
							}
							
							for (int m = 0; m < 1; m++) {
								char Num = guessOnePlayerOne.charAt(m);
								if (!guessOnePlayerOne.equals("1") && !guessOnePlayerOne.equals("2")){
									System.out.println("enter (1) or (2)!");
									guessOnePlayerOne = scanner.nextLine().toUpperCase();
									while (guessOnePlayerOne.equals("")) {
										System.out.println("You can not enter nothing, try again.");
										guessOnePlayerOne = scanner.nextLine().toUpperCase();
									}
									m = -1;
								}
							}
							invalidOne = false;
							boolean invalidTwo = true;
							if (guessOnePlayerOne.charAt(0) == '1') {
								while (invalidTwo) {	
									System.out.println(unused);
									System.out.println("Which of these characters would you like to guess.");
									String characterOnePlayerOne = scanner.nextLine().toUpperCase();

									for (int w = -1; w<characterOnePlayerOne.length();w++){
										if (characterOnePlayerOne.equals("")){
											System.out.println("You cannot enter nothing, try again.");
											characterOnePlayerOne = scanner.nextLine().toUpperCase();
											w--;
											} 
										}
									for (int l = 0; l < characterOnePlayerOne.length(); l++) {
										char checkOne = characterOnePlayerOne.charAt(l);
										if (characterOnePlayerOne.length()>1){
											System.out.println("Guess only one character.");
											characterOnePlayerOne = scanner.nextLine().toUpperCase();
											l = -1;
										}
										if (ACCEPTED_CHARACTERS_NOSPACE.indexOf(checkOne) == -1){
											System.out.println("your character is invalid, try again.");
											characterOnePlayerOne = scanner.nextLine().toUpperCase();
											l = -1;
										}if (usedChars.indexOf(checkOne) != -1){
											System.out.println("you already guessed this character.");
											characterOnePlayerOne = scanner.nextLine().toUpperCase();
											l = -1;
										}
									}	usedChars += characterOnePlayerOne.charAt(0);
									invalidTwo = false;	
									int indexGuess = unused.indexOf(characterOnePlayerOne);
									unused = unused.substring(0,indexGuess) + "_" + unused.substring(indexGuess+1);
									for (int m = 0;m < phraseOnePlayerOne.length();m++) {
										if (characterOnePlayerOne.charAt(0) == phraseOnePlayerOne.charAt(m)) {
											hiddenPhrase = hiddenPhrase.substring(0,m*2) + characterOnePlayerOne.charAt(0) + hiddenPhrase.substring(2*m+1);
										} 
										
										
									}
									guesses--;
									System.out.println(hiddenPhrase);
									System.out.println("you now have " + guesses + " guesses left.");

								}
							} else if (guessOnePlayerOne.charAt(0) == '2') {
								System.out.println("What phrase would you like to guess?");
								String guessPhraseOnePlayerOne = scanner.nextLine().toUpperCase();
								if (guessPhraseOnePlayerOne.equals(phraseOnePlayerOne)) {
									playerOneScore += (guesses + 1);
									System.out.println("You've gained " + (guesses+ 1)+ " points.");
									guesses = 0;
								} else {
									guesses--;
									System.out.println("incorrect, you now have " + (guesses) + " guesses left.");
								}
							}

						}
					}

					
					
				}

				
			}else if(q == 2){
				String usedChars = "";
				String unused = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
				boolean invalid = true;
				System.out.println(playerTwo + " enter the phrase you want " + playerOne
						+ " to guess. Use only alpha-nuemeric characters.");
				String phraseOnePlayerTwo = scanner.nextLine().toUpperCase();						
				while (phraseOnePlayerTwo.equals("")) {
					System.out.println("You can not enter nothing, try again.");
					phraseOnePlayerTwo = scanner.nextLine().toUpperCase();
				}for (int k = 0; k < phraseOnePlayerTwo.length(); k++) {
					char check = phraseOnePlayerTwo.charAt(k);
					if (ACCEPTED_CHARACTERS.indexOf(check) == -1) {
						System.out.println("your phrase is bad");
						phraseOnePlayerTwo = scanner.nextLine().toUpperCase();
						while (phraseOnePlayerTwo.equals("")) {
							System.out.println("You can not eneter nothing, try again.");
							phraseOnePlayerTwo = scanner.nextLine().toUpperCase();
						}
						k = -1;
					}
				}
				for(int n = 0; n<41; n++){
					System.out.println();
				}
				invalid = false;
				for (int l = 0; l < phraseOnePlayerTwo.length(); l++) {
					if (phraseOnePlayerTwo.charAt(l) == ' ') {
						hiddenPhrase += "/ ";
					} else {
						hiddenPhrase += "_ ";
					}
				}
				int endOne = 0;
				int guesses = 7;
				while (guesses > 0) {
					boolean invalidOne = true;
					while (invalidOne) {
						System.out.println(hiddenPhrase);
						System.out.println("Press (1) to guess, press (2) to try to solve the phrase. You have "
								+ guesses + " left.");
						String guessOnePlayerTwo = scanner.nextLine().toUpperCase();
						
						while (guessOnePlayerTwo.equals("")) {
							System.out.println("You can not enter nothing, try again.");
							guessOnePlayerTwo = scanner.nextLine().toUpperCase();
						}
						
						for (int m = 0; m < 1; m++) {
							char Num = guessOnePlayerTwo.charAt(m);
							if (!guessOnePlayerTwo.equals("1") && !guessOnePlayerTwo.equals("2")){
								System.out.println("enter (1) or (2)!");
								guessOnePlayerTwo = scanner.nextLine().toUpperCase();
								while (guessOnePlayerTwo.equals("")) {
									System.out.println("You can not enter nothing, try again.");
									guessOnePlayerTwo = scanner.nextLine().toUpperCase();
								}
								m = -1;
							}
						}
						invalidOne = false;
						boolean invalidTwo = true;
						if (guessOnePlayerTwo.charAt(0) == '1') {
							while (invalidTwo) {	
								System.out.println(unused);
								System.out.println("Which of these characters would you like to guess.");
								String characterOnePlayerTwo = scanner.nextLine().toUpperCase();
								for (int w = -1; w<characterOnePlayerTwo.length();w++){
									if (characterOnePlayerTwo.equals("")){
										System.out.println("You cannot enter nothing, try again.");
										characterOnePlayerTwo = scanner.nextLine().toUpperCase();
										w--;
										} 
									}
								for (int l = 0; l < characterOnePlayerTwo.length(); l++) {
									char checkOne = characterOnePlayerTwo.charAt(l);
									if (characterOnePlayerTwo.length()>1){
										System.out.println("Guess only one character.");
										characterOnePlayerTwo = scanner.nextLine().toUpperCase();
										l = -1;
									}
									if (ACCEPTED_CHARACTERS_NOSPACE.indexOf(checkOne) == -1){
										System.out.println("your character is invalid, try again.");
										characterOnePlayerTwo = scanner.nextLine().toUpperCase();
										l = -1;
									}if (usedChars.indexOf(checkOne) != -1){
										System.out.println("you already guessed this character.");
										characterOnePlayerTwo = scanner.nextLine().toUpperCase();
										l = -1;
									}
								}	usedChars += characterOnePlayerTwo.charAt(0);
								invalidTwo = false;	
								int indexGuess = unused.indexOf(characterOnePlayerTwo);
								unused = unused.substring(0,indexGuess) + "_" + unused.substring(indexGuess+1);
								for (int m = 0;m < phraseOnePlayerTwo.length();m++) {
									if (characterOnePlayerTwo.charAt(0) == phraseOnePlayerTwo.charAt(m)) {
										hiddenPhrase = hiddenPhrase.substring(0,m*2) + characterOnePlayerTwo.charAt(0) + hiddenPhrase.substring(2*m+1);
									} 
									
									
								}
								guesses--;
								System.out.println(hiddenPhrase);
								System.out.println("you now have " + guesses + " guesses left.");

							}
						} else if (guessOnePlayerTwo.charAt(0) == '2') {
							System.out.println("What phrase would you like to guess?");
							String guessPhraseOnePlayerTwo = scanner.nextLine().toUpperCase();
							if (guessPhraseOnePlayerTwo.equals(phraseOnePlayerTwo)) {
								playerTwoScore += (guesses + 1);
								System.out.println("You've gained " + (guesses+ 1)+ " points.");
								guesses = 0;
							} else {
								guesses--;
								System.out.println("incorrect, you now have " + (guesses) + " guesses left.");
							}
						}

					}
				}

				
				
			}
			q++;	
			
			}
			
			
			
			
			
			
			
				
		invalidFour = false;	
		}
		}
		if (playerOneScore<playerTwoScore||playerTwoScore<playerOneScore){
			invalidThree = false;
		}
			}
		if (playerOneScore>playerTwoScore){
			System.out.println("Congratulations " + playerOne + " you are the winner!!!!");
		}else{
			System.out.println("Congratulations " + playerTwo + " you are the winner!!!!");
		}
	}
}
