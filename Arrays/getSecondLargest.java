class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxx=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            maxx=Math.max(maxx,arr[i]);
        }
        int secMax = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<maxx)
            {
                secMax=Math.max(secMax,arr[i]);
            }
           
        }
        
        return secMax;
    }
}
