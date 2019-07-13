package home.arrays;

public class LargestSumSubArray {

	public static void main(String[] args) {
		int[] arr ={ 4, 3, -5, 0, 6, -8, 12, 3, -9, 2, 5, 8, -3, 4, 8, 0, 3, -3, -5, -9,4, 2 };
		maxSumSubArray(arr);
	}

	private static void maxSumSubArray(int[] arr){

		int currStart=0;
		int currEnd=0;
		int currSum = 0;
		int maxStart = 0;
		int maxEnd = 0;
		int maxSum = 0;
		
		while(currEnd<arr.length) {
			currSum = currSum+arr[currEnd];
			if(currSum>maxSum) {
				maxSum=currSum;
				maxStart = currStart;
				maxEnd = currEnd;
			}
			else {
				currStart = currEnd+1;
				currSum=0;
			}
			currEnd++;
		}
		
		System.out.println("Max Sum = "+maxSum);
		System.out.println("Max start and Max end : "+maxStart+","+maxEnd);
	}

}
