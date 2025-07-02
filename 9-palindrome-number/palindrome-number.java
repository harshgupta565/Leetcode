class Solution {
    public boolean isPalindrome(int x) {
        int revnum = 0;
        int m = x;
        while(m>0){
        int digit = (m%10);
        revnum = (revnum*10)+digit;
         m= m/10;
        } 
        if(x == revnum){
            return true;
        }
        return false;
    }
}