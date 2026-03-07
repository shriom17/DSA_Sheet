class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        double sum=0.0;
        System.arraycopy(nums1, 0, ans, 0, nums1.length );
        System.arraycopy(nums2, 0, ans, nums1.length, nums2.length);
        Arrays.sort(ans);
        int n = ans.length;
        double median = 0.0;
        if(n%2!=0)
        {
            return ans[n/2];
        }
        else
        {
            int m=n/2-1;
            median=(ans[n/2]+ans[m])/2.0;
        }
        return median;
    }
}
