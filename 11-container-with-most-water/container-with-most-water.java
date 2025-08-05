class Solution {
    public int maxArea(int[] height) {
        int l = 0 , r = height.length-1 ;
        int maxsum = 0;
        while(l<r){
            int area = Math.min(height[l], height[r]) * (r-l);
             maxsum = Math.max(maxsum , area);
             if(height[l]<height[r]){
                l=l+1;}
               else{
                r= r-1;
               }
        } 
       return  maxsum ;
    }
}