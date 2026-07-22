class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int count=1;
        int index=1;
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int missing = arr[mid]-(mid+1);
            
            if(missing<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        
        return left+k;
    }
}
