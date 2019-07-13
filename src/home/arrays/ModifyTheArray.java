package home.arrays;

import java.io.IOException;

public class ModifyTheArray {

	public static void main(String[] args) throws IOException {
		String s[] = "1,2,3,4,5,6,10,8,9,8,10,5,6,3,4,7,2".split(",");
		StringBuilder sb = new StringBuilder();
		int i = 4;
		int j = 2;
		int step=i-1;
		int endIndex=step;
		int sLen = s.length-1;
		for(int k=0;k<=sLen;) {
			if(k<=endIndex) {
				sb.append(String.valueOf(s[k]));
				if(k!=sLen) {
					sb.append(",");
				}
				
				k++;
			}
			else {
				k = k+j;
				endIndex = k+step;
			}
		}
		
		if(sb.charAt(sb.length()-1)==',') {
			sb.deleteCharAt(sb.length()-1);
		}
		
		System.out.println(sb.toString());
		
	}

}
