class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        
        int maxProduct = nums[0];  // Stores the maximum product found
        int minProduct = nums[0];  // Stores the minimum product (to handle negative numbers)
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap max and min when encountering a negative number
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }
        return result;
    }
}
