class Solution {
    public boolean find132pattern(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    if(nums[i]<nums[k] && nums[k]<nums[j])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// Another Method
import java.util.Stack;

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int second = Integer.MIN_VALUE;   // nums[k]

        for(int i = n-1; i >= 0; i--) {

            if(nums[i] < second) {
                return true;
            }

            while(!st.isEmpty() && nums[i] > st.peek()) {
                second = st.pop();
            }

            st.push(nums[i]);
        }

        return false;
    }
}
