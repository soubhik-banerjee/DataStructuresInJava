package home.strings;

/**
 * 
 * @author Soubhik
 * String to Integer - initialize the final result to 0
 * 					   iterate over the characters.
 * 					   convert each char to int(intValue) by getting the diff of the char and '0'
 * 					   get the result as res*10+intValue
 *
 */

public class StringToIntegerToString {

	public static void main(String[] args) {
		String strNum = "10500";
		int num=10500;
		stringToInteger(strNum);
		integerToString(num);
	}
	
	private static void stringToInteger(String str) {
		long res =  0L;
		int strLength = str.length();
		for(int i=0;i<strLength;i++) {
			char c=str.charAt(i);
			int placeVal = c-'0';
			res = (res*10)+placeVal;
		}
		System.out.println("Value of "+str+" to integer is :"+res);
	}
	
	private static void integerToString(int numb) {
		StringBuilder sb = new StringBuilder();
		while(numb>0) {
			sb.append(numb%10);
			numb = numb/10;
		}
		System.out.println("Value of number "+numb+" in string is :"+sb.reverse().toString());
	}
}
