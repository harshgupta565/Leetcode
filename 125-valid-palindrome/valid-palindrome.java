class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(s); 

        int n = s.length();
        for(int i = 0 ; i< n ; i++){
            if(s.charAt(i) != s.charAt (n-i-1))
            return false ;
        }
        return true ;
    }
}