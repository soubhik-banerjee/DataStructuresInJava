package home.arrays;

import java.util.Arrays;

public class PrintKMissingNaturalNos {

	public static void main(String[] args) {
		
		int[] arr = { 2, 3, 4 };
        int n = arr.length;
        int k = 3;
        printKMissing(arr, n, k);
	}
	
	static void printKMissing(int[] arr, int n, int k) {
		int res[] = new int[k];
		int j=0;
		int aIndex=0;
		int arrLength = n+k;
		
		for(int i=0;i<arrLength;i++) {
			int no=i+1;
			if(aIndex<n && no!=arr[aIndex]) {
				res[j] = no;
				j++;
			}
			else if(aIndex==n) {
				break;
			}
			else {
				aIndex++;
			}
		}
		if(aIndex<arrLength) {
			aIndex++;
			
			while(aIndex<arrLength) {
				res[j]=aIndex;
				aIndex++;
				j++;
			}
		}
		
		
		System.out.println(Arrays.toString(res));
	}

}
