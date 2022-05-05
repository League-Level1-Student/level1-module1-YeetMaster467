package _07_duck;

public class Sheep {
	
	private boolean isFriendly;
	private int weight;
	
	Sheep(boolean isFriendly, int weight) {
		this.isFriendly = isFriendly;
		this.weight = weight;
	}
	
	void feedGrain() {
		if(weight > 350) {
			System.out.println("Your sheep is too fat! It needs to go on a diet!");
		}else {
			System.out.println("Yum! It's feeding time! In an instant the grain is gone.");
			weight++;
		}
	}
	
	void pet() {
		if(isFriendly) {
			System.out.println("Your sheep enjoys some good pettings.");
		}else {
			System.out.println("You try to pet your sheep, but it walks away.");
		}
	}
	
}
