import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store unique elements from nums1
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        // Add elements from nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }
        
        // Check elements of nums2 for intersection
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num); // Add intersecting element to result set
            }
        }
        
        // Convert resultSet to an array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
