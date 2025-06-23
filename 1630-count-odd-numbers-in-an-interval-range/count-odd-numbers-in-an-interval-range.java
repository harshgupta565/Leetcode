class Solution {
    public int countOdds(int low, int high) {
        int c=high-low;
        if(high%2==1||low%2==1){
            return c/2+1;
        }
        else{
            return c/2;
        }
     
    }
}