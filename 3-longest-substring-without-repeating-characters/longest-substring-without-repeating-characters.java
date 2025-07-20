class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 , j = 0 , maxsum = 0 ;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        while(j<n){
            if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j));
           
            maxsum = Math.max(maxsum,j-i+1);
             j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        } 
        return maxsum;
    }
}