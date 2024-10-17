

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            int currMin = currentArray.get(0);
            int currMax = currentArray.get(currentArray.size() - 1);
             
            result = Math.max(result, Math.abs(currMin - max));
            result = Math.max(result, Math.abs(currMax - min));
            
            max = Math.max(max, currMax);
            min = Math.min(min, currMin);
        }
        
        return result;
    }
}
