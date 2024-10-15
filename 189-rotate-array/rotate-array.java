import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        //int n = nums.length;
        k = k % nums.length; // Handle cases where k >= n
        int[] temp = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        
        // Copy back to nums
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
