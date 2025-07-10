class Solution {
    public int findPeakElement(int[] nums) {
        int hightest = Integer.MIN_VALUE;
        int maxindex = 0;
        for( int i = 0; i< nums.length ; i++){
            if(nums[i]>hightest ){
                hightest = nums[i];
                maxindex = i ;

            }

            
            }
        return maxindex  ;
    }
}