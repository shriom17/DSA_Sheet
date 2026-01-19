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
//Another Approach;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
