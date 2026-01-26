class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int balance=0;
        int maxLength=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==0)
            {
                balance--;
            }
            else
            {
                balance++;
            }
            if(balance==0)
            {
                maxLength = Math.max(maxLength, i+1);
            }
            if(!map.containsKey(balance)) 
            {
                map.put(balance, i);
            }
            else
            {
                maxLength = Math.max(maxLength, i-map.get(balance));
            }
        }
        return maxLength;
    }
}
