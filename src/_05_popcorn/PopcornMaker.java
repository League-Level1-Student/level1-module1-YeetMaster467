package _05_popcorn;

import java.util.Scanner;

public class PopcornMaker {

	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		System.out.println("\nWhat flavor of popcorn do you want?");
		String flavor = getInputFromUser();
		System.out.println("\nHow many minutes do you want to cook your popcorn?");
		String minutesString = getInputFromUser();
		System.out.println(" ");
		int minutes = Integer.parseInt(minutesString);
		
		Popcorn popcorn = new Popcorn(flavor);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		microwave.startMicrowave();
		
	}

	static String getInputFromUser() {
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
}
