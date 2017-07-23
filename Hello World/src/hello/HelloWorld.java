package hello;

import java.util.*;

public class HelloWorld {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		boolean isPrime = true;
		int userInput = scanner.nextInt();
		int potentialFactor = 2;
		while(userInput % potentialFactor != 0){
			potentialFactor++;
		}		
		
		if(potentialFactor < userInput){
			isPrime = false;
		}
		
		System.out.println("Is your input prime?: " + isPrime);
	}
}
