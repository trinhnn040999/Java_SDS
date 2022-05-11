package ex.sds;

import java.util.Random;

public class RandomStringGenerator {
    private final char[] lowerChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private final char[] upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	private int nLength;
	private int mode;
    private String[] lowerCaseChars = new String[26];
    private String[] upperCaseChars = new String[26];;
    private String[] numeeriChars = new String[10];;
	private Random random;
	
	public RandomStringGenerator(int len, int mode) {
		this.nLength = len;
		this.mode = mode;
        random = new Random();
        initializeCharacterClasses();
	}
	private void initializeCharacterClasses(){
        initChars('a', 'z', lowerCaseChars);
        initChars('A', 'Z', upperCaseChars);
        initChars('0', '9', numeeriChars);
    }
    private void initChars(char start, char stop, String[] charArray){
        for(int code = (int) start;code<=(int) stop; code++){
            lowerCaseChars[code-(int) start]= "" + (char) code;
        }
    }
	public String generate() {
        String s ="";
        for(int i=0;i<nLength; i++){
            	//Sinh ra so nguyen ngau nhien
        int randomIndex = genRandomInt(0, lowerCaseChars.length);
        s+=lowerCaseChars[randomIndex];
        }
        return s;
	}
    public String[] getCharArray(int charClass){
        switch(charClass){
            case 0:
            return lowerCaseChars;
            case 1:
            return upperCaseChars;
            case 2:
            return numeeriChars;
        }
        return null;
    }
    private int genRandomInt(int lowInclusive, int hightExclusive){ 
        int randomInt = random.nextInt(hightExclusive);
        return randomInt;
    }
    public String generate(int nUpper){
        
        if(nUpper>nLength) return null;
        if(mode==0 && nUpper>0) return null;
        int countUpper=0;
        int i=0;
        String s="";
        while(i<nLength){
            int charClass = random.nextInt(mode+1);
            if(charClass==1){
                countUpper++;
                if(countUpper>nUpper){
                    continue;
                }
            }
            String[] charArray = getCharArray(charClass);
            s+= charArray[genRandomInt(0, charArray.length)];
            i++;

        }
        return s;
    }
    public String generate(int nUpper, int nNumeric){
        return "";
    }
	
}
