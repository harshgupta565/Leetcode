class Solution {

    // Approach 1: Pure Recursion (Top-Down, without memoization)
    // Time Complexity: O(2^n) - In the worst case, we make two recursive calls at each index.
    // Space Complexity: O(n) - Recursion call stack depth can go up to n.
    private int decodeRecursion(int index, String s) {
        // Base Case 1: Reached the end of the string, one valid decoding found
        if (index == s.length())
            return 1;

        // Base Case 2: A segment starting with '0' is invalid
        if (s.charAt(index) == '0') {
            return 0;
        }

        // Take one character and move forward
        int ways = decodeRecursion(index + 1, s);

        // Take two characters if they form a valid number (10 to 26)
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ways += decodeRecursion(index + 2, s);
        }

        return ways;
    }

    // Approach 2: Memoization (Top-Down with caching)
    // Time Complexity: O(n) - Each index is computed at most once.
    // Space Complexity: O(n) - Recursion stack + memo array of size n.
    private int decodeMemoization(int index, String s, int[] memo) {
        // Base Case 1: Reached the end of the string
        if (index == s.length())
            return 1;

        // Base Case 2: Segment starts with '0', invalid
        if (s.charAt(index) == '0') {
            return 0;
        }

        // Return already computed result for this index
        if (memo[index] != -1)
            return memo[index];

        // Take one character
        int ways = decodeMemoization(index + 1, s, memo);

        // Take two characters if valid (10 to 26)
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ways += decodeMemoization(index + 2, s, memo);
        }

        return memo[index] = ways;
    }

    // Approach 3: Tabulation (Bottom-Up Dynamic Programming)
    // Time Complexity: O(n)
    // Space Complexity: O(n) - DP array of size n+1
    private int decodeTabulation(String s) {
        int n = s.length();
        if (n == 0)
            return 0;

        int[] dp = new int[n + 1];
        dp[n] = 1; // Empty string has one way to decode

        // Fill dp array from end to start
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                dp[i] = 0; // No decoding starts with '0'
            } else {
                // Take one character
                dp[i] += dp[i + 1];

                // Take two characters if valid (<= 26)
                if (i + 1 < n && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
                    dp[i] += dp[i + 2];
                }
            }
        }

        return dp[0];
    }

    // Approach 4: Space Optimized DP
    // Time Complexity: O(n)
    // Space Complexity: O(1) - Uses only two variables instead of full DP array
    private int decodeSpaceOptimized(String s) {
        int n = s.length();
        if (n == 0) return 0;

        // dp[i+1] and dp[i+2] initially
        int next = 1;   // dp[n], empty string
        int nextNext = 0; // dp[n+1], doesn't exist, set to 0 for clarity

        // Traverse backwards
        for (int i = n - 1; i >= 0; i--) {
            int curr = 0;

            if (s.charAt(i) != '0') {
                curr += next;

                if (i + 1 < n && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
                    curr += nextNext;
                }
            }

            // Shift the values for next iteration
            nextNext = next;
            next = curr;
        }

        return next;
    }

    // Main method
    public int numDecodings(String s) {
        // Uncomment any of the following based on approach you'd like to test:

        // return decodeRecursion(0, s); // Pure Recursion

        // int[] memo = new int[s.length()];
        // Arrays.fill(memo, -1);
        // return decodeMemoization(0, s, memo); // Memoization

        // return decodeTabulation(s); // Tabulation
        
        return decodeSpaceOptimized(s); // Space Optimized
    }
}