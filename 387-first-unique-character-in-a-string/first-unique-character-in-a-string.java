import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> set = new HashMap<>();
        int n = s.length();
        int i =0;
        while(i<n){
            char ch = s.charAt(i);
            set.put(ch, set.getOrDefault(ch, 0) + 1);
            i++;
        }
        i = 0;
        while(i<n){
            if(set.get(s.charAt(i)) ==1)
            return i;
            i++;
        }
        return -1;
    }
}





