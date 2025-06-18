



class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int [] currInterval = intervals[0];
        ans.add(currInterval);
        for(int [] interval : intervals){
            int currstart = currInterval[0];
            int currend = currInterval[1];
            int nextstart = interval[0];
            int nextend = interval[1];
            if(currend >= nextstart){
                currInterval[1]=Math.max(currend,nextend);
            }
            else{
                currInterval = interval;
                ans.add(currInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}