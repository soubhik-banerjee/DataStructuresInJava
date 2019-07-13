package home.arrays;

public class LongestSubArrayWithExactKOddNos {

	public static void main(String[] args) {
		//int arr[] = {2, 3, 4, 11, 4, 12, 7};
		int arr[] = {2, 4, 4, 12};
        int n = arr.length;
        int k = 1;
        longSubarrWithKOddNum(arr, n, k);
	}
	
	 static void longSubarrWithKOddNum(int arr[], int n,int k) {
		 int currOddCount=0;
		 int currStart=0;
		 int currEnd=0;
		 
		 int maxOddCount=0;
		 int maxStart=0;
		 int maxEnd=0;
		 
		 while(currEnd<n) {
			 if(arr[currEnd]%2!=0) {
				 currOddCount++;
			 }
			 
			 if(currOddCount>k) {
				 while(currOddCount>k) {
					 if(arr[currStart]%2!=0) {
						 currOddCount--;
					 }
					 currStart++;
				 }
			 }
			 
			 if(currOddCount==k) {
				 if(maxOddCount<(currEnd-currStart+1)) {
					 maxOddCount = currEnd-currStart+1;
					 maxStart = currStart;
					 maxEnd = currEnd;
				 }
			 }
			 
			 currEnd++;
		 }
		 
		 if(currOddCount!=k) {
			 System.out.println("No sub array with k odd nos");
		 }
		 else {
			 System.out.println("sub array with k odd nos from "+maxStart+" to "+maxEnd+" and length is "+(maxOddCount));
			 
		 }
	 }

}
