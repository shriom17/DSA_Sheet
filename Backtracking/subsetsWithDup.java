class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(),nums,0);
        return resultList;
    }
    private void backtrack(List<List<Integer>>res, List<Integer>temp, int nums[], int start)
    {
        res.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++)
        {
            if(i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
