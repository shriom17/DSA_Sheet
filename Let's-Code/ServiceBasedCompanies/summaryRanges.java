class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        if (nums.length == 0) {
            return ans;
        }

        int i = 0;

        while (i < nums.length) {

            int start = nums[i];

            while (i < nums.length - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            if (start == end) {
                ans.add(String.valueOf(start));
            } else {
                ans.add(start + "->" + end);
            }

            i++;
        }

        return ans;
    }
}
