class Solution {
    public int reverse(int x) {
        int  revsnum = 0;
        while(x!=0){
            int d = x % 10;
            if( (revsnum> Integer.MAX_VALUE/10) || (revsnum<Integer.MIN_VALUE/10)){
        return 0;
        }
            revsnum = (revsnum*10)+d;
            x = x/10;
        }
            return revsnum;
         }
       }