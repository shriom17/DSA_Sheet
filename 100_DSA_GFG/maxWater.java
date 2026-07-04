class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int water = 0;
        int maxWater = 0;
        int height = 0;
        int width = 0;
        int n = arr.length;
        int left = 0;
        int right = n-1;
        
        while(left<right)
        {
            height = Math.min(arr[left], arr[right]);
            width = right - left;
            water = height * width;
            maxWater = Math.max(water, maxWater);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        
        return maxWater;
    }
}
