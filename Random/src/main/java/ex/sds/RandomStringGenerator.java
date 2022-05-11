package ex.sds;

import java.util.Random;

public class RandomStringGenerator {
    private final char[] lowerChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private final char[] upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	private int nLength;
	private int mode;
	private Random random = new Random();
	
	public RandomStringGenerator(int len, int mode) {
		this.nLength = len;
		this.mode = mode;
	}
	
	public String generate() {
		if(nLength <= 0 || mode < 0 || mode > 2)
			return null;
		String res = "";
		int type;
		for(int i = 0; i < nLength; i++) {
			if(mode == 0)
				type = 0;
			else if(mode == 1)
				type = random.nextInt(2);
			else 
				type = random.nextInt(3);
			
			if(type == 0)
				res += lowerChars[random.nextInt(26)];
			else if(type == 1)
				res += upperChars[random.nextInt(26)];
			else
				res += random.nextInt(10);
		}
		
		return res;
	}
	
}
