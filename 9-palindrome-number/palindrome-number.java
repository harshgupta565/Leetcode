class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
         int n = x;
        int revsnum = 0;

        while(n>0){
            int d = n%10;
             revsnum = revsnum*10 + d ;
            n=n/10;
        }
        if(revsnum==x){
            return true ;
        }
        else{
            return false;
        }
    }
}