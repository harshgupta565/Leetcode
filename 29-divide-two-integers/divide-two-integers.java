class Solution {
    public int divide(int dividend, int divisor) {
        // Step 1: Handle edge case overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;  // Overflow case
        }
        
        // Step 2: Determine the result's sign
        boolean negative = (dividend < 0) ^ (divisor < 0);  // XOR to check if signs are different

        // Step 3: Work with absolute values (for ease of division)
        long absDividend = Math.abs((long) dividend);  // Convert to long to handle edge cases
        long absDivisor = Math.abs((long) divisor);

        // Step 4: Calculate quotient using optimized subtraction (doubling the divisor)
        int quotient = 0;
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            long multiple = 1;
            
            // Double the divisor (tempDivisor) until it's greater than the dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            // Subtract the largest doubled divisor from the dividend
            absDividend -= tempDivisor;
            quotient += multiple;
        }

        // Step 5: Apply the sign to the result
        return negative ? -quotient : quotient;
    }
}
