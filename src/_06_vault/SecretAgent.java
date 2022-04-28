package _06_vault;

public class SecretAgent {
	
	public int findCode(Vault v) {
		for(int i=0; i<=1000000; i++) {
			boolean codeWorks = v.tryCode(i);
			if(codeWorks) {
				return i;
			}
		}
		return -1;
	}
	
}
