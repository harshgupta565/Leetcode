class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 , r = 0 , maxx = 0 , sum = 0;
    int zeros = 0;
        while (r<nums.length){
            if(nums[r]==0)
            zeros = zeros+1;
            if(zeros > k){
                if(nums[l]==0){
                zeros = zeros-1;
                }
                l = l+1;
            }
            if(zeros <=k){
                maxx = Math.max(maxx,r-l+1);
            }
            r=r+1;
        }
        return maxx; 
    }
}