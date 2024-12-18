class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] lastIndexS = new int[128];
        int[] lastIndexT = new int[128];

        //check if last occurance of both char was on same index
   
        for (Integer i=0;i< t.length() ; i++){
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) t.charAt(i);

            if (lastIndexS[ascii1 - 1] != lastIndexT[ascii2 - 1]     ){
                return false;
            }
            lastIndexS[ascii1 - 1] = i + 1;
            lastIndexT[ascii2 - 1] = i + 1;

        }

        return true;



    }
}