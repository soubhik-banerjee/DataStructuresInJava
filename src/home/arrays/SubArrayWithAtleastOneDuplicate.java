package home.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithAtleastOneDuplicate {

	public static void main(String[] args) {

		int [] a = {4,3,4,3};
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		int unique = 0, right=0,window=0;
		
		int n = a.length;
		for(int i=0;i<n;i++) {
			map.put(a[i],1);
		}
		
		int k = map.size();
		map.clear();
		
		for(int left=0;left<n-1;left++) {
			window=0;
			right=left+1;
			map.put(a[left],1);
			while(right<n) {
				if(!map.containsKey(a[right])) {
					map.put(a[right],1);
				}
			}
		}
		
		int totalSubArray = (n*(n+1))/2;
		System.out.println("Number of sub arrays with at least one duplicate elements " + (totalSubArray-unique));
	}

}
