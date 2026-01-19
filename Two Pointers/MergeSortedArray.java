class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r=m+n;
        int index=0;
        for(int i=m; i<r; i++)
        {
            if(index<n)
            {
                nums1[i] = nums2[index];
                index++;
            }
        }
      
       
       Arrays.sort(nums1);
        return;
    }
}
