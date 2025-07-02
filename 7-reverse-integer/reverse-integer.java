// class Solution {
//     public int reverse(int x) {
//         int revnum = 0;
//         int length = (x == 0) ? 1 : (int)Math.log10(Math.abs(x)) + 1;
//         int count = 0;
//         int m =Integer.MAX_VALUE;
//         int n = Integer.MIN_VALUE;
//          if(x  > m && x < n){
//             return 0;}
//         while(count < length ){
//         int digit = x%10;
//          revnum = (revnum*10)+digit;
//         x=x/10;
//         count ++;

        
       
//         }
//         return revnum;

//     }
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before doing rev * 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }
}
