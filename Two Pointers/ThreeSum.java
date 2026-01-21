class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> alu = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int end = n - 1;

            while (left < end) {
                int sum = nums[i] + nums[left] + nums[end];

                if (sum == 0) {
                    alu.add(Arrays.asList(nums[i], nums[left], nums[end]));

                    // duplicate skip
                    while (left < end && nums[left] == nums[left + 1]) left++;
                    while (left < end && nums[end] == nums[end - 1]) end--;

                    left++;
                    end--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    end--;
                }
            }
        }
        return alu;
    }
}
