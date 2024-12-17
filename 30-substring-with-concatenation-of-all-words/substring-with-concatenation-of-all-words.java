class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(String str: words){      
            map.put(str, map.getOrDefault(str,0)+1);
        }
        int n = words[0].length();
        int size = words.length;
        int pl = n * size;
        int i = 0;
        int start = 0;
        while(i+pl<=s.length()){
            String wrd = s.substring(i,i+pl);
            start = i; 
            boolean flag = foundPerm(wrd,map, n);
            if(flag){
                result.add(start);

            }
            i+=1;
        }
        return result;
        
    }

    public boolean foundPerm(String wrd, Map<String, Integer> map, int len){
        Map<String,Integer> newMap = new HashMap<String,Integer>();
       // System.out.println("Old :"+map.toString());
        for(int i = 0;i+len<=wrd.length();i+=len){
            String temp = wrd.substring(i,i+len);
           // System.out.println(temp);
             newMap.put(temp, newMap.getOrDefault(temp,0)+1);
        }
       // System.out.println("New map "+newMap.toString());
        if(map.equals(newMap)){
            return true;
        }
        return false;
    }
}