package home.arrays;

class Solution {
	
	public static void main(String []a) {
		int[] nums = {1};
		System.out.println("Max ones : "+new Solution().findMaxConsecutiveOnes(nums));
		
		
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxSeq=0;
        int currMax=0;
        for (int k=0;k<nums.length;k++){
            if(nums[k]==1){
                currMax=currMax+nums[k];
                if(currMax>maxSeq){
                   maxSeq = currMax; 
                }
            }
            else{
                currMax=0;
            }
        }
        return maxSeq;
    }
    
}