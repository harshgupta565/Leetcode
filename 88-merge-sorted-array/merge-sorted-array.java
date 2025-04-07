class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0 ,i =m ; j<n ; j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}

//add nums2 in nums 1 first and making bith i and j and incresing i index one by one
// and after joining these two arrasy we use arrays.sort to sort this nums1 array