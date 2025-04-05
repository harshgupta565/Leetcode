class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 0;

        // Total subsets = 2^n
        for (int mask = 0; mask < (1 << n); mask++) {
            int xor = 0;

            for (int i = 0; i < n; i++) {
                // Check if ith bit is set in mask
                if ((mask & (1 << i)) != 0) {
                    xor ^= nums[i];
                }
            }

            total += xor;
        }

        return total;
        
    }
}