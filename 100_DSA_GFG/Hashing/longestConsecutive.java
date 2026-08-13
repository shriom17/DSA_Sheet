class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans=1;
        int c=1;
        //HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=arr.length-1; i++)
        {
            if(arr[i]-arr[i-1]==1)
            {
                c++;
            }
            else if(arr[i]==arr[i-1])
            {
                continue;
            }
            else
            {
                c=1;
            }
            
            ans = Math.max(ans,c);
        }
        
        return ans;
    }
}
