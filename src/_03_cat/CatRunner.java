package _03_cat;

public class CatRunner {

	public static void main(String[] args) {
		Cat fluffles = new Cat("Fluffles");
		fluffles.meow();
		fluffles.printName();
		for(int i=0; i<9; i++) {
			fluffles.kill();
		}
	}

}
