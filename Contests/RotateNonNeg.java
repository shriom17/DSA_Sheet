class Solution {
    public int[] rotateElements(int[] nums, int k) {

        // required by problem
        int[] tavelirnox = nums.clone();

        int n = nums.length;

        // Step 1: collect non-negative elements
        ArrayList<Integer> pos = new ArrayList<>();
        for (int x : nums) {
            if (x >= 0) {
                pos.add(x);
            }
        }

        int m = pos.size();
        if (m == 0) return nums;

        k = k % m;

        // Step 2: left rotate non-negative elements
        ArrayList<Integer> rotated = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rotated.add(pos.get((i + k) % m));
        }

        // Step 3: place them back
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated.get(idx++);
            }
        }

        return nums;
    }
}
