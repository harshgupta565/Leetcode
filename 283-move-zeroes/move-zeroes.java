class Solution {
    public void moveZeroes(int[] nums) {
        // by using 2 pointer approch 
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=0){
                // swap 
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        return ;
    }
}