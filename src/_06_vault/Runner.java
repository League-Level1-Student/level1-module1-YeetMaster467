package _06_vault;

public class Runner {

	public static void main(String[] args) {
		Vault vault = new Vault();
		SecretAgent fred = new SecretAgent();
		int code = fred.findCode(vault);
		System.out.println("The code is " + code);
	}

}
