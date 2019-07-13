package home.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringOfDistinctKSize {

	public static void main(String[] args) {
		SubstringOfDistinctKSize obj = new SubstringOfDistinctKSize();
		obj.subStringsKDist("awaglknagawunagwkwagl", 4);
		
		//obj.subStringsKDist("abcd", 3);

	}
	
	private List<String> subStringsKDist(String inputString, int num){
		Set<String> result = new HashSet<>();
		
		if(inputString.length()<num) {
			return new ArrayList<String>(result);
		}
		
		for(int i=0;i<=inputString.length()-num;i++) {
			String strToCheck = inputString.substring(i, i+num);
			if(isSubstringWithDistinctCharacters(strToCheck)) {
				result.add(strToCheck);
			}
		}
		
		System.out.println(result);
		return new ArrayList<String>(result);
		
	}
	
	private boolean isSubstringWithDistinctCharacters(String s) {
		char[] ca = s.toCharArray();
		
		Arrays.sort(ca);
		
		for(int j=0;j<ca.length-1;j++) {
			if(ca[j]==ca[j+1]) {
				return false;
			}
		}
		return true;
	}

}
