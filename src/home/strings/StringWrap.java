package home.strings;

public class StringWrap {

	public static void main(String[] args) {
		String str="abbbbbbbccddaaaaeeeeffffffb"; //a1b7c2d2a4e4f6b1
		
		StringBuilder sb = new StringBuilder();
		int charCount=1;
		char currChar = 0;
		char nextChar = 0;
		
		for(int i=0;i<str.length()-1;i++) {
			currChar = str.charAt(i);
			nextChar= str.charAt(i+1);
			if(currChar==nextChar) {
				charCount++;
			}
			else {
				sb.append(currChar).append(charCount);
				charCount=1;
			}
		}
		
		if(currChar==nextChar) {
			sb.append(currChar).append(charCount);
		}
		if(currChar!=nextChar) {
			sb.append(nextChar).append(charCount);
		}
		
		System.out.println("Original String : "+str);
		System.out.println("Wrapped String : "+sb.toString());
	}

}
