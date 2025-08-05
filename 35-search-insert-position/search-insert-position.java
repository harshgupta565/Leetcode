class Solution {
    public int searchInsert(int[] nums, int target) {
     int l = 0 ; 
    int  n = nums.length;
     while(l<nums.length){
        if(nums[l]==target){
            return l ;
        }
        else{
            int [] temp = Arrays.copyOf(nums,n+1);
             temp[temp.length-1] = target;
             Arrays.sort(temp);
             for(int i = 0 ; i<temp.length ;i++){
                if(temp[i]== target){
                    return i ;
                }
                l++;
             }
        }
     }  
     return -1; 
    }
}