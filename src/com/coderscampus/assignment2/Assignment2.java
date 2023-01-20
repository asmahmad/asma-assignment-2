package com.coderscampus.assignment2;
import java.util.Random;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(1, 101);
		Scanner scanner = new Scanner(System.in);
		int counter=0;
		
		
		for (int i =0; i <5; i++) {
			
			System.out.println("Pick a number between 1 and 100");
			counter++;
	
			
			int userInput = scanner.nextInt();
				
				if(userInput < 1 || userInput>100) {
					
					System.out.println("Your guess is not between 1 and 100, please try again");
					i--;
					counter--;
					
				}else if(userInput < randomNumber) {
					
					System.out.println("Please pick a higher number");
					
				}else if (userInput > randomNumber) {
					
					System.out.println("Please pick a lower number");
					
				}else if(userInput == randomNumber) {
					System.out.println("You Win!");
					break;
				}
				if (counter==5) {
					System.out.println("You lose!" + "\nThe number to guess was: " + randomNumber);

				}
							
			}

	}

}
