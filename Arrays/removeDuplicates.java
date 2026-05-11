class Solution {
    public int removeDuplicates(int[] nums) {

        // edge case
        if (nums.length <= 2) {
            return nums.length;
        }

        int write = 2;

        for (int read = 2; read < nums.length; read++) {

            // if current element is not same as nums[write-2]
            // then keep it

            if (nums[read] != nums[write - 2]) {

                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}
