class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int k = n - 1;

        // find earliest index from where suffix is strictly increasing
        while (k > 0 && nums[k - 1] < nums[k]) {
            k--;
        }

        return k;
    }
}
©leetcode
