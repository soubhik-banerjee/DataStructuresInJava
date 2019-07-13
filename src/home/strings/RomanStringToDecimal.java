package home.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanStringToDecimal {

	public static void main(String[] args) {
		String roman = "VXMCMIV";
		long decimalVal =0L ;
		Map<Character,Integer> valueMap = new HashMap<>();
		
		valueMap.put('I',1);
		valueMap.put('V',5);
		valueMap.put('X',10);
		valueMap.put('L',50);
		valueMap.put('C',100);
		valueMap.put('D',500);
		valueMap.put('M',1000);
		
		int strLen = roman.length();
		char currChar = 0;
		char nextChar = 0;
		int currCharVal = 0;
		int nextCharVal = 0;
		
		for(int i=0;i<strLen;i++) {
			currChar = roman.charAt(i);
			currCharVal = valueMap.get(currChar);
			
			if(i+1<(strLen)) {
				nextChar = roman.charAt(i+1);
				nextCharVal = valueMap.get(nextChar);
				
				if(nextCharVal>currCharVal) {
					decimalVal=decimalVal+nextCharVal-currCharVal;
					i++;
				}
				else {
					decimalVal=decimalVal+currCharVal;
				}
			}
			else {
				decimalVal=decimalVal+currCharVal;
			}
			
			System.out.println("decimal value in loop is :"+decimalVal);
		}
		
		System.out.println("Decimal value of "+roman+" is : "+decimalVal);
	}

}
