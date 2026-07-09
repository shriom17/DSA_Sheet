class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        int n = intervals.length;
        int start = newInterval[0];
        int end = newInterval[1];
        boolean inserted = false;
        ArrayList<int[]> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];
            
            if(curr_end<start)
            {
                ans.add(intervals[i]);
            }
            
            else if(curr_start>end)
            {
                if(!inserted)
                {
                    ans.add(new int[]{start,end});
                    inserted = true;
                }
                ans.add(intervals[i]);
            }
            
            else 
            {
                start = Math.min(curr_start, start);
                end = Math.max(curr_end, end);
            }  
            
        }
        if(!inserted)
        {
            ans.add(new int[]{start,end});
            inserted = true;
        }
        
        return ans;
    }
}
