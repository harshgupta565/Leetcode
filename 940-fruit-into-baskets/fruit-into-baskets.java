class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, n = fruits.length;
        int maxx = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (r < n) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }

            maxx = Math.max(maxx, r - l + 1);
            r++;
        }
        return maxx;
    }
}
