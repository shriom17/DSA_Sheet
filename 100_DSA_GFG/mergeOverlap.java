class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        int start = arr[0][0];
        int end = arr[0][1];
        
        for(int i=1; i<arr.length; i++)
        {
            int curr_start = arr[i][0];
            int curr_end = arr[i][1];
            
            if(curr_start<=end)
            {
                start = Math.min(start, curr_start);
                end = Math.max(end, curr_end);
            }
            else
            {
                ans.add(new ArrayList<>(Arrays.asList(start, end)));
                start = curr_start;
                end = curr_end;
            }
        }
        ans.add(new ArrayList<>(Arrays.asList(start, end)));
        return ans;
    }
}
