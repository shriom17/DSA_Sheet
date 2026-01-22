class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left = 0;
        int right = n-1;
        int area=0;
        int maxAreaa=0;
        while(left<right)
        {
            area = Math.min(height[left], height[right]) * (right-left);
            maxAreaa = Math.max(area, maxAreaa);
            if(height[left]<height[right])
            {
                left++;
            }
            else if(height[right]<height[left])
            {
                right--;
            }
            else
            {
                left++;
            }
            
        }
        return maxAreaa;
    }
}
