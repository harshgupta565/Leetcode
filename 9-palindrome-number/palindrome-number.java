class Solution {
    public boolean isPalindrome(int x) {
      int revsersenumber = 0;
      int m = x;
      while(m>0){
        int lastdigit = m%10;
        revsersenumber= (revsersenumber *10)+lastdigit;
        m = m/10;
      }  
      if (revsersenumber == x && x>=0){
         return true ;
      }
      else{
         return false;
      }

    }
}