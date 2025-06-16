class Solution {
    public int maximum69Number(int num) {
        // Convert the number to a character array
        char[] digits = Integer.toString(num).toCharArray();
        
        // Traverse the array and change the first '6' to '9'
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; // Only
            }
        }
        
        return Integer.parseInt(new String(digits));
    }
}
