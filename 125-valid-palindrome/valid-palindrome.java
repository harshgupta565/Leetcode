class Solution {
    public boolean isPalindrome(String s) {
        // isse na sbb character htt jayege bss a  to b  ot 0 to 9 tkk ke chodke 
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(s); 

        int n = s.length();
        for(int i = 0 ; i< n/2 ; i++){
            if(s.charAt(i) != s.charAt (n-i-1))
            return false ;
        }
        return true ;
    }
}