class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n =nums2.length;
        int [] arr = new int [m+n];
        int j = 0;
        int i = 0;
        int k = 0;
        
        while(i<m && j<n){
              
        if(nums1[i] < nums2[j]){
            arr[k]=nums1[i];
            k++;
            i++;
        }
        else{
            arr[k]=nums2[j];
            k++;
            j++;
        }
        }
        while(i<m){
        arr[k]= nums1[i];
        i++;
        k++;
        }
        while(j<n){
            arr[k] = nums2[j];
            j++;k++;
        }
        
        int l = m+n;
        if(l%2 == 1){
            return arr[l/2];
          }
        else{
            return(arr[l/2]+arr[(l/2)-1])/2.0;
        }
        }
}
