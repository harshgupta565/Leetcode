class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans = 0;
        for(int i=0;i<=30;i++){
        ans = (int)Math.pow(2,i);
        if(ans == n){
            return true;
        }
        }
            return false;
    }
 }
