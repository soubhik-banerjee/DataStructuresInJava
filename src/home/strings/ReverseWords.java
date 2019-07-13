package home.strings;

/**
 * 
 * @author Soubhik
 * reverse the entire string.
 * reverse each word in the string, this will reverse till the last but one word.
 * reverse the last word separately.
 *
 */

public class ReverseWords {

	public static void main(String[] args) {
		String st = "The quick brown fox jumps across the lazy dog";
		StringBuilder reversed = new StringBuilder();
		System.out.println("String before reverse--> "+st);
		int start=0,end=0;
		String firstReversal = reverse(st);
		System.out.println("After first reverse--> "+firstReversal);
		for(int i=0;i<firstReversal.length();i++) {
			if(firstReversal.charAt(i)==' ') {
				end=i;
				reversed.append(reverse(firstReversal.substring(start,end)));
				reversed.append(' ');
				start=i+1;
			}
		}
		reversed.append(reverse(firstReversal.substring(start)));
		System.out.println("String after reverse--> "+reversed.toString());
	}
	
	private static String reverse(String st) {
		StringBuilder sb = new StringBuilder(st);
		for(int i=0;i<st.length()/2;i++) {
			char toReplace=sb.charAt(i);
			sb.setCharAt(i, sb.charAt(st.length()-1-i));
			sb.setCharAt(st.length()-1-i, toReplace);
		}
		return sb.toString();
	}

}
