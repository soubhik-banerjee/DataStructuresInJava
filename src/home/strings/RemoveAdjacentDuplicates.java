package home.strings;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "abbcdfbccd";
		StringBuilder sb= new StringBuilder(""+s.charAt(0));
		char prevChar=s.charAt(0);
		
		System.out.println("Original String : "+s);
		
		for(int i=1;i<s.length();i++) {
			char currChar = s.charAt(i);
			if(currChar!=prevChar) {
				sb.append(currChar);
				prevChar = currChar;
			}
		}
		
		System.out.println("Modified String : "+sb.toString());
	}

}
