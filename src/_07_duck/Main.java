package _07_duck;

public class Main {
	
	public static void main(String[] args) {
		Duck donald = new Duck("bacon", 32767);
		donald.quack();
		donald.waddle();
		
		System.out.println(" ");
		
		Sheep sherry = new Sheep(true, 220);
		sherry.feedGrain();
		sherry.pet();
	}
}
