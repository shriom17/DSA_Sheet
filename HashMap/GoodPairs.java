class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<=nums.length-1; j++)
            {
                if(nums[i]==nums[j] && i<j)
                {
                    map.put(i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
//Another Method
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                // Increment count by occurrences seen so far
                count += map.get(num);
                // Increment occurrence count in map
                map.put(num, map.get(num) + 1);
            } else {
                // First occurrence, add to map
                map.put(num, 1);
            }
        }
        return count;
    }
}
